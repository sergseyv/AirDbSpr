<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>airssssssssssssss 11</title>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style1.css"/>
</head>

<body>

<div class ="head">
  <p>Now we have database with 3 tables: <b>"aircrafts"</b>, <b>"companies"</b> and <b>"ownership"</b>.
  <p>You can <b>Add</b>, <b>Update</b>, and <b>Delete</b> records from tables.
  <p>Also, you can scroll down the page and see several JOIN-queries.
</div>

<p>
<p>


<table class="tb_main">
  <tr align="center">
    <td valign="top" width="40%">
      <div class ="head2">aircrafts</div>
      <table class="tb_edit">
        <tr align="center">
          <td><a href="<c:url value='/addaircraft'/>">Add</a></td>
          <td><a href="<c:url value='/updaircraft'/>">Update</a></td>
          <td><a href="<c:url value='/delaircraft'/>">Delete</a></td>
        </tr>
      </table>

      <table class="tb_info">
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

    </td>







    <td valign="top" width="30%">

    <div class ="head2">companies</div>

    <table class="tb_edit">
        <tr align="center">
          <td><a href="<c:url value='/addcompany'/>">Add</a></td>
          <td><a href="<c:url value='/updcompany'/>">Update</a></td>
          <td><a href="<c:url value='/delcompany'/>">Delete</a></td>
        </tr>
      </table>


      <table class="tb_info">
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





    </td>
    <td valign="top" width="30%">
      <div class ="head2">ownership</div>

      <table class="tb_edit">
        <tr align="center">
          <td><a href="<c:url value='/addownership'/>">Add</a></td>
          <td><a href="<c:url value='/updownership'/>">Update</a></td>
          <td><a href="<c:url value='/delownership'/>">Delete</a></td>
        </tr>
      </table>


      <table class="tb_info">
        <tr>
          <th>id_ownership</th>
          <th>id_companies</th>
          <th>id_aircraft</th>
          <th>quantity</th>
        </tr>

        <c:forEach items="${listOwnerships}" var="ownership">
          <tr>
            <td>${ownership.ownershipId}</td>
            <td>${ownership.ownershipIdCompanies}</td>
            <td>${ownership.ownershipIdAircraft}</td>
            <td>${ownership.ownershipQuantity}</td>
          </tr>
        </c:forEach>
      </table>

    </td>
  </tr>
</table>

</body>
</html>
