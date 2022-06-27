function idMuonSach(e) {
    let codeProduct = e.dataset.edt;
    console.log("codeProduct: " + codeProduct);
    document.getElementById("edt").value = codeProduct;
}

function idTraSach(e) {
    let codeProduct = e.dataset.user;
    console.log("codeProduct: " + codeProduct);
    document.getElementById("del").value = codeProduct;
}

function muonSach() {
    let codeProduct = document.getElementById("edt").value;
    window.location.href = "/borrow/" + codeProduct;
}

function traSach() {
    let codeProduct = document.getElementById("del").value;
    window.location.href = "/give/" + codeProduct;
}