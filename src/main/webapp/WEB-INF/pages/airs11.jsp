<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>airssssssssssssss 11</title>
  <link rel="stylesheet" type="text/css" href="style.css"/>
</head>
<body>

<a href="../../index.jsp">Back to main menu</a>


<br>
<br>

<h1>списоккккк</h1>



  <table class="tg">
    <tr>
      <th><b>idAircraft</b>    <br>    <small>aircraft ID</small>              </th>
      <th><b>name</b>          <br>    <small>aircraft name</small>            </th>
      <th><b>passengers</b>    <br>    <small>number of passengers</small>     </th>
      <th><b>maxWeightKg</b>   <br>    <small>maximum weight, kg</small>       </th>
      <th><b>maxRangeKm</b>    <br>    <small>maximum flight range, km</small> </th>
      <th></th>
    </tr>

    <c:forEach items="${listAirs}" var="aircraft">
      <tr>
        <td>${aircraft.aircraftId}</td>
        <td>${aircraft.aircraftName}</td>
        <td>${aircraft.aircraftPassengers}</td>
        <td>${aircraft.aircraftMaxWeightKg}</td>
        <td>${aircraft.aircraftMaxRangeKm}</td>
      </tr>
    </c:forEach>
  </table>

</body>
</html>
