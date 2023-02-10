<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
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
<h1>TỜ KHAI Y TẾ</h1>
<br>
<br>
<br>
<form:form modelAttribute="medicalInfo" method="post" action="/medicalInfo/send-medical" >
    <label>Họ tên (ghi chữ IN HOA)<span style="color: red">(*)</span></label>    <br>
        <form:input path="name" cssStyle="width: 500px"></form:input>
    <br>
    <label>Năm sinh<span style="color: red">(*)</span></label>    <br>
    <form:select path="birthYear">
        <form:options items="${year}"></form:options>
    </form:select>
    <br>
    <label>Giới tính<span style="color: red">(*)</span></label>    <br>
    <form:select path="sex">
        <form:option value="true">Nam</form:option>
        <form:option value="false">Nữ</form:option>
    </form:select>
    <br>
    <label>Quốc tịch<span style="color: red">(*)</span></label>    <br>
    <form:input path="country"></form:input>
    <br>
    <label>Số hộ chiếu hoặc số CMND hoặc giấy thông thành hợp pháp khác<span style="color: red">(*)</span></label>    <br>
    <form:input path="cardId"></form:input>
    <br>
    <label>Thông tin đi lại<span style="color: red">(*)</span></label>    <br>
    <form:radiobuttons path="transport" items="${transport}"></form:radiobuttons>
    <br>
    <table border="1">
        <tr>
            <th style="width: 300px">Triệu chứng </th>
            <th>Có</th>
            <th>Không</th>
        </tr>
        <tr>
            <td>Sốt<span style="color: red">(*)</span></td>
            <td><form:radiobutton path="sot" value="true"></form:radiobutton></td>
            <td><form:radiobutton path="sot" value="false"></form:radiobutton></td>
        </tr>
        <tr>
            <td>Ho<span style="color: red">(*)</span></td>
            <td><form:radiobutton path="ho" value="true"></form:radiobutton></td>
            <td><form:radiobutton path="ho" value="false"></form:radiobutton></td>
        </tr>
        <tr>
            <td>Khó thở<span style="color: red">(*)</span></td>
            <td><form:radiobutton path="khotho" value="true"></form:radiobutton></td>
            <td><form:radiobutton path="khotho" value="false"></form:radiobutton></td>
        </tr>
        <tr>
            <td>Đau họng<span style="color: red">(*)</span></td>
            <td><form:radiobutton path="dauhong" value="true"></form:radiobutton></td>
            <td><form:radiobutton path="dauhong" value="false"></form:radiobutton></td>
        </tr>
    </table>
    <br>
    <br>
    <form:button type="submit">Gủi tờ khai</form:button>
</form:form>
</body>
</html>
