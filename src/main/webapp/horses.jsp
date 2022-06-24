

<%@ page import="java.util.List" %>

<%@ page import="java.util.Set" %>

<%@ page import="servlet.HorseServlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page isELIgnored = "false" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%--
  Created by IntelliJ IDEA.
  User: Сергей Медвецкий
  Date: 25.05.2022
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>

</head>
<body style="background: url(image/rQeFCu.jpg)">
<%@include file="header.jsp" %>
<center>
    <h2>Horses management</h2>
    <table border="3" width="50%">
        <tr>
            <th>Type</th>
            <th>Age</th>
            <th>Price</th>
            <th colspan="3"><center>Actions</center></th>
        </tr>

        <jsp:useBean id="horses" scope="request" type="java.util.List"/>
        <c:forEach var="horse" items="${horses}">
            <tr>
                <td>${horse.type}</td>
                <td>${horse.age}</td>
                <td>${horse.price}</td>

                <td>
                    <a class="gradient-button" href='<c:url value="select?id=${horse.id}" />'>SELECT</a>
                </td>

                <td>
                    <a class="gradient-button" href='<c:url value="edit?id=${horse.id}" />'>EDIT HOURSE</a>
                </td>

                <td>
                    <a class="gradient-button" href='<c:url value="delete?id=${horse.id}" />'>DELETE HOURSE</a>
                </td>
            </tr>
        </c:forEach>

    </table>
    <a class="gradient-button1" href="create">ADD HOURSE</a>

    <a class="gradient-button1" href="index.jsp">BACK</a>

</center>
</body>
</html>
