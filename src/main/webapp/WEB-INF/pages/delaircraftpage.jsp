<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>"AVIA / Spring-Hibernate" - Delete Aircraft Page</title>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css"/>
</head>

<body>

<div class ="head"><span class="head1">Delete aircraft</span></div>
<p>

<table class="tb_main">
  <tr align="center">
    <td valign="top" align="right" width="40%">
      <div class ="head2">&nbsp;</div>

      <form:form method="POST" action="aircraftDelAction" modelAttribute="Aircraft">

        <table>

          <tr>
            <td class="tb_other">Select ID of the record you want to delete.</td>
            <td class="tb_other" align="right">
              <form:select path="aircraftId">
                <c:forEach var="aircraft" items="${listAircrafts}">
                  <option value="${aircraft.aircraftId}">
                      ${aircraft.aircraftId}
                  </option>
                </c:forEach>
              </form:select>
            </td>
          </tr>

          <tr align="right">
            <td colspan="2" align="right"><br><button class = "btn" type="submit">Delete record</button></td>
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
