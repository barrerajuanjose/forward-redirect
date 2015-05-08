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
<h1>FROM: ${from}</h1>
<h3>${text}</h3>

<h3>Path</h3>
<g:each in="${path}" var="position">
    <p>${position}</p>
</g:each>

<g:if test="${error}">
    <h3>Error en index</h3>
    <p>${error}</p>
</g:if>

</body>
</html>