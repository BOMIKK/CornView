<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />

<%
  request.setCharacterEncoding("UTF-8");
%>   
<html>
<head>
	<title>CornView</title>
</head>
<body>
<h1>
	CornView!  
</h1>
<c:forEach var="hall" items="${hallList}" >     
   <tr align="center">
      <td>${hall.key}</td>
      <td>${hall.value}</td>

    </tr>
  </c:forEach> 

</body>
</html>
