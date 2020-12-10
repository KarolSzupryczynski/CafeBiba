<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Lista książek</h1>
<a href="<c:url value="/form" />">Dodaj książkę</a>
<ul>
    <c:forEach items="${books}" var="books">
        <li>
            <h4>Tytuł:${books.title}</h4>
            <p>Autor: ${books.author.name}</p>
            <p>Kategoria: ${books.category.name}</p>
            <a href="<c:url value="/editform/${books.id}" />">Edytuj</a>
            <a href="<c:url value="/viewbook/${books.id}" />">Szczegóły</a>

        </li>
    </c:forEach>
</ul>
</body>
</html>