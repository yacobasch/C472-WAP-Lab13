<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Aradom Tassew, Dagm Feleke, Yacob Tsegaye
  Date: 3/15/19
  Time: 2:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Abyssinia Movie</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" type="text/css" href="resources/css/main.css"/>
    <link rel="shortcut icon" type="image/png" href="resources/images/logo.jpg"/>
</head>
<body id="top">

<header>
    <div class="container">
        <a class="logo" href="/home"><img src="resources/images/logo.jpg" Width="5%" alt="Logo"></a>
        <ul class="main-menu" id="main-menu">
            <li><a href="/home#action">ACTION</a></li>
            <li><a href="/home#adventure">ADVENTURE</a></li>
            <li><a href="/home#animation">ANIMATION</a></li>
            <li><a href="/home#comedy">COMEDY</a></li>
            <li><a href="/home#horror">HORROR</a></li>
            <li><a href="/home#sci-fi">SCI-FI</a></li>
            <li><a href="/publish">PUBLISH</a></li>
            <c:if test="${loogedinUser != null}" >
                <li><a href="/wishlistcontrol">WISHLIST</a></li>
            </c:if>
            <c:if test="${loogedinUser != null}" >
                 <li><a href="/logout">Logout</a></li>
            </c:if>

        </ul>

    </div>
</header>
<br><br>