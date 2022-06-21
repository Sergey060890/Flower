<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Создание цветка</title>
</head>
<body>
<%@include file="header.jsp" %>
<h3>Creation of a flower</h3>
<form method="post">
    <br>
    <input name="name" required placeholder="Enter name" style="width: 250px;"/><br><br>
    <input name="color" placeholder="Enter color" style="width: 250px;" /><br><br>
    <input name="size" placeholder="Enter size" style="width: 250px;" /><br><br>
    <input name="price" placeholder="Enter price" style="width: 250px;" /><br><br>
    <input type="submit" value="CREATE" />
</form>
<a class="gradient-button1" href="FlowerServlet" />BACK</a>
</body>
</html>