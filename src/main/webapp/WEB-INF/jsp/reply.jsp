<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: yrs
  Date: 2021/10/21
  Time: 4:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" import="java.io.*, java.util.*" %>
<%@ page import="com.football.housingplatform.dao.domain.User" %>
<html>
<head>
    <title>评论信息</title>
    </script>
</head>

<script>
    function Vote(replyId){
        location.href="${pageContext.request.contextPath}/reply/vote/"+ replyId;
    }
    function DeleteContent(replyId){
        location.href="${pageContext.request.contextPath}/reply/deleteContent/"+ replyId;
    }
</script>
<body>
<table border="1" >
    <tr>
        <th>编号</th>
        <th>地址</th>
        <th>面积</th>
        <th>价格</th>
        <th>描述</th>
    </tr>
    <tr>
        <td>${HousingInfo.id}</td>
        <td>${HousingInfo.site}</td>
        <td>${HousingInfo.area}</td>
        <td>${HousingInfo.price}</td>
        <td>${HousingInfo.description}</td>
    </tr>
</table>
    <%
        int cont = 0;
    %>
<table border="1">
    <tr>
        <th>编号</th>
        <th>评论</th>
        <th>点赞</th>
        <th>时间</th>
        <th>评论人</th>
        <th>操作</th>
    </tr>
    <c:forEach var="content" items="${contentList}">
        <tr>
            <td>${content.id}</td>
            <td>${content.message}</td>
            <td><label>${content.vote}</label></td>
            <td>${content.time}</td>
            <td>${content.userName}</td>
            <td>
                <input type="submit" value="点赞" name="vote" onclick="Vote(${content.id})"/>
                <input type="submit" value="删除" name="vote" onclick="DeleteContent(${content.id})"/>
            </td>
        </tr>
    </c:forEach>
</table>
        <form action="${pageContext.request.contextPath}/reply/add/${infoId}" method="post">
            <tr>
                <td>内容:</td>
                <td><textarea name = "message"></textarea></td>
                <td>留言：<input type="submit" value ="留言"/></td>
            </tr>
        </form>
 </table>
</body>
</html>