<%--
  Created by IntelliJ IDEA.
  User: karols
  Date: 09.12.2020
  Time: 22:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Lista autorów</h1>
<ul>
    <c:forEach items="${authors}" var="authors">
        <li>
            <h4>${authors.name}</h4>
            <a href="<c:url value="/delete/${authors.id}" />">Usuń</a>
        </li>
    </c:forEach>
</ul>
</body>
</html>