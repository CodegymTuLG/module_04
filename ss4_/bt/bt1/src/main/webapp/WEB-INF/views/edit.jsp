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
<form:form modelAttribute="emailConfig" method="post" action="/email-config/current-info" >
    <table>
        <tr>
            <td>
                Languages
            </td>
            <td><form:select path="language">
                <%--                <c:when test="${rentTypeMaster.getRenttype_id()}==${rt}">--%>
<%--                    <option selected value="${rentTypeMaster.getRenttype_id()}">${rentTypeMaster.getType()}</option>--%>
<%--                </c:when>--%>
<%--                <c:otherwise>--%>
<%--                    <option selected value="${rentTypeMaster.getRenttype_id()}">${rentTypeMaster.getType()}</option>--%>
<%--                </c:otherwise>--%>
                <form:option value="NONE"> --SELECT--</form:option>
                <form:options items="${languages}"></form:options>
            </form:select></td>
        </tr>
        <tr>
            <td>
                Page size:
            </td>
            <td>Show <form:select path="pageSize">
                <form:option value="NONE"> --SELECT--</form:option>
                <form:options items="${pageSizes}"></form:options>
            </form:select> emails per page</td>
        </tr>
        <tr>
            <td>
                Spams filter:
            </td>
            <td>
                <form:checkbox path="enableFlg" value="${emailConfig.enableFlg}"></form:checkbox>
                Enable spams filter
            </td>
        </tr>
        <tr>
            <td>
                Signature:
            </td>
            <td>
                <form:textarea path="signature" rows = "5" cols = "30" ></form:textarea>
            </td>
        </tr>
    </table>
    <form:button type="submit"> Update</form:button>
    <a href="/email-config/current-info"><button type="button">Cancel</button></a>
</form:form>
</body>
</html>
