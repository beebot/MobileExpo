<%--
  Created by IntelliJ IDEA.
  User: asuhov
  Date: 17.04.2015
  Time: 9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %-->
<html>
<head>
    <title></title>
</head>
<body>

<h3>This is a JAX-WS web service sample application. Please type your name</h3>

<form action="insult">
    Name: <input type="text" name="name"> <input type="submit" value="Insult me">
</form>
<br>

<!--c:out value="${insult}"></c:out-->

${insult}

  </body>
</html>
