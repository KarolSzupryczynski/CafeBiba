<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Books</h1>
<a href="<c:url value="/form" />">Add book</a>
<ul>
    <c:forEach items="${books}" var="book">
        <li>
            <h4>Title:${book.title}</h4>
            <p>Publisher: ${book.publisher.name}</p>
            <p>Rating: ${book.rating}</p>
            <p>Authors:</p>
            <ul>
                <c:forEach items="${book.authors}" var="author">
                    <li>${author.firstName} ${author.lastName}</li>
                </c:forEach>
            </ul>
            <a href="<c:url value="/book/form/${book.id}" />">Edit</a>
        </li>
    </c:forEach>
</ul>
</body>
</html>