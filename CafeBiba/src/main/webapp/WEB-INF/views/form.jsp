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
        <label>Dodaj tytuł</label>
        <form:hidden path="id"/>
        <form:input path="title" placeholder="Title"/>
        <form:errors path="title"/>
    </section>
    <section>
        <label>Dodaj autora (nazwisko, imię):</label>
        <form:input path="author" placeholder="Author"/>
        <form:errors path="title"/>
    </section>
    <section>
        <label>Dodaj numer isbn:</label>
        <form:input path="isbn" placeholder="Isbn"/>
        <form:errors path="isbn"/>
    </section>
    <section>
        <label>Dodaj rok wydania:</label>
        <form:input path="issuedate" placeholder="IssueDate"/>
        <form:errors path="issuedate"/>
    </section>
    <section>
        <label>Dodaj wydawcę:</label>
        <form:input path="publisher" placeholder="Publisher"/>
        <form:errors path="pages"/>
    </section>
    <section>
        <button type="submit">Save</button>
    </section>
</form:form>

</body>
</html>