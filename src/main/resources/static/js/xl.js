var condition = null;
var param = null;
var url = null;
var param = null;
var talkcontent = '';
var use_id = null;
var talkphoto = null;


//页面加载
$(document).ready(function(){
	$("#col1").hide();
	//隐藏用户id
	$('.use_id').val($.cookie("use_id"));
	$("#use_id").html($.cookie("use_id"));
	$("#use_id").hide();
	$(".use_id").hide();
	//页面加载时处于点击状态
	$("#bt2").click();

	//显示用户登录信息
    if($.cookie("account")!=null){
    $("#log").hide();
    $("#account").html(decodeURIComponent($.cookie("account"))+",欢迎您！");
    }else{
      $("#account").hide();
      $("#quit").hide();
    };
    
    //单击退出，清空cookie并刷新页面
$("#quit").click(function(){
	$.removeCookie('account',{path:"/xy_ssh"});
	$.removeCookie('use_id',{path:"/xy_ssh"});
	window.location.href="index.html";
});

    //单击用户名，进入个中心
$("#account").click(function(){
	window.location.href="yj.html";
});
  });

//单击查询动态
$("#bt2").click(function(){
	url="/xy_ssh/Talk_get";
	condition = $("#condition").val();
	param = {"condition":condition};
	talkRequest();
});

$("#bt3").attr('disabled',true);//设置按钮为不可点击状态
$("#talkcontent").bind('input propertychange',function(){
	//去掉前后空格
	talkcontent = $.trim($("#talkcontent").val());
	//发表不能为空
	if(talkcontent==''){
		$("#bt3").attr('disabled',true);
	}else{
		$("#bt3").attr('disabled',false);
	}
});

//心情分享ajax请求
function talkRequest(){
	$.post(url,param,function(data){
		var json = JSON.parse(data);
		var obj = JsonSort(json,'talk_id'); 
		var nav = "";
		for (var i in obj){
			//样式写入
			nav+="<div><span>用户id:</span><span class=\"spn1\">"+obj[i].use_id+"</span><span>&nbsp;&nbsp;用户账号:</span><span>"+obj[i].account+"</span>";
			nav+="<br><span>发布时间："+obj[i].talktime+"</span>";
			nav+="<br><span>来自于:"+obj[i].school+"</span>";
			nav+="<span class=\"spn2\">"+obj[i].talk_id+"</span>";
			nav+="<p id=\"content\" style=\"background-color:rgb(195,195,195);\">"+obj[i].talkcontent+"</p>";
			nav+="<img src="+obj[i].talkphoto+" style=\"width:250px;height:400px;\" class=\"uuu\"><br>";
			nav+="<button class=\"bt4\"><img src=\"images/delete.png\">删除</button>";
			nav+="&nbsp;&nbsp;<button class=\"bt5\"><img src=\"images/collect.png\">收藏</button>";
			nav+="&nbsp;&nbsp;<button class=\"bt6\"><img src=\"images/reply.png\">评论</button>";
			nav+="<div class=\"reply\"><br><img src=\"images/people.png\"><input type=\"text\" class=\"replycontent\">";
			nav+="<button class=\"bt7\">回复</button><div class=\"replytalk\"></div></div></div><br><br>";
		}
		//清空内容
		$("#talkcontent").val("");
		$("#bt3").attr('disabled',true);
		//显示发布的内容
		$("#center-bottom").html(nav);
		//隐藏发布的编号
		$(".spn2").hide();
		//单击删除指定的分享
		$(".bt4").click(function(){
			//用户确认删除
			if($.cookie("use_id")==$(this).siblings(".spn1").text()){
				if(confirm("确认要删除？")){
				url="/xy_ssh/Talk_delete";
				use_id=$("#use_id").text();
				talk_id = $(this).siblings(".spn2").text();
				param = {"use_id":use_id,"talk_id":talk_id};
				talkRequest();
						}
			}else{
				alert("您不能删除其他用户发布的内容哟");
			}
		});
		
		//添加收藏
		$(".bt5").click(function(){
			use_id=$("#use_id").text();
			talk_id = $(this).siblings(".spn2").text();
			talkphoto =$(this).siblings(".uuu").attr('src');
			var collectcontent = $(this).siblings("#content").text();
			$.ajax({
				url:"/xy_ssh/TalkCollect_add",
				type:"post",
				data:{
					'collectcontent':collectcontent,
					'use_id':use_id,
					'talk_id':talk_id,
					'talkphoto':talkphoto
				},
				datatype:'json',
				success:function(data){
					if(data){
						alert("收藏成功");
					}else{
						alert("收藏失败")
					}
				}
			});
		});
		//评论输入框的隐藏
		$(".reply").hide();
		
		//单击评论按钮，显示回复输入框与相关回复
		$(".bt6").click(function(){
			if($(this).next(".reply").css("display")=="none"){
				$(this).next(".reply").show();
				}else{
					$(this).next(".reply").hide();
				}
			url="/xy_ssh/ReplyTalk_get";
			var talk_id = $(this).siblings(".spn2").text();
			param={"talk_id":talk_id};
			replycontentRequest(this,1);
		});
//评论的Ajax请求
		function replycontentRequest(bts,flag){
			$.post(url,param,function(data){
				var replyjson = JSON.parse(data);
				var nav1 = "";
				for (var i in replyjson){
					//样式写入
					nav1+="<div class=\"replytalk\">";
					nav1+="<a class=\"replyuse_id\">"+replyjson[i].use_id+":</a>";
					nav1+="<a>"+replyjson[i].account+":</a>";
					nav1+=replyjson[i].replycontent+"</div>";
				}
				//写入到特定的div中
				if(flag==1){
					$(bts).siblings(".reply").children(".replytalk").html(nav1);
				}
				if(flag==2){
					$(bts).siblings(".replytalk").html(nav1);
				}
			});
		}
		
		//将按钮设为不能点击状态
		$(".bt7").attr('disabled',true);
		$(".bt7").css("background","#FFC09F");
		//监听输入框的变化
		$(".replycontent").bind('input propertychange',function(){
			//去掉前后空格
			var replycontent = $.trim($(this).val());
			//发表不能为空
			if(replycontent==''||replycontent==null){
		    	$(".bt7").attr('disabled',true);
		    	$(".bt7").css("background","#FFC09F");
			}else{
				$(".bt7").attr('disabled',false);
				$(".bt7").css("background","rgb(93,149,249)");
			}
		});	

		//单击回复
		$(".bt7").click(function(){
			var replycontent=null;
			var talk_id=null;
			use_id=$("#use_id").text();
			talk_id=$(this).parent(".reply").siblings(".spn2").text();
			replycontent=$(this).siblings(".replycontent").val();
			param = {"use_id":use_id,"talk_id":talk_id,"replycontent":replycontent};
			url="/xy_ssh/ReplyTalk_add";
			$.ajaxSetup({
		        async: false
		    });
			$.post(url,param,function(data){});
			param = {"talk_id":talk_id};
			url="/xy_ssh/ReplyTalk_get";
			replycontentRequest(this,2);
			$(".replycontent").val("");
		});
	});
}

