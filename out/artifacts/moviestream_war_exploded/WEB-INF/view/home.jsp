<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="header.jsp"></jsp:include>
<div id="main">
    <div class="inner">

        <div class="thumbnails">
            <c:forEach items="${movies}" var="movie">
            <div class="box" width="30%">
                    <a href="/login?id=<c:out value='${movie.getMovieId()}'/>" class="image fit">
                    <img src="resources/images/<c:out value="${movie.getImage()}"/>" alt="" /></a>
                <div class="inner">
                    <h3><c:out value="${movie.getTitle()}" /></h3>
                    <a href="/login?id=<c:out value='${movie.getMovieId()}'/>" class="button fit">Watch</a>
                    <p><c:out value="${movie.getMovieDescription()}" /></p>

                </div>
            </div>
            </c:forEach>
        </div>


        <h2 id="action">Action</h2>

        <div class="thumbnails">
            <c:forEach items="${action}" var="movie">
                <div class="box" width="30%">
                    <a href="/login?id=<c:out value='${movie.getMovieId()}'/>" class="image fit">
                        <img src="resources/images/<c:out value="${movie.getImage()}"/>" alt="" /></a>
                    <div class="inner">
                        <h3><c:out value="${movie.getTitle()}" /></h3>
                        <a href="/login?id=<c:out value='${movie.getMovieId()}'/>" class="button fit">Watch</a>
                        <p><c:out value="${movie.getMovieDescription()}" /></p>
                    </div>
                </div>
            </c:forEach>
        </div>


        <h2 id="adventure">Adventure</h2>

        <div class="thumbnails">
            <c:forEach items="${adventure}" var="movie">
                <div class="box" width="30%">
                    <a href="/login?id=<c:out value='${movie.getMovieId()}'/>" class="image fit">
                        <img src="resources/images/<c:out value="${movie.getImage()}"/>" alt="" /></a>
                    <div class="inner">
                        <h3><c:out value="${movie.getTitle()}" /></h3>
                        <a href="/login?id=<c:out value='${movie.getMovieId()}'/>" class="button fit">Watch</a>
                        <p><c:out value="${movie.getMovieDescription()}" /></p>
                    </div>
                </div>
            </c:forEach>
        </div>


        <h2 id="animation">Animation</h2>

        <div class="thumbnails">
            <c:forEach items="${animation}" var="movie">
                <div class="box" width="30%">
                    <a href="/login?id=<c:out value='${movie.getMovieId()}'/>" class="image fit">
                        <img src="resources/images/<c:out value="${movie.getImage()}"/>" alt="" /></a>
                    <div class="inner">
                        <h3><c:out value="${movie.getTitle()}" /></h3>
                        <a href="/login?id=<c:out value='${movie.getMovieId()}'/>" class="button fit">Watch</a>
                        <p><c:out value="${movie.getMovieDescription()}" /></p>
                    </div>
                </div>
            </c:forEach>
        </div>


        <h2 id="comedy">Comedy</h2>

        <div class="thumbnails">
            <c:forEach items="${comedy}" var="movie">
                <div class="box" width="30%">
                    <a href="/login?id=<c:out value='${movie.getMovieId()}'/>" class="image fit">
                        <img src="resources/images/<c:out value="${movie.getImage()}"/>" alt="" /></a>
                    <div class="inner">
                        <h3><c:out value="${movie.getTitle()}" /></h3>
                        <a href="/login?id=<c:out value='${movie.getMovieId()}'/>" class="button fit">Watch</a>
                        <p><c:out value="${movie.getMovieDescription()}" /></p>
                    </div>
                </div>
            </c:forEach>
        </div>

        <h2 id="horror">Horror</h2>

        <div class="thumbnails">
            <c:forEach items="${horror}" var="movie">
                <div class="box" width="30%">
                    <a href="/login?id=<c:out value='${movie.getMovieId()}'/>" class="image fit">
                        <img src="resources/images/<c:out value="${movie.getImage()}"/>" alt="" /></a>
                    <div class="inner">
                        <h3><c:out value="${movie.getTitle()}" /></h3>
                        <a href="/login?id=<c:out value='${movie.getMovieId()}'/>" class="button fit">Watch</a>
                        <p><c:out value="${movie.getMovieDescription()}" /></p>
                    </div>
                </div>
            </c:forEach>
        </div>


        <h2 id="sci-fi">SCI-Fi</h2>

        <div class="thumbnails">
            <c:forEach items="${scifi}" var="movie">
                <div class="box" width="30%">
                    <a href="/login?id=<c:out value='${movie.getMovieId()}'/>" class="image fit">
                        <img src="resources/images/<c:out value="${movie.getImage()}"/>" alt="" /></a>
                    <div class="inner">
                        <h3><c:out value="${movie.getTitle()}" /></h3>
                        <a href="/login?id=<c:out value='${movie.getMovieId()}'/>" class="button fit">Watch</a>
                        <p><c:out value="${movie.getMovieDescription()}" /></p>
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
            TV shows, specials and more, it’s all tailored specifically to you.</p>
    </div>
</footer>

<script src="assets/js/jquery.min.js"></script>

</body>
</html>