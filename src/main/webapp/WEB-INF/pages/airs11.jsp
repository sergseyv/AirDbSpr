<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>airssssssssssssss 11</title>

  <style type="text/css">
    .tg {
      border-collapse: collapse;
      border-spacing: 0;
      border-color: #ccc;
    }

    .tg td {
      font-family: Arial, sans-serif;
      font-size: 14px;
      padding: 10px 5px;
      border-style: solid;
      border-width: 1px;
      overflow: hidden;
      word-break: normal;
      border-color: #ccc;
      color: #333;
      background-color: #fff;
    }

    .tg th {
      font-family: Arial, sans-serif;
      font-size: 14px;
      font-weight: normal;
      padding: 10px 5px;
      border-style: solid;
      border-width: 1px;
      overflow: hidden;
      word-break: normal;
      border-color: #ccc;
      color: #333;
      background-color: #f0f0f0;
    }

    .tg .tg-4eph {
      background-color: #f9f9f9
    }
  </style>
</head>
<body>
<a href="../../index.jsp">Back to main menu</a>


<br/>
<br/>

<h1>списоккккк</h1>

<c:if test="${!empty listAirs}">
  <table class="tg">
    <tr>
      <th width="80">ID</th>
      <th width="120">Title</th>
      <th width="120">Author</th>
      <th width="120">Price</th>
      <th width="60">Edit</th>
      <th width="60">Delete</th>
    </tr>
    <c:forEach items="${listAirs}" var="aircraft">
      <tr>
        <td>${aircraft.aircraftId}</td>
        <td><a href="/airdata/${aircraft.aircraftId}" target="_blank">${aircraft.aircraftName}</a></td>
        <td>${aircraft.aircraftMaxRangeKm}</td>
        <td>${aircraft.aircraftMaxWeightKg}</td>
        <td><a href="<c:url value='/edit/${aircraft.aircraftId}'/>">Edit</a></td>
        <td><a href="<c:url value='/remove/${aircraft.aircraftId}'/>">Delete</a></td>
      </tr>
    </c:forEach>
  </table>
</c:if>


<h1>Add a craft</h1>

<c:url var="addAction" value="/airs11/add"/>

<form:form action="${addAction}" commandName="aircraft">
  <table>
    <c:if test="${!empty aircraft.aircraftName}">
      <tr>
        <td>
          <form:label path="id">
            <spring:message text="ID"/>
          </form:label>
        </td>
        <td>
          <form:input path="id" readonly="true" size="8" disabled="true"/>
          <form:hidden path="id"/>
        </td>
      </tr>
    </c:if>
    <tr>
      <td>
        <form:label path="bookTitle">
          <spring:message text="Title"/>
        </form:label>
      </td>
      <td>
        <form:input path="bookTitle"/>
      </td>
    </tr>
    <tr>
      <td>
        <form:label path="bookAuthor">
          <spring:message text="Author"/>
        </form:label>
      </td>
      <td>
        <form:input path="bookAuthor"/>
      </td>
    </tr>
    <tr>
      <td>
        <form:label path="price">
          <spring:message text="Price"/>
        </form:label>
      </td>
      <td>
        <form:input path="price"/>
      </td>
    </tr>
    <tr>
      <td colspan="2">
        <c:if test="${!empty aircraft.aircraftName}">
          <input type="submit"
                 value="<spring:message text="Edit Book"/>"/>
        </c:if>
        <c:if test="${empty aircraft.aircraftName}">
          <input type="submit"
                 value="<spring:message text="Add Book"/>"/>
        </c:if>
      </td>
    </tr>
  </table>
</form:form>
</body>
</html>
