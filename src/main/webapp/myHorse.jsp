
<%@ page import="java.util.List" %>
<%@ page import="java.util.Set" %>

<%@ page import="servlet.HorseServlet" %>
<%@ page import="servlet.SelectHorseServlet" %>
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
<body style="background: url(image/o-loshadjah-3.jpg)">
<%@include file="header.jsp" %>

<center>
    <table border="3" width="50%">

        <caption align="left">MY HORSES</caption>
        <tr>
            <th>TYPE</th>
            <th>AGE</th>
            <th>PRICE</th>
<%--            <th colspan="2">Действия</th>--%>
        </tr>

        <jsp:useBean id="id" scope="request" type="java.lang.Integer"/>
        <jsp:useBean id="type" scope="request" type="java.lang.String"/>
        <jsp:useBean id="age" scope="request" type="java.lang.Integer"/>
        <jsp:useBean id="price" scope="request" type="java.lang.Integer"/>
        <%--        <c:forEach var="name" items="${name}">--%>

        <%--        <jsp:useBean id="teams" scope="request" type="java.util.Set"/>--%>
        <%--        <c:forEach var="team" items="${teams}">--%>

        <%--        <jsp:useBean id="games" scope="request" type="java.util.Set"/>--%>
        <%--        <c:forEach var="game" items="${games}">--%>

        <tr>
            <td>
                ${type}
            </td>

            <td>
                ${age}
            </td>

            <td>
                ${price}
            </td>



        </tr>
        <%--        </c:forEach>--%>

    </table>

    <a class="gradient-button1" href="HorseServlet">Back</a>
</center>
</body>
</html>
