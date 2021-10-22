<%--
  Created by IntelliJ IDEA.
  User: adimin
  Date: 2021/10/22
  Time: 21:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div align="center" border = "1" width="69">
    <form action="${pageContext.request.contextPath}/SignUp" method="post">
        用户名： <input type="text" name="name"/>
        密码： <input type="text" name="password"/>
        地址： <input type="text" name="address"/>
        注册： <input type="submit" name="submit"/>
    </form>
</div>
</body>
</html>
