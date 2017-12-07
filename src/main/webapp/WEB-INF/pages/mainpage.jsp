<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>airssssssssssssss 11</title>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>

<a href="../../index.jsp">Back to main menu</a>


<br>
<br>

<h1>списоккккк</h1>
  <table class="tg">
    <tr>
      <th>aircraft ID</th>
      <th>aircraft name</th>
      <th>number of passengers</th>
      <th>maximum weight, kg</th>
      <th>maximum flight range, km</th>
    </tr>

    <c:forEach items="${listAirs222}" var="aircraft">
      <tr>
        <td>${aircraft.aircraftId}</td>
        <td>${aircraft.aircraftName}</td>
        <td>${aircraft.aircraftPassengers}</td>
        <td>${aircraft.aircraftMaxWeightKg}</td>
        <td>${aircraft.aircraftMaxRangeKm}</td>
      </tr>
    </c:forEach>
  </table>


<table class="tg">
  <tr>
    <th>company ID</th>
    <th>company name</th>
    <th>company country</th>
  </tr>

  <c:forEach items="${listComs222}" var="company">
    <tr>
      <td>${company.companyId}</td>
      <td>${company.companyName}</td>
      <td>${company.companyCountry}</td>
    </tr>
  </c:forEach>
</table>



</body>
</html>
