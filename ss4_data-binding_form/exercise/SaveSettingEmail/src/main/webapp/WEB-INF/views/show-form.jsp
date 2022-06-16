<%--
  Created by IntelliJ IDEA.
  User: Dinh Luan
  Date: 6/16/2022
  Time: 10:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/resources/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/resources/fontawesome/css/all.css">
    <link rel="stylesheet" href="/resources/css/index.css">
</head>
<body>
<form:form modelAttribute="setting" action="/save" method="post">
    <div class="container">
        <c:if test="${msg != null}">
            <h1 class="text-center">${msg}</h1>
        </c:if>

        <a class="btn btn-primary" href="/"><i class="fa fa-rotate-back"></i> Back</a>

        <h1>Settings</h1>
        <div class="form-group">
            <label for="language">Languages: </label>
            <form:select path="lang" class="form-control" id="language">
                <form:option value="null">Please choice language</form:option>
                <form:options items="${listLang}"></form:options>
            </form:select>
        </div>
        <div class="form-group">
            <label for="size">Page Size: </label>
            <div>Show
                <form:select path="pageSize" class="form-control select-page w-25" id="size">
                    <form:options items="${listPageSize}"></form:options>
                </form:select>
                emails per page
            </div>
        </div>
        <div class="form-check form-check-inline">
            <label class="form-check-label">
                <form:checkbox path="isSpam" class="form-check-input"></form:checkbox>Enable spams filter
            </label>
        </div>

        <div class="form-group">
            <label for="signature">Signature: </label>
            <form:textarea class="form-control" path="signature" id="signature" rows="3"></form:textarea>
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary">Update</button>
            <a class="btn btn-outline-danger" href="/">Cancel</a>
        </div>
    </div>
</form:form>
</body>
<script src="/resources/js/jquery.slim.min.js"></script>
<script src="/resources/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
<script src="/resources/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="/resources/js/custom.js"></script>
</html>
