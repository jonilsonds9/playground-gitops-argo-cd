<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Outra Página</title>
</head>
<body>
    <h1>Outra Página</h1>
    <p>Esta é outra página da aplicação web.</p>
    <p><a href="<c:url value="/"/>">Voltar</a></p>

    <p>Versão: ${appVersion}</p>
</body>
</html>
