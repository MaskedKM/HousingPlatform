<%--
  Created by IntelliJ IDEA.
  User: adimin
  Date: 2021/10/23
  Time: 6:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>注册</title>
  <script type="text/javascript">
    function selectFace()
    {
      var index = info.face.selectedIndex;
      var a = info.face.options[index].value;
      info.showFace.src="face/" + a + ".jpg";
    }
  </script>
  <style>
    input, textarea {
      padding: 9px;
      border: solid 1px #E5E5E5;
      outline: 0;
      font: normal 13px/100% Verdana, Tahoma, sans-serif;
      width: 200px;
      background: #FFFFFF url('bg_form.png') left top repeat-x;
      background: -webkit-gradient(linear, left top, left 25, from(#FFFFFF), color-stop(4%, #EEEEEE), to(#FFFFFF));
      background: -moz-linear-gradient(top, #FFFFFF, #819c51 1px, #bd3737 25px);
      box-shadow: rgba(0,0,0, 0.1) 0px 0px 8px;
      -moz-box-shadow: rgba(0,0,0, 0.1) 0px 0px 8px;
      -webkit-box-shadow: rgba(0,0,0, 0.1) 0px 0px 8px;
    }

    textarea {
      width: 400px;
      max-width: 400px;
      height: 150px;
      line-height: 150%;
    }

    input:hover, textarea:hover,
    input:focus, textarea:focus {
      border-color: #C9C9C9;
      -webkit-box-shadow: rgba(0, 0, 0, 0.15) 0px 0px 8px;
    }

    .form label {
      margin-left: 10px;
      color: #999999;
    }

    .submit input {
      width: auto;
      padding: 9px 15px;
      background: #617798;
      border: 0;
      font-size: 14px;
      color: #FFFFFF;
      -moz-border-radius: 5px;
      -webkit-border-radius: 5px;
    }
  </style>


</head>
<body>
<form name="info" class="form" action="${pageContext.request.contextPath}/SignUp" method="post">

  <p class="name">
    <input type="text" name="name" id="name" />
    <label for="name">用户名</label>
  </p>

  <p class="password">
    <input type="text" name="password" id="password" />
    <label for="password">密码</label>
  </p>

  <p class="address">
    <input type="text" name="address" id="address" />
    <label for="address">地址</label>
  </p>

  <p class="face">
    <label>头像</label>
    <select name="face" onchange="selectFace()">
      <option value="0">0</option>
      <option value="1">1</option>
      <option value="2">2</option>
      <option value="3">3</option>
    </select>
    <img name="showFace" src="face/0.jpg" width="64" height="64"/>
  </p>

  <p class="submit">
    <input type="submit" value="注册" />
  </p>


</form>

</body>
</html>
