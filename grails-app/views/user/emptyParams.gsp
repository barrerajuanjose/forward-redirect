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
<h2>${text}</h2>

<span>
    <p>${error}</p>
</span>
<h2>Path</h2>
<span>
<g:each in="${path}" var="position">
    <p>${position}</p>
</g:each>
</span>
</body>
</html>