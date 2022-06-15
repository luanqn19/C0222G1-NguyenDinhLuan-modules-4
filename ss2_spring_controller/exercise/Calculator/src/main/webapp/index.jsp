<%--
  Created by IntelliJ IDEA.
  User: Dinh Luan
  Date: 6/15/2022
  Time: 11:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Calculator</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>
<form action="/calculate">
    <div class="container">
        <div class="form-group row">
            <input class="col-6" type="number" name="num1" class="form-control" placeholder="Number 1" min="0"
                   step=".01" required>
            <input class="col-6" type="number" name="num2" class="form-control" placeholder="Number 2" min="0"
                   step=".01" required>
        </div>
        <div class="form-group row">
            <input type="submit" class="btn btn-outline-success w-25" name="operator" value="add">
            <input type="submit" class="btn btn-outline-success w-25" name="operator" value="sub">
            <input type="submit" class="btn btn-outline-success w-25" name="operator" value="multi">
            <input type="submit" class="btn btn-outline-success w-25" name="operator" value="div">
        </div>
    </div>
</form>
</body>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</html>
