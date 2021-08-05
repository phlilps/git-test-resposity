// <%--jQuery初始化函数--%>
$(document).ready(function () {
    //点击登录按钮，触发一个点击事件
    $("#submit").click(function () {
        /*
        * 登录功能做题思路：
        * 1、获取用户名和密码的值
        * 2、对用户名和密码的值进行非空判断
        * 3、   如果用户名和密码是空的，则把错误信息“用户名和密码不能为空”显示出来
        *       如果用户名和密码不为空，则把用户名和密码传递到服务端实现登录功能
        * */
        //获取用户名.    trim()：去除两边的空格
        var username= $("#username").val().trim();
        //获取密码
        var pwd= $("#password").val().trim();
        var input=$("label input").is(':checked');
        //控制台输出
        console.log(username+" ****** "+pwd  );
        //对用户名和密码进行非空判断
        if(username.length==0 || pwd.length==0){
            //把错误信息显示出来
            $("#errorMessage").html("用户名或密码不能为空！")
        }
        else {//把用户名和密码传递到服务端
            $.ajax({
                type:"post",//请求方式
                url:"user/login",//访问请求路径
                data:{"username":username,"password":pwd,input:input},//数据传递
                dataType:'json',//数据响应返回类型
                success:function (result) {//成功回调函数
                    if (result!=null){
                        // 登录成功跳转首页
                        window.location.href = 'pages/main.jsp';
                    }else {
                        // 登录失败跳转重新登录
                        alert("登录失败！密码错误或者用户不存在，重新登录")
                        window.location.href = 'login.jsp';
                    }

                },
                error:function () {//失败回调函数
                    alert("登录失败！密码错误或者用户不存在，重新登录")
                }
            });
        }

    });
});