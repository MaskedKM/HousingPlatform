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
    <title>添加房产信息</title>
    <style>
        input, textarea {
            padding: 9px;
            border: solid 1px #E5E5E5;
            outline: 0;
            font: normal 13px/100% Verdana, Tahoma, sans-serif;
            width: 200px;
            background: #FFFFFF url('bg_form.png') left top repeat-x;
            background: -webkit-gradient(linear, left top, left 25, from(#FFFFFF), color-stop(4%, #EEEEEE), to(#FFFFFF));
            background: -moz-linear-gradient(top, #FFFFFF, #EEEEEE 1px, #FFFFFF 25px);
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
<form action="${pageContext.request.contextPath}/info/add" method="post">
    <p class="site">
        <label for="site">地址：</label>
        <input type="text" name="site" id="site" />
    </p>
    <p class="area">
        <label for="area">面积：</label>
        <input type="text" name="area" id="area" />
    </p>
    <p class="price">
        <label for="price">价格：</label>
        <input type="text" name="price" id="price" />
    </p>
    <p class="description">
        <label for="description">描述：</label>
        <input type="text" name="description" id="description" />
    </p>

    <p class="submit">
        <input type="submit" value="提交" />
    </p>
</form>
</body>
</html>
