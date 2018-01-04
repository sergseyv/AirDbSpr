<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>"AVIA / Spring-Hibernate" - View Ownership Page</title>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styles.css"/>
</head>

<body>

<div class ="head"><span class="head1">View ownership</span></div>
<p>

<table class="tb_main">
  <tr align="center">
    <td valign="top" align="right" width="40%">
      <div class ="head2">&nbsp;</div>

      <form:form method="POST" action="ownershipViewAction" modelAttribute="Ownership">

        <table>
          <tr>
            <td class="tb_other">Select ID of the record you want to view.</td>
            <td class="tb_other" align="right">
              <form:select path="ownershipId">
                <c:forEach var="ownership" items="${listOwnerships}">
                  <option value="${ownership.ownershipId}">  ${ownership.ownershipId}  </option>
                </c:forEach>
              </form:select>
            </td>
          </tr>

          <tr>
            <td class="tb_other">Ownership ID:</td>
            <td class="tb_other"><form:input path="ownershipId" readonly="true"/></td>
          </tr>

          <tr>
            <td class="tb_other">Ownership ID companiy:</td>
            <td class="tb_other"><form:input path="ownershipIdCompanies" readonly="true"/></td>
          </tr>

          <tr>
            <td class="tb_other">Ownership ID aircraft:</td>
            <td class="tb_other"><form:input path="ownershipIdAircraft" readonly="true"/></td>
          </tr>

          <tr>
            <td class="tb_other">Quantity: </td>
            <td class="tb_other"><form:input path="ownershipQuantity" readonly="true"/></td>
          </tr>

          <tr align="right">
            <td colspan="2" align="right"><br><button class = "btn" type="submit">View record</button></td>
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
