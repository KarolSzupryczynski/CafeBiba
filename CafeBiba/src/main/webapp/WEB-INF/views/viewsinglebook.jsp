<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Szczegóły książki</h1>
<ul>
        <li>
            <h4>Tytuł:${books.title}</h4>
            <p>Autor: ${books.author.name}</p>
            <p>ISBN: ${books.isbn}</p>
            <p>Rok wydania: ${books.issueDate}</p>
            <p>Wydawnictwo: ${books.publisher}</p>
            <a href="<c:url value="/editform/${books.id}" />">Edytuj</a>
            <a href="<c:url value="/delete/${books.id}" />">Usuń</a>
        </li>
</ul>
</body>
</html>