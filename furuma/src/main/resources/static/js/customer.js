$(document).ready(function () {
    $('#customer-add-new').on('click', function (event) {
        let hoTen = $('#hoTen-add').val();
        let ngaySinh = $('#ngaySinh-add').val();
        let gioiTinh = $('#gioiTinh-add').val();
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
            success: function () {
                alert("Thao tác thực hiện thành công");
            },
            error: function (event) {
                alert("Lỗi " + event)
            }
        });
    })
});