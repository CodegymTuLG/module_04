<%@ page import="java.util.List" %>
<%@ page import="java.util.Collections" %>
<%@ page import="java.util.Arrays" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Current mail config info</h1>
<table>
    <tr>
        <td>Language</td>
        <td> ${emailConfig.language}</td>
    </tr>
    <tr>
        <td>Page size</td>
        <td>${emailConfig.pageSize}</td>
    </tr>
    <tr>
        <td>Spams filter</td>
        <td>${emailConfig.enableFlg}</td>
    </tr>
    <tr>
        <td>Signature:</td>
        <td>${emailConfig.signature}</td>
    </tr>
</table>
<a href="/email-config/edit"><button>Edit</button></a>
</body>
</html>
