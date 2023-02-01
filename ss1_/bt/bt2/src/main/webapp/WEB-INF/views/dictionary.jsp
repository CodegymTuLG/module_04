<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2023/02/01
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Dictionary</h1>
<form action="/dictionary" method="post">
    <label>nhập từ tiếng anh</label>
    <input type="text" name="word">
    <span>"do", "work", "interview", "see"</span>
    <p>có nghĩa là</p>
    <p> ${rpWord}</p>
    <button type="submit">Tra từ</button>
</form>
</body>
</html>
