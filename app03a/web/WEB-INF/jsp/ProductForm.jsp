<%--
  Created by IntelliJ IDEA.
  User: zhaoke
  Date: 2017/3/24
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Input</title>
    <link rel="stylesheet" href="/css/main.css">
<%--    <style type="text/css">@import "/css/main.css";</style>--%>
</head>
<body>
<div id="global">
    <form action="/product_save.action" method="post">
        <fieldset>
            <legend>Add a product</legend>
            <p>
                <label for="name">Product Name：</label>
                <input type="text" id="name" name="name" value="" tabindex="1">
            </p>

            <p>
                <label for="description">Product Description：</label>
                <input type="text" id="description" name="description" value="" tabindex="2">
            </p>

            <p>
                <label for="price">Product Price：</label>
                <input type="text" id="price" name="price" value="" tabindex="3">
            </p>

            <p id="buttons">
                <input id="reset" type="reset" tabindex="4">
                <input id="submit" type="submit" tabindex="5" value="Add Product">
            </p>

        </fieldset>
    </form>
</div>

</body>
</html>
