<%--
  Created by IntelliJ IDEA.
  User: adimin
  Date: 2021/10/22
  Time: 22:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center" border = "1" width="69">
    <form action="${pageContext.request.contextPath}/updateUser">
        <input type="text" name="id"  readonly="readonly" value="${user.id}">
        <input type="text" name="name" value="${user.name}">
        <input type="text" name="address" value="${user.address}">
        <input type="text" name="authority" value="${user.authority}" disabled="disabled">
        <input type="submit" name="submit">修改</input>
    </form>

</div>
</body>
</html>
