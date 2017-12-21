<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Books</title>
</head>
<body>
Books:
<br/>
<table border="1">
    <c:forEach items="${booksList}" var="book">
        <tr>
            <td>${book}</td>
        </tr>
    </c:forEach>
</table>
<br>
<a href="<%="/"%>"> Return Home </a>
</body>
</html>