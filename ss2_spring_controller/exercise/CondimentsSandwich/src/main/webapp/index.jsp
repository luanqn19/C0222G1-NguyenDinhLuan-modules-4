<%--
  Created by IntelliJ IDEA.
  User: Dinh Luan
  Date: 6/15/2022
  Time: 2:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
          integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
</head>
<body>
<form action="/save">
    <div class="container text-center">
        <h1 class="text-center">Sandwich Condiments</h1>
        <div class="form-check form-check-inline row">
            <label class="form-check-label col-6">
                <input class="form-check-input" type="checkbox" name="condiment" value="Lettuce"> Lettuce
            </label>
            <label class="form-check-label col-6">
                <input class="form-check-input" type="checkbox" name="condiment" value="Tomato"> Tomato
            </label>
            <label class="form-check-label col-6">
                <input class="form-check-input" type="checkbox" name="condiment" value="Mustard"> Mustard
            </label>
            <label class="form-check-label col-6">
                <input class="form-check-input" type="checkbox" name="condiment" value="Sprouts"> Sprouts
            </label>
        </div>
        <hr>
        <button type="submit" class="btn btn-outline-success w-25">Save</button>
    </div>
</form>
</body>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
</html>
