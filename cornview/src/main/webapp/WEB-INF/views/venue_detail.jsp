<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

<html>

<head>
<!-- Latest compiled and minified CSS -->

<link href="./resources/css/venue.css" rel="stylesheet" type="text/css">
<link href="./resources/js/venue.css" rel="stylesheet" type="text/css">


<title>CornView</title>

</head>

<body>
	<h1>CornView!</h1>
	<div class="body">
		<div class="left">
			<h2>고척스카이돔</h2>
			<img width="400px" src="./resources/img/gctable.JPG" alt="고척돔" />
		</div>
		<div class="right">
			<div class="topInfo">
				<div calss="areaInfo">425-435구역</div>
				<div class="ui dropdown">
					<select class="selectpicker">
						<option>Mustard</option>
						<option>Ketchup</option>
						<option>Relish</option>
					</select> <select class="selectpicker">
						<option>Mustard</option>
						<option>Ketchup</option>
						<option>Relish</option>
					</select>
				</div>
			</div>
			<div class="imageList">
				<form action="http://localhost:8080/cornview/rowNo" name="rowno" method="get">
				
				<div class="card">
					<input type="hidden" id="no1" name="row_num" value="421구역 A열 23번">
					<input type="hidden" id="no2" name="img_num" value="./resources/img/gc.png">
					
					<div onClick="document.forms['rowno'].submit();" style="cursor: pointer;"><img src="./resources/img/gc.png" alt="고척돔" /></div>
					<div>421구역 A열 23번</div>
					
				</div>
				</form>
		
			</div>
		</div>
	</div>
</body>


</html>