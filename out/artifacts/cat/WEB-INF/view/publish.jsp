<%--
  Created by IntelliJ IDEA.
  User: Aradom Tassew, Dagm Feleke, Yacob Tsegaye
  Date: 3/15/19
  Time: 2:36 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="header.jsp"></jsp:include>

<div id="main">
    <div class="inner">

        <form action="/publish" method="post" enctype="multipart/form-data">
            <div class="container">
                <br><br>
                <h1>Publish</h1>
                <input id = "title" type="text" placeholder="Title" name="title" required>
                <br>
                <input id = "image" type="file" placeholder="Image" name="image" required>
                <br><br>
                <input id="video" type="file" placeholder="Video" name="video" required>
                <br><br>
                <input id="actors" type="text" placeholder="Actors" name="actors" required>
                <br><br>
                <input id="rating" type="text" placeholder="Rating" name="rating" required>
                <br><br>
                <textarea id="desc"  placeholder="Movie Description" name="desc" required></textarea>
                <br>
                <button type="submit">Publish</button>
                <br>
            </div>
        </form>

    </div>

    </div>

    <footer id="footer">
        <div class="inner">
            <h2>Abyssinia Stream</h2>
            <p>Abyssinia Stream is the home of amazing original programming that you can’t find anywhere else.
                Movies, TV shows, specials and more, it’s all tailored specifically to you.</p>
        </div>
    </footer>

    <script src="resources/js/jquery.min.js"></script>

    </body>
    </html>

