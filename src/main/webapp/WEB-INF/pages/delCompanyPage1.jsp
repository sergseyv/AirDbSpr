<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>"AVIA / Spring-Hibernate" - Delete Company Page</title>
  <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
</head>

<body>

<div class ="head"><span class="head1">Delete company</span></div>
<p>

<table class="tb_main">
  <tr align="center">
    <td valign="top" align="right" width="40%">
      <div class ="head2">&nbsp;</div>

      <form:form method="POST" action="companyDelAction" modelAttribute="Company">

        <table>

          <tr>
            <td class="tb_other">Select ID of the record you want to delete.</td>
            <td class="tb_other" align="right">
              <form:select path="companyId">
                <c:forEach var="company" items="${listCompanies}">
                  <option value="${company.companyId}">
                      ${company.companyId}
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
      <div class ="head2">companies</div>

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

  </tr>
</table>

</body>
</html>
