<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Jabłka</title>
</head>
<body>

<h1>Oto dział w jabłkami:</h1>

<form action="${pageContext.request.contextPath}/add-to-basket" method="post">
    <input type="hidden" name="item" value="jabłko">
    <input type="submit" value="Kup jabłko">
    <input type="number" name="quantity">
</form>
<form action="${pageContext.request.contextPath}/sell-from-basket" method="post">
    <input type="hidden" name="item" value="jabłko">
    <input type="submit" value="Sprzedaj jabłko">
    <input type="number" name="quantity">
</form>

<form action="${pageContext.request.contextPath}/index.jsp" method="get">
    <input type="submit" value="Rozmyslilem sie">
</form>



</body>
</html>
