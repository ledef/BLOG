<%--
  Created by IntelliJ IDEA.
  User: chenxi
  Date: 2017/12/4
  Time: 23:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户数据</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="../jquery/jquery-3.2.1.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="../bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
    <ul id="userTab" class="nav nav-tabs">
        <li class="active"><a href="#userData" data-toggle="tab">用户数据</a></li>
        <li><a href="userUpdate" data-toggle="tab">用户修改</a></li>
    </ul>
    <div id="tabContent" class="tab-content">
        <div class="tab-pane fade in active" id="userData">
            <p>用户数据</p>
        </div>
        <div class="tab-pane fade in active" id="userUpdate">
            <p>用户修改</p>
        </div>
    </div>
</body>
</html>
