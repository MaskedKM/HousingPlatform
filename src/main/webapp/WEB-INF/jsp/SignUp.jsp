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
    <script type="text/javascript">
        function selectFace()
        {
            var index = info.face.selectedIndex;
            var a = info.face.options[index].value;
            info.showFace.src="face/" + a + ".jpg";
        }
    </script>
</head>
<body>
    <div align="center" border = "1" width="69">
    <form name= "info" action="${pageContext.request.contextPath}/SignUp" method="post">
        <table>
        <tr>用户名：<input type="text" name="name"/></tr>
        <tr>密码： <input type="text" name="password"/></tr>
        <tr>地址： <input type="text" name="address"/></tr>
        <tr>注册： <input type="submit" name="submit"/></tr>
        <tr> <p>头像：</p> <td>
            <select name="face" onchange="selectFace()">
                <option value="0" selected=selected >0</option>
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option>
                <option value="7">7</option>
                <option value="8">8</option>
                <option value="9">9</option>
                <option value="10">10</option>
                <option value="11">11</option>
                <option value="12">12</option>
                <option value="13">13</option>
                <option value="14">14</option>
                <option value="15">15</option>
                <option value="16">16</option>
                <option value="17">17</option>
                <option value="18">18</option>
                <option value="19">19</option>
                <option value="20">20</option>
            </select>
            <img name="showFace" src="face/0.jpg" width="64" height="64"/></td></tr>
    </table>
    </form>
</div>
</body>
</html>
