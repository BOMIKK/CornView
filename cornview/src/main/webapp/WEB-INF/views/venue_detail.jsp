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
				<div class="card">
					<img src="./resources/img/gc.png" alt="고척돔" />
					<div>421구역 A열 23번</div>
					<img src="./resources/img/gc.png" alt="고척돔" />
					<div>421구역 A열 23번</div>
				</div>
				<div class="card">
					<img src="./resources/img/gc.png" alt="고척돔" />
					<div>421구역 A열 23번</div>
					<img src="./resources/img/gc.png" alt="고척돔" />
					<div>421구역 A열 23번</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>