//将json字符串按key进行排序
function JsonSort(json,key){
    //console.log(json);
    for(var j=1,jl=json.length;j < jl;j++){
        var temp = json[j],
            val  = temp[key],
            i    = j-1;
        while(i >=0 && json[i][key]<val){
            json[i+1] = json[i];
            i = i-1;    
        }
        json[i+1] = temp;
        
    }
    return json;
};

//点击查看我的收藏
$(".list-group-item").click(function(){
	$("#bt2").hide();
	$("#col1").show();
	$("#center-right").hide();
	$("#two").addClass("active");
	$("#one").removeClass("active");
	condition = $("#condition").val();
	use_id = $.cookie("use_id");
	if($("#condition").val() != null){
		condition = $("#condition").val();
	  }else{
	    condition = null;
	  }
	url="/xy_ssh/TalkCollect_find";
	param={'condition':condition,'use_id':use_id};
	collectRequest();
});
//单击搜索收藏
$("#col1").click(function(){
	condition = $("#condition").val();
	use_id = $.cookie("use_id");
	if($("#condition").val() != null){
		condition = $("#condition").val();
	  }else{
	    condition = null;
	  }
	url="/xy_ssh/TalkCollect_find";
	param={'condition':condition,'use_id':use_id};
	collectRequest();
});
function collectRequest(){
	$.post(url,param,function(data){
		var json = JSON.parse(data);
		var obj = JsonSort(json,'collecttime'); 
		var nav = "";
		for (var j in obj){
			//样式写入
			nav+="<div><div>收藏时间-----"+obj[j].collecttime+"</div>";
			nav+="<div style=\"background-color:rgb(175,211,252);\">收藏内容："+obj[j].collectcontent+"</div>";
			nav+="<img src="+obj[j].photo+" style=\"width:250px;height:400px;\">";
			nav+="<span class=\"getid\" style=\"display:none\">"+obj[j].talk_id+"</span>";
			nav+="<br><div style=\"float:right;\" class=\"ddd\"><span>删除</span></div></div><br>";
		}
		$("#collectcontent").html(nav);
		//单击删除按钮删除指定回复
		$(".ddd").click(function(){
			talk_id = $(this).siblings(".getid").text();
			use_id = $.cookie("use_id");
			url="/xy_ssh/TalkCollect_delete";
			param = {"talk_id":talk_id,'use_id':use_id};
			collectRequest();
			location.reload();
		});
	});
}