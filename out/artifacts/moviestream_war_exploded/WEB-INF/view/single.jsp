<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="header.jsp"></jsp:include>


<div id="main">
    <div class="inner">
        <div class="video">
            <video src="resources/videos/<c:out value="${movies}" />" controls width="80%">
                Your browser does not support the video tag.
            </video>
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