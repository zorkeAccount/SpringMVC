<%--
  Created by IntelliJ IDEA.
  User: zhaoke
  Date: 2017/3/27
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Edit Book Form</title>
    <style type="text/css">@import url("<c:url value="/css/main.css" />");</style>
</head>
<body>
    <div id="global">
        <form:form commandName="book" action="../book_update" method="post">
            <fieldset>
                <legend>Edit a book</legend>
                <form:hidden path="id"/>
                <p>
                    <label for="category">Category:</label>
                    <form:select path="category.id" id="category" items="${categories}" itemLabel="name" itemValue="id"/>
                </p>
                <p>
                    <label for="title">Title:</label>
                    <form:input path="title" id="title"/>
                </p>
                <p>
                    <label for="author">Author:</label>
                    <form:input path="author" id="author"/>
                </p>
                <p>
                    <label for="isbn">ISBN:</label>
                    <form:input path="isbn" id="isbn"/>
                </p>
                <p id="buttons">
                    <input id="reset" type="reset" tabindex="4">
                    <input id="submit" type="submit" tabindex="5" value="Update Book">
                </p>
            </fieldset>
        </form:form>
    </div>
</body>
</html>
