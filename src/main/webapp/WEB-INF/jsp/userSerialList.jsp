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
            <th>Serial</th>
            <th>Current season</th>
            <th>Current series</th>
        </tr>
        </thead>
        <c:forEach items="${userSerialList}" var="userSerial">
            <jsp:useBean id="userSerial" scope="page" type="ru.lovkov.tvshowlist.model.UserSerial"/>
            <tr>
                <td><c:out value="${userSerial.serial.title}"/></td>
                <td><c:out value="${userSerial.currentSeason}"/></td>
                <td><c:out value="${userSerial.currentSeries}"/></td>
            </tr>
        </c:forEach>
    </table>
</section>
</body>
</html>
