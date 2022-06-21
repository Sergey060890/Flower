<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@include file="headerTeam.jsp" %>
<h3>Редактирование цветка</h3>

<form method="post">
    <input type="hidden" value="${flower.id}" name="id" />

    <label>название</label><br>
    <label>
        <input name="name" value="${name}"  required/>
    </label><br><br>


    <label>цвет </label><br>
    <input name="color" value="${color}" /><br><br>

    <label>размер </label><br>
    <input name="size" value="${size}" /><br><br>

    <label>стоимость </label><br>
    <input name="price" value="${price}" /><br><br>

    <input type="submit" value="Сохранить" />
</form>
<a class="gradient-button" href="FlowerServlet" />Вернуться назад</a>
</body>
</html>
