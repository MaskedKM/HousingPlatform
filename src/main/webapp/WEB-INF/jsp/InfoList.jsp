<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Title</title>

    <script>function checkReply(id) {
        location.href="${pageContext.request.contextPath}/reply/message/"+ id;
    }

    function delInfo(InfoId){
            if (confirm("确认删除？")){
                location.href="${pageContext.request.contextPath}/info/del/"+InfoId;
            }
        }
    </script>
</head>
<body>
    <h1>Housing Information List</h1><br>
    <form action="${pageContext.request.contextPath}/info/search" method="post">
        搜索框：<input type="text" name="site">
        <input type="submit" name="提交">
    </form><br>
    <table>
        <tr>
            <th>id</th>
            <th>地址</th>
            <th>面积</th>
            <th>价格</th>
            <th>描述</th>
            <th>操作</th>
        </tr>
        <c:forEach var="info" items="${infoServiceList}">
            <tr>
                <td>${info.id}</td>
                <td>${info.site}</td>
                <td>${info.area}</td>
                <td>${info.price}</td>
                <td>${info.description}</td>
                <td>
                    <a href="javascript:void(0);" onclick="checkReply('${info.id}')" >详述</a>
                    <a href="javascript:void(0);" onclick="delInfo('${info.id}')" >删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
