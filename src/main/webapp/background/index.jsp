<%--
  Created by IntelliJ IDEA.
  User: chenxi
  Date: 2017/11/28
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>辰曦后台首页</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="../css/index.css" rel="stylesheet">
    <link href="../css/bootstrap-treeview.css" rel="stylesheet">
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="../jquery/jquery-3.2.1.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="../bootstrap/js/bootstrap.min.js"></script>
    <script src="../jquery/bootstrap-treeview.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $.ajax({
                type:"Post",
                url:"/blog/bgIndex/menu",
                dataType:"json",
                success:function (result){
                    $('#tree').treeview({
                        data:result,//数据源
                        highlightSelected: true,    //是否高亮选中
                        //nodeIcon: 'glyphicon glyphicon-user',    //节点上的图标
                        //nodeIcon: 'glyphicon glyphicon-globe',
                        emptyIcon: '',    //没有子节点的节点图标
                        multiSelect: false,    //多选
//                        onNodeChecked: function (event,data) {
//                            alert(data.nodeId);
//                        },
//                        onNodeSelected: function (event, data) {
//                            alert(data.nodeId);
//                        }
                        state: {
                            expanded: false,
                        },
                    });
                },
                error: function () {
                    alert("树形结构加载失败！")
                }
            });
        });
    </script>
</head>
<body>
    <div class="indexBd">
        <div class="indexTopDiv"></div>
        <div>
            <div id="tree" class="indexLeftDiv">
            </div>
            <div class="indexRightDiv"></div>
        </div>
        <div class="indexBottomDiv"></div>
    </div>
</body>
</html>
