<%--
  Created by IntelliJ IDEA.
  User: darylng
  Date: 18/6/2021
  Time: 12:36 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>歡迎來到我的咖啡☕️</title>
</head>
<body>
<form action="processOrder">
    <div align="center">
        <h1 align="center">歡迎來到我的咖啡☕️</h1>
        <hr>
        <label for="Item_name">Item Name : </label>
        <input type="text" name="foodType" placeholder="food type ?" id="Item_name">
        <input type="submit" value="order now">
    </div>
</form>
</body>
</html>
