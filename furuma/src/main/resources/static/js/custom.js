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