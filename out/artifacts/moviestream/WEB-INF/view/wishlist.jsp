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
        <div class="thumbnails">
            <c:forEach items="${wishlist}" var="movie">
                <div class="box" width="30%">
                    <a href="/login?id=<c:out value='${movie.getMovieId()}'/>" class="image fit">
                        <img src="resources/images/<c:out value="${movie.getImage()}"/>" alt="" /></a>
                    <div class="inner">
                        <h3><c:out value="${movie.getTitle()}" /></h3>
                        <a href="/login?id=<c:out value='${movie.getMovieId()}'/>" class="button fit">Watch</a>
                        <p><c:out value="${movie.getMovieDescription()}" /></p>
                        <p><c:out value="${movie.getNumberOfViews()}" /> views | IMDB Rating <c:out value="${movie.getRating()}" /></p>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</div>

<footer id="footer">
    <div class="inner">
        <h2>Abyssinia Stream</h2>
        <p>Abyssinia Stream is the home of amazing original programming that you can’t find anywhere else. Movies,
            TV shows, specials and more, it is all tailored specifically to you.</p>
    </div>
</footer>

<script src="resources/js/jquery.min.js"></script>

</body>
</html>