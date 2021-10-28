<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>首页</title>
    <script>function checkReply(id) {
        location.href="${pageContext.request.contextPath}/reply/message/"+ id;
    }
    function delInfo(InfoId){
            if (confirm("确认删除？")){
                location.href="${pageContext.request.contextPath}/info/del/"+InfoId;
            }
        }

    function myPage(userId){
        location.href="${pageContext.request.contextPath}/myPage/"+userId;
    }
    </script>
</head>
<body>
    <div class="Head" >
        <h1>绷 得 住</h1>${user.name}<img src="/face/${user.face}.jpg" width="30" height="30" onclick="myPage(${user.id})"/>
    </div>
    <form action="${pageContext.request.contextPath}/info/search" method="post">
        <td class="kuang">
            <h >搜 索 框：<input type="text" name="site"></h>
            <input class="Submit" type="submit" name="提交">
        </td>
    </form><br>
    <table class="Content">
        <tr>
            <th>id</th>
            <th>地址</th>
            <th>面积</th>
            <th>价格</th>
            <th>描述</th>
            <th>操作</th>
        </tr>
        <c:forEach var="info" items="${infoServiceList}">
            <tr class="table">
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
    <p>
        <input type="button" value="添加信息" onclick="location.href='${pageContext.request.contextPath}/info/addInfo'"/>
    </p>

    <style>
        body{
            background-image: url('/2.png');
            background-size: auto;
            font-family:Arial, Helvetica, sans-serif;
            font-size: 20px;
            text-align: center;
        }
        .Head{
            color: rgb(244, 245, 241);
            font-family:Verdana, Geneva, Tahoma, sans-serif;
            font-size: 30px;
        }
        .kuang{
            padding: 30px 40px;
            
        }
        .table{
            color: white;
        }
        .Submit{
            background-color: #4CAF50; /* Green */
            border: none;
            color: white;
            padding: 10px 20px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
            font-size: 16px;
        }
        .Content{
            border:2px solid #a1a1a1;
            padding:10px 40px; 
            font-family: monospace;
            border-radius:5px;
            margin: 0 auto;
        }
    </style>
</body>
</html>
