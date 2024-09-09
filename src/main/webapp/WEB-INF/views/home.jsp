<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
    <h1>Bem-vindo ao Ambiente: ${environmentName}</h1>
    <p>Este é um exemplo de aplicação web com Spring Boot e JSP.</p>
    <p><a href="<c:url value="/another"/>">Outra Página</a></p>

    <p>Versão: ${appVersion}</p>
</body>
</html>
