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

<div align="center">
  <hr width="50%">
  <p><h2>Ok.</h2>
  <p>Now we have 3 tables: <samp><b>"aircrafts"</b></samp>, <samp><b>"companies"</b></samp> and <samp><b>"ownership"</b></samp>.
  <p>You can <b>Add</b>, <b>Update</b>, and <b>Delete</b> records from tables.
  <p>Also, you can scroll down the page and see several JOIN-queries.
  <p>
  <hr width="50%">
</div>

<table border="2" width="90%"  bgcolor="#ffcccc">
  <tr align="center">
    <td><a href="<c:url value='/addaircraft'/>">Add</a></td>
    <td><a href="<c:url value='/updaircraft'/>">Update</a></td>
    <td><a href="<c:url value='/delaircraft'/>">Delete</a></td>
  </tr>
</table>

<table class="tg">
    <tr>
      <th>aircraft ID</th>
      <th>aircraft name</th>
      <th>number of passengers</th>
      <th>maximum weight, kg</th>
      <th>maximum flight range, km</th>
    </tr>

    <c:forEach items="${listAircrafts}" var="aircraft">
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

  <c:forEach items="${listCompanies}" var="company">
    <tr>
      <td>${company.companyId}</td>
      <td>${company.companyName}</td>
      <td>${company.companyCountry}</td>
    </tr>
  </c:forEach>
</table>



</body>
</html>
