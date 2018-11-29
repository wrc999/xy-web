layui.use(['form','layer','jquery'],function(){
    var form = layui.form,
        layer = parent.layer === undefined ? layui.layer : top.layer
        $ = layui.jquery;

    $(".loginBody .seraph").click(function(){
        // layer.msg("这只是做个样式，至于功能，你见过哪个后台能这样登录的？还是老老实实的找管理员去注册吧",{
        //     time:5000
        // });
    })

    //登录按钮
    form.on("submit(login)",function(data){
        var btn = $(this);
        //btn.text("登录中...").attr("disabled","disabled").addClass("layui-disabled");
        // setTimeout(function(){
        //     window.location.href = "../../index.html";
        // },1000);
        // //弹出loading
        var index = top.layer.msg('登录中，请稍候',{icon: 16,time:false,shade:0.8});
        // 提交信息
        $.ajax({
            url:'admin/login',
            data:{
                account:$("#userName").val(),
                passWord:$("#password").val()
            },
            type:'post',
            success:function(data){
                if(data){
                    top.layer.close(index);
                    top.layer.msg("登录成功！");
                    layui.sessionData('userInfo', {
                        key: 'account'
                        ,value: data
                    });
                    setTimeout(function(){
                        window.location.href = "admin/admin.html";
                    },500);
                }else{
                    top.layer.msg("账号密码错误");
                }
            }
        });
        return false;
    })

    //表单输入效果
    $(".loginBody .input-item").click(function(e){
        e.stopPropagation();
        $(this).addClass("layui-input-focus").find(".layui-input").focus();
    })
    $(".loginBody .layui-form-item .layui-input").focus(function(){
        $(this).parent().addClass("layui-input-focus");
    })
    $(".loginBody .layui-form-item .layui-input").blur(function(){
        $(this).parent().removeClass("layui-input-focus");
        if($(this).val() != ''){
            $(this).parent().addClass("layui-input-active");
        }else{
            $(this).parent().removeClass("layui-input-active");
        }
    })
})
