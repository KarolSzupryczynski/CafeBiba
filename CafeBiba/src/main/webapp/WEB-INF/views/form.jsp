<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Dodaj książkę</title>
</head>
<body>

<form:form modelAttribute="book" method="post" action="/form">

    <section>
        <label>Dodaj tytuł:</label>
        <form:hidden path="id"/>
        <form:input path="title" placeholder="tytuł"/>
        <form:errors path="title"/>
    </section>
    <section>
        <label>Dodaj autora:</label>
        <form:input path="author.name" placeholder="nazwisko imię"/>
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
        <label>Dodaj kategorię:</label>
        <form:input path="category.name" placeholder="kategoria"/>
        <form:errors path="category"/>
    </section>
    <section>
        <button type="submit" value="Save">Dodaj książkę</button>
    </section>
</form:form>

</body>
</html>