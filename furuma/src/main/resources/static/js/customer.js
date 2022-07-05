function successHandler() {
    $.ajax({
        type: "GET",
        url: `/customer-api/customer/list-customer`,
        success: function (data) {
            let content = "";
            for (let i = 0; i < data.length ; i++) {
                content += getCustomer(data[i]);
            }
            document.getElementById('body').innerHTML = content;
        }
    })
}


function getCustomer(temp) {
    return `<tr>
                <td>${temp.maKhachHang}</td>
                <td>${temp.customerType.tenLoaiKhach}</td>
                <td>${temp.hoTen}</td>
                <td>${temp.ngaySinh}</td>
                <td>${temp.gioiTinh === 1 ? "Nam":"Nữ"}</td>
                <td>${temp.soCmnd}</td>
                <td>${temp.soDienThoai}</td>
                <td>${temp.email}</td>
                <td>${temp.diaChi}</td>
                <td><a class="btn btn-info" href="${temp.maKhachHang}">edit</a></td>
            </tr>`;
}



$(document).ready(function () {
    $('#customer-add-new').on('click', function (event) {
        let hoTen = $('#hoTen-add').val();
        let ngaySinh = $('#ngaySinh-add').val();
        let gioiTinh = $('#gioiTinh-add').val().toString();
        let soCmnd = $('#soCmnd-add').val();
        let soDienThoai = $('#soDienThoai-add').val();
        let email = $('#email-add').val();
        let diaChi = $('#diaChi-add').val();
        let type = $('#type-add').val();

        let newCustomer = {
            maKhachHang: null,
            customerType: {
                maLoaiKhach : type
            },
            hoTen: hoTen,
            ngaySinh: ngaySinh,
            gioiTinh: gioiTinh,
            soCmnd: soCmnd,
            soDienThoai: soDienThoai,
            email: email,
            diaChi: diaChi
        };

        $.ajax({
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },

            type: "POST",
            data: JSON.stringify(newCustomer),
            url: "/customer-api/customer/save",
            success: successHandler,
            //     function () {
            //     alert("Thao tác thực hiện thành công");
            // }
            error: function (event) {
                alert("Lỗi " + event)
            }
        });
    })
});