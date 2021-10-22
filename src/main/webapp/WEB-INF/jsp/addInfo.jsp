<%--
  Created by IntelliJ IDEA.
  User: adimin
  Date: 2021/10/19
  Time: 19:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/info/add" method="post">
    地址：<input type="text" name="site">
    面积：<input type="text" name="area">
    价格：<input type="text" name="price">
    描述：<input type="text" name="description">
    <input type="submit" name="提交">
</form>
</body>
</html>
