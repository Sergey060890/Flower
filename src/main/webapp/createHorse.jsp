<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
</head>
<body>
<%@include file="header.jsp" %>
<h3>Adding a new horse</h3>
<form method="post">
    <br>
    <input name="type" required placeholder="Enter type" style="width: 250px;"/><br><br>
    <input name="age" placeholder="Enter age" style="width: 250px;" /><br><br>
    <input name="price" placeholder="Enter price" style="width: 250px;" /><br><br>
    <input type="submit" value="CREATE" />
</form>
<a class="gradient-button1" href="HorseServlet" />BACK</a>
</body>
</html>