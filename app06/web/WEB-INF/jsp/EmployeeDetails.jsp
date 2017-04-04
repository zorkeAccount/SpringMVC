<%--
  Created by IntelliJ IDEA.
  User: zhaoke
  Date: 2017/4/4
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Employee Details</title>
    <style type="text/css">@import url("<c:url value="/css/main.css" />");</style>
</head>
<body>
<div id="global">
    <h4> The Employee has been saved.</h4>
    <p>
        <h5>Details:</h5>
        FirstName:${employee.firstName}<br>
        LastName:${employee.lastName}<br>
        BirthDate:${employee.birthDate}<br>
        SalaryLevel:${employee.salaryLevel}<br>
    </p>
</div>

</body>
</html>
