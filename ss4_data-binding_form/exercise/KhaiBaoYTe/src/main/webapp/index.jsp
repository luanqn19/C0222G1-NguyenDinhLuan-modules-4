<%--
  Created by IntelliJ IDEA.
  User: Dinh Luan
  Date: 6/16/2022
  Time: 10:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" href="/resources/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/resources/fontawesome/css/all.css">
    <link rel="stylesheet" href="/resources/css/index.css">
</head>
<body>
<div class="dropdown open">
    <button class="btn btn-secondary dropdown-toggle" type="button" id="triggerId" data-toggle="dropdown"
            aria-haspopup="true"
            aria-expanded="false">
        Utilities
    </button>
    <div class="dropdown-menu" aria-labelledby="triggerId">
        <a class="dropdown-item" href="/declare">Declare</a>
        <a class="dropdown-item" href="/display">Display</a>
        <a class="dropdown-item disabled" href="#">Disabled action</a>
    </div>
</div>
</body>
<script src="/resources/js/jquery.slim.min.js"></script>
<script src="/resources/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
<script src="/resources/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="/resources/js/custom.js"></script>
</html>
