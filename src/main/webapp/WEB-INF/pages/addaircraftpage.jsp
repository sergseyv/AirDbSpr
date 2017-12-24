<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>"AVIA / Spring-Hibernate" - Add Aircraft Page</title>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles1.css"/>
</head>

<body>

<div class ="head">&nbsp;</div>
<p>

<table class="tb_main">
  <tr align="center">
    <td valign="top" align="right" width="40%">
      <div class ="head2">Add aircraft</div>

      <form:form method="POST" action="aircraftAddDo" modelAttribute="Aircraft">

        <table>

          <tr>
            <td class="tb_other"><form:label path="aircraftName">Aircraft name:</form:label></td>
            <td class="tb_other"><form:input path="aircraftName"/></td>
          </tr>
          <tr>
            <td colspan="2" valign="top" align="right"> &nbsp; <form:errors path="aircraftName" cssClass="valid_error" /> </td>
          </tr>

          <tr>
            <td class="tb_other"><form:label path="aircraftPassengers">Number of passengers:</form:label></td>
            <td class="tb_other"><form:input path="aircraftPassengers"/></td>
          </tr>
          <tr>
            <td colspan="2" valign="top" align="right"> &nbsp;





              <form:errors path="aircraftPassengers" cssClass="valid_error" /> </td>
          </tr>

          <tr>
            <td class="tb_other"><form:label path="aircraftMaxWeightKg">Maximum weight: <small>(numbers only!)</small></form:label></td>
            <td class="tb_other"><form:input path="aircraftMaxWeightKg"/></td>
          </tr>
          <tr>
            <td colspan="2" valign="top" align="right"> &nbsp; <form:errors path="aircraftMaxWeightKg" cssClass="valid_error" /> </td>
          </tr>

          <tr>
            <td class="tb_other"><form:label path="aircraftMaxRangeKm">Maximum flight range, km: <small>(numbers only!)</small></form:label></td>
            <td class="tb_other"><form:input path="aircraftMaxRangeKm"/></td>
          </tr>
          <tr>
            <td colspan="2" valign="top" align="right"> &nbsp; <form:errors path="aircraftMaxRangeKm" cssClass="valid_error" /> </td>
          </tr>

          <tr align="right">
            <td class="tb_other"><button class = "btn" type="reset">Clear form</button></td>
            <td class="tb_other"><button class = "btn" type="submit">Add to database</button></td>
          </tr>
        </table>
      </form:form>
      <button class = "btn" onclick="location.href='mainPageShow'">Return to Main Page</button>

    </td>

    <td valign="top" align="center">
      <div class ="head2">aircrafts</div>
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

  </tr>
</table>

</body>
</html>
