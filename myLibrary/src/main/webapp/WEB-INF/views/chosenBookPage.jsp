<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Chosen book</title>
</head>
<body>
Book:
<br/>
<c:set var="book" value="${book}"/>
${book}<br>
<a href="<%="/"%>"> Return Home </a>
</body>
</html>