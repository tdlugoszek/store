<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pomarańcze</title>
</head>
<body>

<h1>Oto dział z pomarańczami:</h1>

<form action="${pageContext.request.contextPath}/add-to-basket" method="post">
    <input type="hidden" name="item" value="pomarancza">
    <input type="submit" value="Kup pomarancze">
    <input type="number" name="quantity">
</form>
<form action="${pageContext.request.contextPath}/index.jsp" method="get">
    <input type="submit" value="Rozmyslilem sie">
</form>
</body>
</html>
