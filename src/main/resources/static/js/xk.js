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