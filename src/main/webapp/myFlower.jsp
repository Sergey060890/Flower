
<%@ page import="java.util.List" %>
<%@ page import="java.util.Set" %>

<%@ page import="servlet.FlowerServlet" %>
<%@ page import="servlet.SelectFlowerServlet" %>
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
    <table border="3" width="50%">

        <caption align="left">MY FLOWERS</caption>
        <tr>
            <th>NAME</th>
            <th>COLOR</th>
            <th>SIZE</th>
            <th>PRIZE</th>
<%--            <th colspan="2">Действия</th>--%>
        </tr>

        <jsp:useBean id="id" scope="request" type="java.lang.Integer"/>
        <jsp:useBean id="name" scope="request" type="java.lang.String"/>
        <jsp:useBean id="color" scope="request" type="java.lang.String"/>
        <jsp:useBean id="size" scope="request" type="java.lang.String"/>
        <jsp:useBean id="prize" scope="request" type="java.lang.Integer"/>
        <%--        <c:forEach var="name" items="${name}">--%>

        <%--        <jsp:useBean id="teams" scope="request" type="java.util.Set"/>--%>
        <%--        <c:forEach var="team" items="${teams}">--%>

        <%--        <jsp:useBean id="games" scope="request" type="java.util.Set"/>--%>
        <%--        <c:forEach var="game" items="${games}">--%>

        <tr>
            <td>
                ${name}
            </td>

            <td>
                ${color}
            </td>

            <td>
                ${size}
            </td>

            <td>
                ${prize}
            </td>

        </tr>
        <%--        </c:forEach>--%>

    </table>

    <a class="gradient-button1" href="FlowerServlet">Back</a>
</center>
</body>
</html>
