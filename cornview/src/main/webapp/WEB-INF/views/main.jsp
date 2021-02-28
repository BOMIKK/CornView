<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
  
<html>

<head>
	<link href="./resources/css/main.css" rel="stylesheet" type="text/css">
	<title>CornView</title>
</head>

<body>
<h1>
	CornView!  
</h1>

<img src="./resources/img/gc.png" alt="고척돔" />
<c:forEach var="hall" items="${hallList}" >     
   <tr align="center">
      <td>${hall.hall_id}</td>
      <td>${hall.hall_name}</td>

    </tr>
  </c:forEach> 

</body>
</html>
