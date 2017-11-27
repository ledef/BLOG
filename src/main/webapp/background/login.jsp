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
    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="jquery/jquery-3.2.1.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#btn").click(function () {
                $("p").slideToggle();
            });
        });
    </script>
</head>
<body>
    <p>这是一个段落。</p>
    <button type="button" class="btn btn-danger" id="btn">危险按钮</button>
</body>
</html>
