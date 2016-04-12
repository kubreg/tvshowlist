<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<body>
<section>
    <form method="post" action="users">
        Login as: <select name="userId">
        <option value="100000" selected>User</option>
        <option value="100001">Admin</option>
    </select>
        <button type="submit">Выбрать</button>
    </form>
    <ul>
        <li><a href="users">User List</a></li>
        <li><a href="userSerials">User Serial List</a></li>
        <li><a href="serials">Serial List</a></li>
    </ul>
</section>
</body>
</html>
