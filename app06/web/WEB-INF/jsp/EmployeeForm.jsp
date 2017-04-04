<%--
  Created by IntelliJ IDEA.
  User: zhaoke
  Date: 2017/4/4
  Time: 13:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Add an employee</title>
    <style type="text/css">@import url("<c:url value="/css/main.css"></c:url> ");</style>
</head>
<body>
<div id="global">
<form:form commandName="employee" action="employee_save" method="post">
    <fieldset>
        <legend>Add an employeee</legend>
        <p>
            <label for="firstName">FirstName:</label>
            <form:input path="firstName" tabindex="1"/>
        </p>
        <p>
            <label for="lastName">LastName:</label>
            <form:input path="lastName" tabindex="2"/>
        </p>
        <p>
            <form:errors path="birthDate" cssClass="error"/>
        </p>
        <p>
            <label for="birthDate">Date of Birth:</label>
            <form:input path="birthDate" tabindex="3"/>
        </p>
        <p id="buttons">
            <input id="reset" type="reset" tabindex="4">
            <input id="submit" type="submit" tabindex="5" value="Add Employee">
        </p>
    </fieldset>
</form:form>
</div>
</body>
</html>
