 var url=null;
	var condition=null;
	var param=null;
	var jsonObj = null;	
	var Use_id=null;
	var nickName=null;
	var perSign=null;
	var sex=null;
	var birth=null;
	var homeTown=null;
	var school=null;
	var academy=null;
	var major=null;
	var entryYear=null;
	var hobby=null;
	var oldpassWord=null;
	var newpassWord=null;
	
	//加载网页时加载用户信息
    $(document).ready(function(){
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
	
	//显示用户信息
    $(document).ready(function(){
		condition = $.cookie("use_id");
		/* $("#a").val(condition);
		$("#b")[0].innerHTML = condition; */
		if(condition != null){
		    param = "{\"condition\":\""+condition+"\"}";
		  }else{
		    param = null;
		  }
		jsonObj = JSON.parse(param);
		a();
	});
	function a(){
		  	$.ajax({
			  	url:"/xy_ssh/user_get",
			  	type:"post",
			  	//data:$("#condition").serialize(),
			  	data:jsonObj,
			  	datatype:"json",
			  	success:function(data){
			  		var a = JSON.parse(data);
			      	$("#use_id")[0].innerHTML=a[0].use_id;
			      	$("#nickName").val(a[0].nickName);
			      	$("#perSign").val(a[0].perSign);
			      	$("#sex").val(a[0].sex);
			      	$("#birth").val(a[0].birth);
			      	$("#homeTown").val(a[0].homeTown);
			      	$("#school").val(a[0].school);
			      	$("#academy").val(a[0].academy);
			      	$("#major").val(a[0].major);
			      	$("#entryYear").val(a[0].entryYear);
			      	$("#hobby").val(a[0].hobby);
			  	}
		  });
};
     $(document).ready(function(){
	    $("#save").click(function(){
	    use_id=$.cookie("use_id");
		nickName=$("#nickName").val();
		perSign=$("#perSign").val();
		sex=$("#sex").val();
		birth=$("#birth").val();
		homeTown=$("#homeTown").val();
		school=$("#school").val();
		academy=$("#academy").val();
		major=$("#major").val();
		entryYear=$("#entryYear").val();
		hobby=$("#hobby").val();
		b();
	});
	});
    	 function b(){
 		  	$.ajax({
 			  	url:"/xy_ssh/user_edit",
 			  	type:"post",
 			  	//data:$("#condition").serialize(),
 			  	data:{
 			  		'use_id':use_id,
 			  		'nickName':nickName,
 			  		'perSign':perSign,
 			  		'sex':sex,
 			  		'birth':birth,
 			  		'homeTown':homeTown,
 			  		'school':school,
 			  		'academy':academy,
 			  		'major':major,
 			  		'entryYear':entryYear,
 			  		'hobby':hobby,
 			  		'condition':use_id
 			  		},
 			  	datatype:"json",
 			  	success:function(data){
 			  		var a = JSON.parse(data);
 			  		$("#use_id")[0].innerHTML=a[0].use_id;
			      	$("#nickName").val(a[0].nickName);
			      	$("#perSign").val(a[0].perSign);
			      	$("#sex").val(a[0].sex);
			      	$("#birth").val(a[0].birth);
			      	$("#homeTown").val(a[0].homeTown);
			      	$("#school").val(a[0].school);
			      	$("#academy").val(a[0].academy);
			      	$("#major").val(a[0].major);
			      	$("#entryYear").val(a[0].entryYear);
			      	$("#hobby").val(a[0].hobby);
			      	alert("已保存");
			      	$("#tipBirth")[0].innerText="";
			      	$("#tipEntryYear")[0].innerText="";
 			  	}
 		  });
 };
 
 //修改密码
 $(document).ready(function(){
	    $("#save1").click(function(){
	    account=$.cookie("account");
		oldpassWord=$("#oldpassWord").val();
		newpassWord=$("#newpassWord").val();
		c();
	});
	});
 function c(){
	 $.ajax({
		 url:"/xy_ssh/user_PassWordEdit",
		 type:"post",
		 datatype:"json",
		 data:{
			 'account':account,
			 'passWord':oldpassWord,
			 'newpassWord':newpassWord
		 },
	 success:function(data){
		 if(data=="1"){
			 alert("修改成功，下次请使用新密码登录");
		 }else{
			 alert("原密码输入错误");
		 }
		 $("#oldpassWord").val("");
		 $("#newpassWord").val("");
	 }
	 })
 }
 
 //意见反馈
 $(document).ready(function(){
	    $("#save2").click(function(){
	    use_id=$.cookie("use_id");
	    suggestcontent=$("#suggestcontent").val();
		d();
	});
	});
 function d(){
	 $.ajax({
		 url:"/xy_ssh/suggest_add",
		 type:"post",
		 datatype:"json",
		 data:{
			 'use_id':use_id,
			 'suggestcontent':suggestcontent,
		 },
	 success:function(data){
		 if(data){
			 alert("发布成功");
		 }else{
			 alert("发布失败");
		 }
		 $("#suggestcontent").val("");
	 }
	 })
 }
 
 //判断输入的时间格式是否正确
 function judgeBirth(){
		var reg = /^\d{4}-\d{1,2}-\d{1,2}/;
		if(reg.test($("#birth").val())){
			$("#tipBirth")[0].innerText="输入正确";
			}else{
				$("#tipBirth").css({"color":"red"});
				$("#tipBirth")[0].innerText="生日输入错误";
			}
	};
 function judgeEntryYear(){
		var reg = /^\d{4}-\d{1,2}-\d{1,2}/;
		if(reg.test($("#entryYear").val())){
			$("#tipEntryYear")[0].innerText="输入正确";
			}else{
				$("#tipEntryYear").css({"color":"red"});
				$("#tipEntryYear")[0].innerText="入学年份输入错误";
			}
	};
	
	//查看我的收藏
	$(document).ready(function(){
		use_id = $.cookie("use_id");
		condition = null;
		url="/xy_ssh/talkCollect_get";
		param={'condition':condition,'use_id':use_id};
		collectRequest();
	});
	//获得享聊收藏
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
				nav+="<span class=\"getid\">"+obj[j].talk_id+"</span>";
				nav+="<br><div style=\"float:right;\" class=\"ddd\"><span>删除</span></div></div><br>";
			}
			$("#list").html(nav);
			//单击删除按钮删除指定收藏
			$(".ddd").click(function(){
				talk_id = $(this).siblings(".getid").text();
				use_id = $.cookie("use_id");
				url="/xy_ssh/TalkCollect_delete";
				param = {"talk_id":talk_id,'use_id':use_id};
				collectRequest();
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