<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>超市订单管理系统</title>

    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"
          name="viewport">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">

    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css">
    <script
            src="${pageContext.request.contextPath}/plugins/jQuery/jquery-2.2.3.min.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.min.js"></script>
    <script
            src="${pageContext.request.contextPath}/plugins/iCheck/icheck.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/jquery.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/js/Login.js"></script>
</head>

<body>
<div class="login-box">
    <div class="login-box-body">
        <div id="form1">
            <%--<form id="form1" action="${pageContext.request.contextPath}/user/login" method="post">--%>
            <img class="mb-4" src="img/logo.jpg" alt="" width="72" height="72">
            <h1 class="h4 mb-3 font-weight-normal" id="errorMessage">超市订单管理后台</h1>
            <input type="text" id="username"  value="${user2.username}" class="form-control" placeholder="请输入用户名" required autofocus>
            <input type="password" id="password" value="${user2.password}" class="form-control" placeholder="请输入密码" required>
            <div class="checkbox mb-3">

                <label>
                    <input type="checkbox" value="remember-me"> 自动登录
                </label>
            </div>
            <button  id="submit" class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
        </div>
        <%--</form>--%>
    </div>
</div>

</body>

</html>