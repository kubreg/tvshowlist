<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<body>
<a href="/tvshowlist/">Home</a>
<section>
    <table border="1" cellpadding="8" cellspacing="0">
        <thead>
        <tr>
            <th>Id</th>
            <th>Titlte</th>
            <th>Actors</th>
            <th>Description</th>
            <th>Series</th>
            <th>Seasons</th>
            <th>Kinopoisk rating</th>
            <th>IMDB rating</th>
        </tr>
        </thead>
        <c:forEach items="${serialList}" var="serial">
            <jsp:useBean id="serial" scope="page" type="ru.lovkov.tvshowlist.model.Serial"/>
            <tr>
                <td><c:out value="${serial.id}"/></td>
                <td><c:out value="${serial.title}"/></td>
                <td><c:out value="${serial.actors}"/></td>
                <td><c:out value="${serial.description}"/></td>
                <td><c:out value="${serial.series}"/></td>
                <td><c:out value="${serial.seasons}"/></td>
                <td><c:out value="${serial.kpRating}"/></td>
                <td><c:out value="${serial.imdbRating}"/></td>
            </tr>
        </c:forEach>
    </table>
</section>
</body>
</html>
