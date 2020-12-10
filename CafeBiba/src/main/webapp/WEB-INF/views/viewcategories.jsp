<%--
  Created by IntelliJ IDEA.
  User: karols
  Date: 09.12.2020
  Time: 22:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
</head>
<body>
<h1>Lista kategorii</h1>
<ul>
    <c:forEach items="${categories}" var="categories">
        <li>
            <h4>${categories.name}</h4>
        </li>
    </c:forEach>
</ul>
</body>
</html>