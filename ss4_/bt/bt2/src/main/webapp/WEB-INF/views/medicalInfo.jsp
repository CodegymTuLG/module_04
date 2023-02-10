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
<h1>Medical info</h1>
<table>
    <tr>
        <td>Họ tên</td>
        <td> ${medicalInfo.name}</td>
    </tr>
    <tr>
        <td>Năm sinh</td>
        <td>${medicalInfo.birthYear}</td>
    </tr>
    <tr>
        <td>Giới tính</td>
        <c:if test="${medicalInfo.sex}">
            <td>Nam</td>
        </c:if><c:if test="${!medicalInfo.sex}">
        <td>Nữ</td>
    </c:if>
    </tr>
    <tr>
        <td>Quốc gia</td>
        <td>${medicalInfo.country}</td>
    </tr>
    <tr>
        <td>Phương tiện đi lại</td>
        <td>${medicalInfo.transport}</td>
    </tr>
    <tr>
        <td>Sốt</td>
        <c:if test="${medicalInfo.sot}">
            <td>có</td>
        </c:if><c:if test="${!medicalInfo.sot}">
        <td>Không</td>
    </c:if>
    </tr>
    <tr>
        <td>Họ</td>
        <c:if test="${medicalInfo.ho}">
            <td>có</td>
        </c:if><c:if test="${!medicalInfo.ho}">
        <td>Không</td>
    </c:if>
    </tr>
    <tr>
        <td>Khó thở</td>
        <c:if test="${medicalInfo.khotho}">
            <td>có</td>
        </c:if><c:if test="${!medicalInfo.khotho}">
        <td>Không</td>
    </c:if>
    </tr>
    <tr>
        <td>Đau họng</td>
        <c:if test="${medicalInfo.dauhong}">
            <td>có</td>
        </c:if><c:if test="${!medicalInfo.dauhong}">
        <td>Không</td>
    </c:if>

    </tr>
</table>
</body>
</html>
