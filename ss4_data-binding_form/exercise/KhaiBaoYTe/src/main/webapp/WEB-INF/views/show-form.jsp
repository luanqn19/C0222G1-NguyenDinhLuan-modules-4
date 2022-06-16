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
<form:form modelAttribute="declare" action="/save" method="post">
    <div class="container justify-content-center header-title">
        <a class="btn btn-primary" href="/"><i class="fa fa-rotate-back"></i> Back</a>
        <c:if test="${msg != null}">
            <h1 class="text-center">${msg}</h1>
        </c:if>

        <h3 class="text-center">TỜ KHAI Y TẾ</h3>

        <h4 class="text-center">ĐÂY LÀ TÀI LIỆU QUAN TRỌNG, THÔNG TIN CỦA ANH/CHỊ SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN
            THIẾT ĐỂ PHÒNG CHỐNG DỊCH BỆNH TRUYỀN NHIỄM</h4>

        <p class="text-center font-weight-bold" style="color: red">Khuyến cáo: Khai báo thông tin sai là hành vi phạm
            pháp luật Việt Nam và có thể xử lý hình sự</p>
    </div>

    <div class="container">
        <div class="form-group row">
            <form:label path="fullName">Họ tên:(Ghi chữ IN HOA) (*) </form:label>
            <form:input path="fullName" type="text" class="form-control" id="fullName" maxlength="50"/>
        </div>
        <div class="form-group row">
            <div class="col-4">
                <form:label path="birthDay">Ngày sinh (*): </form:label>
                <form:input path="birthDay" type="date" class="form-control"/>
            </div>
            <div class="col-4">
                <form:label path="gender">Giới tính (*): </form:label>
                <form:select path="gender" class="form-control" id="gender">
                    <form:option value="NONE">--Select--</form:option>
                    <form:options items="${genders}"/>
                </form:select>
            </div>
            <div class="col-4">
                <label for="nation">Quốc gia (*): </label>
                <form:select path="nation" class="form-control" id="nation" required="required">
                    <form:option value="NONE">--Select--</form:option>
                    <form:options items="${nations}"></form:options>
                </form:select>
            </div>
        </div>

        <div class="form-group row">
            <label for="document">Số hộ chiếu hoặc sô CMND hoặc giấy thông hành hợp pháp khác (*) </label>
            <form:input path="document" type="text" class="form-control" id="document" maxlength="20"
                        required="required"/>
        </div>

        <div class="form-group row">
            <div class="col-3"><label>Thông tin đi lại (*): </label></div>
            <div class="col-2"><form:radiobutton path="went" value="Tàu bay"/> Tàu bay</div>
            <div class="col-2"><form:radiobutton path="went" value="Tàu thuyền"/> Tàu thuyền</div>
            <div class="col-2"><form:radiobutton path="went" value="Ô tô"/> Ô tô</div>
            <div class="col-2"><form:radiobutton path="went" value="Khác(ghi rõ)"/> Khác(ghi rõ)</div>
        </div>

        <div class="form-group row">
            <div class="col-6">
                <label for="vehincle">Số hiệu phương tiện</label>
                <form:input path="vehincle" type="text" class="form-control" id="vehincle" maxlength="20"
                            required="required"/>
            </div>
            <div class="col-6">
                <label for="seats">Số ghế</label>
                <form:input path="seats" type="number" class="form-control" id="seats" required="required"/>
            </div>
        </div>

        <div class="form-group">
            <div class="row">
                <div class="col-6">
                    <label for="dueStart">Ngày khởi hành (*): </label>
                    <form:input path="dueStart" type="date" class="form-control" id="dueStart" required="required"/>
                </div>
                <div class="col-6">
                    <label for="dueEnd">Ngày kết thúc (*): </label>
                    <form:input path="dueEnd" type="date" class="form-control" id="dueEnd" required="required"/>
                </div>
            </div>
        </div>

        <div class="form-group row">
            <label for="where">Trong vòng 14 ngày qua, Anh/Chị có đến tỉnh/thành phố nào? (*) </label>
            <form:textarea class="form-control" path="where" id="where" rows="3"/>
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
