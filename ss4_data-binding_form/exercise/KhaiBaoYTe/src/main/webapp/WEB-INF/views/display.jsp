<%--
  Created by IntelliJ IDEA.
  User: Dinh Luan
  Date: 6/16/2022
  Time: 7:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Display</title>
    <link rel="stylesheet" href="/resources/bootstrap/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="/resources/datatable/css/dataTables.bootstrap4.min.css">
    <link rel="stylesheet" href="/resources/fontawesome/css/all.css">
    <link rel="stylesheet" href="/resources/css/index.css">
</head>
<body>
<div class="container">
    <a class="btn btn-primary" href="/"><i class="fa fa-rotate-back"></i> Back</a>
    <table id="listTable" class="table table-striped table-inverse table-responsive">
        <thead class="thead-inverse">
        <tr>
            <th>Họ và tên</th>
            <th>Năm sinh</th>
            <th>Giới tính</th>
            <th>Quốc gia</th>
            <th>CMND</th>
            <th>Thông tin đi lại</th>
            <th>Số hiệu phương tiện</th>
            <th>Số ghế</th>
            <th>Ngày khởi hành</th>
            <th>Ngày kết thúc</th>
            <th>Các tỉnh khác</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="i">
            <tr>
                <td>${i.fullName}</td>
                <td>${i.birthDay}</td>
                <td>${i.gender}</td>
                <td>${i.nation}</td>
                <td>${i.document}</td>
                <td>${i.went}</td>
                <td>${i.vehincle}</td>
                <td>${i.seats}</td>
                <td>${i.dueStart}</td>
                <td>${i.dueEnd}</td>
                <td>${i.where}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
<script src="/resources/js/jquery.slim.min.js"></script>
<script src="/resources/bootstrap/dist/js/bootstrap.bundle.min.js"></script>
<script src="/resources/bootstrap/dist/js/bootstrap.min.js"></script>
<script src="/resources/datatable/js/jquery.dataTables.min.js"></script>
<script src="/resources/datatable/js/dataTables.bootstrap4.min.js"></script>
<script src="/resources/js/custom.js"></script>
</html>
