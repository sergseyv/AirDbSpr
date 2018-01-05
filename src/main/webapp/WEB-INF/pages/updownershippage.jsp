<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>"AVIA / Spring-Hibernate" - Upd Ownership Page</title>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
</head>

<body>

<div class ="head"><span class="head1">Update ownership</span></div>
<p>

<table class="tb_main">
  <tr align="center">
    <td valign="top" align="right" width="40%">
      <div class ="head2">&nbsp;</div>

      <form:form method="POST" action="ownershipUpdAction" modelAttribute="Ownership">

        <table>
          <tr>
            <td class="tb_other">Select ID of the record you want to edit.</td>
            <td class="tb_other" align="right">
              <form:select path="ownershipId">
                <c:forEach var="ownership" items="${listOwnerships}">
                  <option value="${ownership.ownershipId}">  ${ownership.ownershipId}  </option>
                </c:forEach>
              </form:select>
            </td>
          </tr>
          <tr>
            <td colspan="2" align="right">
              <c:set var="isError"><form:errors path="ownershipId"/></c:set>
              <div class ="${not empty isError ? "errYes": "errNo"}">Please, select ownership's ID &nbsp;</div>
            </td>
          </tr>

          <tr>
            <td class="tb_other">Company's ID:</td>
            <td class="tb_other"><form:input path="ownershipIdCompanies"/></td>
          </tr>
          <tr>
            <td colspan="2" align="right">
              <c:set var="isError"><form:errors path="ownershipIdCompanies"/></c:set>
              <div class ="${not empty isError ? "errYes": "errNo"}">Please, enter the number from 1 to 1 000 000 &nbsp;</div>
            </td>
          </tr>

          <tr>
            <td class="tb_other">Aircraft's ID: </td>
            <td class="tb_other"><form:input path="ownershipIdAircraft"/></td>
          </tr>
          <tr>
            <td colspan="2" align="right">
              <c:set var="isError"><form:errors path="ownershipIdAircraft"/></c:set>
              <div class ="${not empty isError ? "errYes": "errNo"}">Please, enter the number from 1 to 1 000 000&nbsp;</div>
            </td>
          </tr>

          <tr>
            <td class="tb_other">Quantity of aircrafts: </td>
            <td class="tb_other"><form:input path="ownershipQuantity"/></td>
          </tr>
          <tr>
            <td colspan="2" align="right">
              <c:set var="isError"><form:errors path="ownershipQuantity"/></c:set>
              <div class ="${not empty isError ? "errYes": "errNo"}">Please, enter the number from 0 to 100 000 &nbsp;</div>
            </td>
          </tr>

          <tr align="right">
            <td colspan="2" align="right"><br><button class = "btn" type="submit">Update record</button></td>
          </tr>
        </table>
      </form:form>
      <button class = "btn" onclick="location.href='mainPageShow'">Return to Main Page</button>

    </td>

    <td valign="top" align="center">
      <div class ="head2">ownerships</div>

      <table class="tb_info">
        <tr>
          <th>ownership ID</th>
          <th>company ID</th>
          <th>ownership ID</th>
          <th>quantity of ownerships</th>
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
