<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="header.jsp" %>
<h3>Editing</h3>

<form method="post">
    <input type="hidden" value="${horse.id}" name="id" />

    <label>type</label><br>
    <label>
        <input name="type" value="${type}"  required/>
    </label><br><br>

    <label>age </label><br>
    <input name="age" value="${age}" /><br><br>

    <label>price </label><br>
    <input name="price" value="${price}" /><br><br>

    <input type="submit" value="SAVE" />
</form>
<a class="gradient-button1" href="HorseServlet" />BACK</a>
</body>
</html>
