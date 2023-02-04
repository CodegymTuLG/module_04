<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%--
  Created by IntelliJ IDEA.
  User: PC
  Date: 2023/02/03
  Time: 19:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/condiment/saved" method="post">
    <h1>Choose Sandwich Condiments</h1>
    <label>
        <input id="condiment1" type="checkbox" name="condiment" value="Lettuce">Lettuce
    </label>
    <label>
        <input id="condiment2" type="checkbox" name="condiment" value="Tomato">Tomato
    </label>
    <label>
        <input id="condiment3" type="checkbox" name="condiment" value="Mustard">Mustard
    </label>
    <label>
        <input id="condiment4" type="checkbox" name="condiment" value="Sprouts">Sprouts
    </label>
    <br>
    <button type="submit">Save</button>
<%--    <a href="/save/list"><button type="button">back</button></a>--%>
    </form>
</body>
</html>
