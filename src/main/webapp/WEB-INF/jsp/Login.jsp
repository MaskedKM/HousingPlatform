<%--
  Created by IntelliJ IDEA.
  User: 65448
  Date: 2021/10/22
  Time: 20:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div align="center" border = "1" width="69">
    <form action="${pageContext.request.contextPath}/Login" method="post">
        用户名： <input type="text" name="name"/>
        密码： <input type="text" name="password"/>
        提交： <input type="submit" name="name"/>
    </form>
        <a href="${pageContext.request.contextPath}/signup" >signup</a>
    </div>
</body>
</html>
