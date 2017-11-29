<%--
  Created by IntelliJ IDEA.
  User: chenxi
  Date: 2017/11/24
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>辰曦后台登录界面</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="../css/login.css" rel="stylesheet">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="../jquery/jquery-3.2.1.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="../bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {

        });
    </script>
</head>
<body>
<form action="/blog/bgIndex/index" method="post">
    <div class="loginBd">
        <div>
            <img class="loginBg" src="../images/login_title.png"/>
        </div>
        <div class="loginBt">
            <h1><span class="label label-default ">欢迎登录后台管理系统</span></h1>
        </div>
        <div class="loginContent">
            <div class="input-group col-xs-2" style="margin: 0 auto">
                <span class="input-group-addon"><span class="glyphicon glyphicon-user"></span></span>
                <input class="form-control" type="text" placeholder="请输入用户名" name="account" required/>
            </div>
            <br/>
            <div class="input-group col-xs-2" style="margin: 0 auto">
                <span class="input-group-addon"><span class="glyphicon glyphicon-lock"></span></span>
                <input class="form-control" type="password" placeholder="请输入密码" name="password" required/>
            </div>
            <br/>
            <div class="input-group col-xs-2" style="margin: 0 auto">
                <button type="submit" class="btn btn-success col-xs-12">登&nbsp;&nbsp;录</button>
            </div>
        </div>
    </div>
</form>
</body>
</html>
