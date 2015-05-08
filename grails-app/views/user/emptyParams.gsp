<%--
  Created by IntelliJ IDEA.
  User: jbarrera
  Date: 5/7/15
  Time: 10:40 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<h1>${from}</h1>
<h2>${text}</h2>

<h2>Path</h2>
<g:each in="${path}" var="position">
    <p>${position}</p>
</g:each>

<g:if test="${error}">
    <h2>Error en index</h2>
    <p>${error}</p>
</g:if>

</body>
</html>