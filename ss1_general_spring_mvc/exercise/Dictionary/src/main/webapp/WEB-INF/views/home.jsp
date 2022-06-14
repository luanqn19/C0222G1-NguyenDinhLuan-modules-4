<%--
  Created by IntelliJ IDEA.
  User: Dinh Luan
  Date: 6/14/2022
  Time: 10:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="container">
    <div class="justify-content-center text-center">
        <h1>Lorem Ipsum</h1>
        <p class="font-italic">"Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci
            velit..."</p>
        <p>"There is no one who loves pain itself, who seeks after it and wants to have it, simply because it is
            pain..."</p>
    </div>
    <hr>
    <div class="row">
        <div class="col-6">
            <h4>What is Lorem Ipsum?</h4>
            <p class="text-justify">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the
                industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and
                scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap
                into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the
                release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing
                software like Aldus PageMaker including versions of Lorem Ipsum.</p>
        </div>
        <div class="col-6">
            <h4>Why do we use it?</h4>
            <p class="text-justify">It is a long established fact that a reader will be distracted by the readable content of a page when
                looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution
                of letters, as opposed to using 'Content here, content here', making it look like readable English. Many
                desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a
                search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have
                evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).</p>
        </div>
    </div>
    <div class="row">
        <div class="col-6">
            <h4>Where does it come from?</h4>
            <p class="text-justify">Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical
                Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at
                Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a
                Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the
                undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of "de Finibus Bonorum et
                Malorum" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the
                theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, "Lorem ipsum dolor
                sit amet..", comes from a line in section 1.10.32.</p>
        </div>
        <div class="col-6">
            <h4>Where can I get some?</h4>
            <p class="text-justify">There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration
                in some form, by injected humour, or randomised words which don't look even slightly believable. If you
                are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden
                in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks
                as necessary, making this the first true generator on the Internet. It uses a dictionary of over 200
                Latin words, combined with a handful of model sentence structures, to generate Lorem Ipsum which looks
                reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or
                non-characteristic words etc.</p>
        </div>
    </div>
</div>
</body>
</html>
