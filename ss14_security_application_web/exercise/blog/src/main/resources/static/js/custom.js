let pageSize = 0;
let contentBlog = ``;

function getBlog(blog) {
    return `<tr>
                    <td>${blog.idBlog}</td>
                    <td>${blog.titleBlog}</td>
                    <td>${blog.artistBlog}</td>
                    <td class="content-blog">${blog.contentBlog}</td>
                    <td>${blog.typeOfBlog}</td>
                    <td>${blog.dateBlog}</td>
                    <td>
                        <button th:data-edt="${blog.idBlog}" type="button" class="btn btn-warning btn-sm"
                                data-toggle="modal" data-target="#modelEdtId"
                                onclick='getCodeProduct(this)'>
                            <i class="fa fa-pen"></i> Edit
                        </button>
                        <button th:data-del="${blog.idBlog}" type="button" class="btn btn-danger btn-sm"
                                data-toggle="modal" data-target="#modelDelId"
                                onclick='getCodeProductDel(this)'>
                            <i class="fa fa-trash-can"></i> Delete
                        </button>
                        <a class="btn btn-info btn-sm" th:href='@{/detail/{idBlog}(idBlog = ${blog.idBlog})}'>
                            <i class="fa fa-info"></i> Detail</a>
                    </td>
                </tr>`
}

function readBlog (blog) {
    return `<div class="blog-item">
                    <div class="justify-content-center text-center row">
                        <h2 style="color: red; font-style: italic">${blog.titleBlog}</h2>
                    </div>
                    <div class="justify-content-center text-center row">
                        <h4 style="font-style: italic">Tác giả: ${blog.artistBlog}, Ngày viết: ${blog.dateBlog}</h4>
                    </div>
                    <p class="justify-content-center text-center row">${blog.contentBlog}</p>
            </div><hr>`
}

$(document).ready(function () {
    $('#seachBlog').on("click", function (event) {
        let name = $('#titleBlog').val();
        $.ajax({
            type: "GET",
            url: `api/blog/search/${name}`,
            success: function (data) {
                let content = `<thead class="thead-inverse">
                            <tr>
                                <th>Mã Blog</th>
                                <th>Tiêu đề Blog</th>
                                <th>Tác giả</th>
                                <th>Nội dung</th>
                                <th>Thể loại</th>
                                <th>Ngày viết</th>
                                <th>Thao tác</th>
                            </tr>
                            </thead><tbody>`

                for (let i = 0 ; i < data.length ; i++) {
                    content += getBlog(data[i]);
                }
                content += `</tbody>`
                document.getElementById('blog-table').innerHTML = content;
            }
        });
        event.preventDefault();
    });

    // $(window).on("scroll", function (event) {
    //     $.ajax({
    //         type: "GET",
    //         url: `api/blog/list?page=${pageSize}`,
    //         success: function (data) {
    //             for (let i = 0 ; i < data.length ; i++) {
    //                 console.log(data[i]);
    //                 contentBlog += readBlog(data[i]);
    //             }
    //             debugger
    //             $('#container-blog').html(contentBlog);
    //             pageSize++;
    //         }
    //     })
    //     event.preventDefault();
    // });

    $('#add-blog').on("click", function (event) {
        $.ajax({
            type: "GET",
            url: `api/blog/list?page=${pageSize}`,
            success: function (data) {
                if (data.length === 0) {
                    document.getElementById('add-blog').disabled = true;
                }
                for (let i = 0 ; i < data.length ; i++) {
                    console.log(data[i]);
                    contentBlog += readBlog(data[i]);
                }
                debugger
                $('#container-blog').html(contentBlog);
                pageSize++;
            }
        })
        event.preventDefault();
    });

});
function getCodeProduct(e) {
    let codeProduct = e.dataset.edt;
    console.log("codeProduct: " + codeProduct);
    document.getElementById("edt").value = codeProduct;
}
function getCodeProductDel(e) {
    let codeProduct = e.dataset.del;
    console.log("codeProduct: " + codeProduct);
    document.getElementById("del").value = codeProduct;
}
function doEdit() {
    let codeProduct = document.getElementById("edt").value;
    window.location.href = "/edit/" + codeProduct;
}
function doDelete() {
    let codeProduct = document.getElementById("del").value;
    window.location.href = "/delete/" + codeProduct;
}