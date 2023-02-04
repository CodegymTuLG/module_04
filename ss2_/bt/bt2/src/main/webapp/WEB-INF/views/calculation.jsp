<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2023/02/04
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Calculation</h1>
<p>${mess}</p>
<form action="/condiment/calculation" method="post">
    <input type="number" name="num1">
    <input type="number" name="num2">
    <button type="submit" name="method" value="+">+</button>
    <button type="submit" name="method" value="-">-</button>
    <button type="submit" name="method" value="*">*</button>
    <button type="submit" name="method" value="/">/</button>
</form>
<p>Result: ${result}</p>
</body>
</html>
