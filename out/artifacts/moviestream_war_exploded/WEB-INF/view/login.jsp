<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="header.jsp"></jsp:include>
<div id="main">
    <div class="inner">

        <div class="thumbnails">

            <div class="box">

                <form action="/login" method="post">
                    <div class="container">
                        <br>
                        <h1>Login</h1>
                        <input type="text" placeholder="Enter Username" name="uname" required>
                        <br>
                        <input type="password" placeholder="Enter Password" name="pass" required>
                        <br>
                        <button type="submit">Login</button>
                        <br>
                        <label>
                            <input type="checkbox" checked="checked" name="remember"> Remember me
                        </label>
                    </div>
                </form>
            </div>

            <div class="box">

                <form action="/signup" method="post">
                    <div class="container">
                        <br>
                        <h1>Signup</h1>
                        <input id="uname" type="text" placeholder="Enter Username" name="uname" required>
                        <br>
                        <input id="email" type="text" placeholder="Enter Email" name="email" required>
                        <br>
                        <input id="pass" type="password" placeholder="Enter Password" name="pass1" required>
                        <br>
                        <input type="password" placeholder="Confirm Password" name="pass2" required>
                        <br>
                        <button type="submit">Signup</button>
                        <br>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

    <footer id="footer">
        <div class="inner">
            <h2>Abyssinia Stream</h2>
            <p>Abyssinia Stream is the home of amazing original programming that you can’t find anywhere else. Movies, TV shows, specials and more, it’s all tailored specifically to you.</p>
        </div>
    </footer>

    <script src="assets/js/jquery.min.js"></script>

</body>
</html>

