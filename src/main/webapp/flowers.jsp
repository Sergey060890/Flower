

<%@ page import="java.util.List" %>

<%@ page import="java.util.Set" %>

<%@ page import="servlet.FlowerServlet" %>
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

<body>
<%@include file="header.jsp" %>
<center>
    <h2>Flowers management</h2>
    <table border="3" width="50%">
        <tr>
            <th>Name</th>
            <th>Color</th>
            <th>Size</th>
            <th>Price</th>
            <th colspan="3"><center>Actions</center></th>
        </tr>

        <jsp:useBean id="flowers" scope="request" type="java.util.List"/>
        <c:forEach var="flower" items="${flowers}">
            <tr>
                <td>${flower.name}</td>
                <td>${flower.color}</td>
                <td>${flower.size}</td>
                <td>${flower.price}</td>

                <td>
                    <a class="gradient-button" href='<c:url value="select?id=${flower.id}" />'>SELECT</a>
                </td>

                <td>
                    <a class="gradient-button" href='<c:url value="edit?id=${flower.id}" />'>EDIT FLOWER</a>
                </td>

                <td>
                    <a class="gradient-button" href='<c:url value="delete?id=${flower.id}" />'>DELETE FLOWER</a>
                </td>
            </tr>
        </c:forEach>

    </table>
    <a class="gradient-button1" href="create">ADD FLOWER</a>

    <a class="gradient-button1" href="index.jsp">BACK</a>

</center>
</body>
</html>
