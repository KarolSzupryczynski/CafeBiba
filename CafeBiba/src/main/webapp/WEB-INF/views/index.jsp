<%--
  Created by IntelliJ IDEA.
  User: karols
  Date: 08.12.2020
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Strona główna</title>
</head>
<body>
<c:url var="edit_url" value="/main"/>
<ul>

        <li>
            <a href="<c:url value="/form" />">Dodaj książkę</a>
            <a href="<c:url value="/books" />">Moje książki</a>
            <a href="<c:url value="/authors" />">Autorzy</a>
            <a href="<c:url value="/categories" />">Kategorie</a>
        </li>
</ul>
</body>
</html>