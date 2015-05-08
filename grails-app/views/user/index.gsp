<%--
  Created by IntelliJ IDEA.
  User: jbarrera
  Date: 5/7/15
  Time: 10:28 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<h2>${name}</h2>
<h2>${color}</h2>

<h2>Path</h2>
<g:each in="${path}" var="position">
    <p>${position}</p>
</g:each>

</body>
</html>