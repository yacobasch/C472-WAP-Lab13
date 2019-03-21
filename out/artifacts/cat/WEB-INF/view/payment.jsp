<%--
  Created by IntelliJ IDEA.
  User: Aradom Tassew, Dagm Feleke, Yacob Tsegaye
  Date: 3/15/19
  Time: 2:36 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Abyssinia Movie</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link rel="stylesheet" type="text/css" href="resources/css/main.css"/>
    <script type="text/javascript" src="resources/js/payment.js"></script>
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
        </ul>

    </div>
</header>


<div id="main">
    <div class="inner">



        <form action="/payment" method="post">
            <br>
            <div class="container">
                <br><br>
                <h1>Payment</h1>
                <input id="card" type="text" placeholder="Card Number" name="card" required>
                <br>
                <input id="expdate" style="color:#000" type="date" placeholder="Expiration Date" name="expdate" required>
                <br><br>
                <input id="ccv" type="text" placeholder="CCV" name="ccv" required>
                <br>
                <input id="address" type="text" placeholder="Address" name="address" required>
                <br>
                <input id="zip" type="text" placeholder="Zip Code" name="zip" required>
                <br>
                <button type="submit">Use Card</button>
                <br>
            </div>
        </form>


    </div>
</div>

    <footer id="footer">
        <div class="inner">
            <h2>Abyssinia Stream</h2>
            <p>Abyssinia Stream is the home of amazing original programming that you can’t find anywhere else. Movies, TV shows, specials and more, it is all tailored specifically to you.</p>
        </div>
    </footer>

    <script src="resources/js/jquery.min.js"></script>

</body>
</html>

