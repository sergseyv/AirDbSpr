<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>airssssssssssssss 11</title>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style2.css"/>
</head>

<body>
<div class ="head">
  <p>Now we have database with 3 tables:
    <span class="head1">"aircrafts"</span>,
    <span class="head1">"companies"</span> and
    <span class="head1">"ownership"</span>.
  <p>You can
    <span class="head1">Add</span>,
    <span class="head1">Update</span>, and
    <span class="head1">Delete</span> records from tables.
  <p>Also, you can scroll down the page and see several JOIN-queries.
</div>
<p>&nbsp;
<table class="tb_main">
  <tr align="center">
    <td valign="top" width="40%">
      <div class ="head2">aircrafts</div>
      <table class="tb_edit">
        <tr align="center">
          <td class="tb_edit_def" onMouseOver="className='tb_edit_over'" onMouseOut="className='tb_edit_out'"
            onClick="document.location='/addaircraft'"> Add </td>
          <td class="tb_edit_def" onMouseOver="className='tb_edit_over'" onMouseOut="className='tb_edit_out'"
              onClick="document.location='/updaircraft'"> Update </td>
          <td class="tb_edit_def" onMouseOver="className='tb_edit_over'" onMouseOut="className='tb_edit_out'"
              onClick="document.location='/delaircraft'"> Delete </td>
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







    <td valign="top" width="35%">

    <div class ="head2">companies</div>

    <table class="tb_edit">
      <tr align="center">
        <td class="tb_edit_def" onMouseOver="className='tb_edit_over'" onMouseOut="className='tb_edit_out'"
            onClick="document.location='/addcompany'"> Add </td>
        <td class="tb_edit_def" onMouseOver="className='tb_edit_over'" onMouseOut="className='tb_edit_out'"
            onClick="document.location='/updcompany'"> Update </td>
        <td class="tb_edit_def" onMouseOver="className='tb_edit_over'" onMouseOut="className='tb_edit_out'"
            onClick="document.location='/delcompany'"> Delete </td>
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
    <td valign="top" width="25%">
      <div class ="head2">ownership</div>

      <table class="tb_edit">
        <tr align="center">
          <td class="tb_edit_def" onMouseOver="className='tb_edit_over'" onMouseOut="className='tb_edit_out'"
              onClick="document.location='/addownership'"> Add </td>
          <td class="tb_edit_def" onMouseOver="className='tb_edit_over'" onMouseOut="className='tb_edit_out'"
              onClick="document.location='/updownership'"> Update </td>
          <td class="tb_edit_def" onMouseOver="className='tb_edit_over'" onMouseOut="className='tb_edit_out'"
              onClick="document.location='/delownership'"> Delete </td>
        </tr>
      </table>


      <table class="tb_info">
        <tr>
          <th>ownership ID</th>
          <th>company ID</th>
          <th>aircraft ID</th>
          <th>quantity of aircrafts</th>
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