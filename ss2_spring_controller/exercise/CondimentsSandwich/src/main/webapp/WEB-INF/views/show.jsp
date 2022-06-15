<%--
  Created by IntelliJ IDEA.
  User: Dinh Luan
  Date: 6/15/2022
  Time: 3:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Comdiments Sandwich</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>
<div class="container text-center">
    <c:if test="${condiment != null}">
        <p> Your choice:
            <c:forEach var="c" items="${condiment}">
                ${c}
            </c:forEach>
        </p>
    </c:if>

    <form action="/save">
        <h1 class="text-center">Sandwich Condiments</h1>
        <div class="form-check form-check-inline row">
            <label class="form-check-label col-6">
                <input class="form-check-input" id="Lettuce" type="checkbox" name="condiment" value="Lettuce" ${Lettuce}> Lettuce
            </label>
            <label class="form-check-label col-6">
                <input class="form-check-input" id="Tomato" type="checkbox" name="condiment" value="Tomato" ${Tomato}> Tomato
            </label>
            <label class="form-check-label col-6">
                <input class="form-check-input" id="Mustard" type="checkbox" name="condiment" value="Mustard" ${Mustard}> Mustard
            </label>
            <label class="form-check-label col-6">
                <input class="form-check-input" id="Sprouts" type="checkbox" name="condiment" value="Sprouts" ${Sprouts}> Sprouts
            </label>
        </div>
        <hr>
        <button type="submit" class="btn btn-outline-success w-25">Save</button>
    </form>
</div>
</body>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</html>
