<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2023/02/01
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Calculation</h1>
<form action="/calculation" method="post">
    <label>USD</label>
    <input type="text" name="usd">
    <p>tương ứng với với</p>
    <p> ${vnd}<span>VND</span></p>
    <button type="submit">Đổi mệnh giá</button>
</form>
</body>
</html>
