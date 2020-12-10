<%--
  Created by IntelliJ IDEA.
  User: karols
  Date: 09.12.2020
  Time: 01:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form"
           uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Book add</title>
</head>
<body>
<c:url var="edit_url" value="/editform"/>
<form:form method="post" modelAttribute="book" action="${edit_url}">
    <section>
        <label>Dodaj tytuł:</label>
        <form:hidden path="id"/>
        <form:input path="title" placeholder="tytuł"/>
        <form:errors path="title"/>
    </section>
    <section>
        <label>Dodaj autora:</label>
        <form:input path="authors.name" placeholder="nazwisko imię"/>
        <form:errors path="author"/>
    </section>
    <section>
        <label>Dodaj numer isbn:</label>
        <form:input path="isbn" placeholder="Isbn"/>
        <form:errors path="isbn"/>
    </section>
    <section>
        <label>Dodaj rok wydania:</label>
        <form:input path="issueDate" placeholder="Data wydania"/>
        <form:errors path="issueDate"/>
    </section>
    <section>
        <label>Dodaj wydawnictwo:</label>
        <form:input path="publisher" placeholder="Wydawca"/>
        <form:errors path="publisher"/>
    </section>
    <section>
        <button type="submit" value="Save">Edytuj książke</button>
    </section>
</form:form>

</body>
</html>