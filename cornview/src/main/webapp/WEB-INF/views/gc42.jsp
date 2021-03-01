<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%> 
<html>

<head>
<!-- Latest compiled and minified CSS -->

<link href="./resources/css/venue.css" rel="stylesheet" type="text/css">
<link href="./resources/js/venue.css" rel="stylesheet" type="text/css">
<title>CornView</title>

</head>

<body>
	<img src="./resources/img/title.png" alt="title" />
	<div class="body">
		<div class="left">
			<h2>고척스카이돔</h2>
			<img id="seat_img" name="mainvisualimg"
				src="./resources/img/gocheock_seat_preview__/gocheock_default_고척_413~424.svg"
				alt="고척돔" usemap="#gcmap" />
			<map name="gcmap">
				<!-- 101~114 / 1 -->
				<area target="" href="/cornview/gc1"
					onmouseover="if(document.images) mainvisualimg.src='./resources/img/gocheock_seat_preview__/gocheock_default_고척_101~114.svg'"
					onmouseout="if(document.images) mainvisualimg.src='./resources/img/gocheock_seat_preview__/gocheock_default_고척_413~424.svg'"
					onfocus="this.blur()"
					coords="29,169,28,200,106,291,117,286,113,251,65,196" shape="poly"
					href=")">
				<area target="" href="/cornview/gc1"
					onmouseover="if(document.images) mainvisualimg.src='./resources/img/gocheock_seat_preview__/gocheock_default_고척_101~114.svg'"
					onmouseout="if(document.images) mainvisualimg.src='./resources/img/gocheock_seat_preview__/gocheock_default_고척_413~424.svg'"
					onfocus="this.blur()"
					coords="337,251,336,286,349,290,429,198,425,168,378,207"
					shape="poly">
				<!-- 201~210 / 2-->
				<area target="" href="/cornview/gc2"
					onmouseover="if(document.images) mainvisualimg.src='./resources/img/gocheock_seat_preview__/gocheock_default_고척_201~210.svg'"
					onmouseout="if(document.images) mainvisualimg.src='./resources/img/gocheock_seat_preview__/gocheock_default_고척_413~424.svg'"
					onfocus="this.blur()" coords="21,243,20,203,101,296,79,309"
					shape="poly">
				<area target="" href="/cornview/gc2"
					onmouseover="if(document.images) mainvisualimg.src='./resources/img/gocheock_seat_preview__/gocheock_default_고척_201~210.svg'"
					onmouseout="if(document.images) mainvisualimg.src='./resources/img/gocheock_seat_preview__/gocheock_default_고척_413~424.svg'"
					onfocus="this.blur()" coords="356,294,378,307,439,238,435,203"
					shape="poly">
				<!-- 301~311 / 31 -->
				<area target="" href="/cornview/gc31"
					onmouseover="if(document.images) mainvisualimg.src='./resources/img/gocheock_seat_preview__/gocheock_default_고척_301~311.svg'"
					onmouseout="if(document.images) mainvisualimg.src='./resources/img/gocheock_seat_preview__/gocheock_default_고척_413~424.svg'"
					coords="232,423,231,434,253,435,289,429,317,415,330,400,342,387,355,373,367,357,384,339,398,323,410,308,423,295,415,289,389,319,377,333,363,351,348,366,335,381,321,393,309,405,284,418,251,422"
					onfocus="this.blur()" shape="poly">
				<!-- 312~323 / 32-->
				<area target="" href="/cornview/gc32"
					onmouseover="if(document.images) mainvisualimg.src='./resources/img/gocheock_seat_preview__/gocheock_default_고척_312~323.svg'"
					onmouseout="if(document.images) mainvisualimg.src='./resources/img/gocheock_seat_preview__/gocheock_default_고척_413~424.svg'"
					coords="227,425,227,435,203,432,171,428,140,413,115,391,96,372,72,345,56,322,34,294,44,290,67,316,79,335,97,352,108,364,119,377,133,392,150,404,169,416"
					onfocus="this.blur()" shape="poly">
				<!-- 401~412 / 41 -->
				<area target="" href="/cornview/gc41"
					onmouseover="if(document.images) mainvisualimg.src='./resources/img/gocheock_seat_preview__/gocheock_default_고척_401~412.svg'"
					onmouseout="if(document.images) mainvisualimg.src='./resources/img/gocheock_seat_preview__/gocheock_default_고척_413~424.svg'"
					coords="429,297,408,319,376,357,352,390,333,406,308,428,292,432,269,439,256,442,235,442,232,482,262,479,284,476,330,455,355,437,385,410,411,380,428,340,436,303"
					onfocus="this.blur()" shape="poly">
				<!-- 413~424 / 42 -->
				<area target="" href="/cornview/gc42"
					onmouseover="if(document.images) mainvisualimg.src='./resources/img/gocheock_seat_preview__/gocheock_default_고척_413~424.svg'"
					onmouseout="if(document.images) mainvisualimg.src='./resources/img/gocheock_seat_preview__/gocheock_default_고척_413~424.svg'"
					coords="225,440,210,442,184,440,166,434,152,427,136,415,122,399,109,390,98,377,86,366,67,341,52,324,27,300,21,304,27,337,39,360,48,380,69,406,91,432,108,448,163,471,185,474,227,482"
					onfocus="this.blur()" shape="poly">
				<!-- D001~D07 / 5 -->
				<area target="" href="/cornview/gc5"
					onmouseover="if(document.images) mainvisualimg.src='./resources/img/gocheock_seat_preview__/gocheock_default_고척_D01~D07.svg'"
					onmouseout="if(document.images) mainvisualimg.src='./resources/img/gocheock_seat_preview__/gocheock_default_고척_413~424.svg'"
					coords="162,319,169,316,194,339,231,342,270,333,286,316,299,319,278,341,249,348,218,350,194,349,171,334"
					onfocus="this.blur()" shape="poly">
				<!-- Ground / 6-->
				<area target="" href="/cornview/gc6"
					onmouseover="if(document.images) mainvisualimg.src='./resources/img/gocheock_seat_preview__/gocheock_default_고척_Ground.svg'"
					onmouseout="if(document.images) mainvisualimg.src='./resources/img/gocheock_seat_preview__/gocheock_default_고척_413~424.svg'"
					coords="127,184,123,198,184,252,268,251,331,203,332,185"
					onfocus="this.blur()" shape="poly">
				<!-- T01~T17 / 7-->
				<area target="" href="/cornview/gc7"
					onmouseover="if(document.images) mainvisualimg.src='./resources/img/gocheock_seat_preview__/gocheock_default_고척_T01~T17.svg'"
					onmouseout="if(document.images) mainvisualimg.src='./resources/img/gocheock_seat_preview__/gocheock_default_고척_413~424.svg'"
					coords="119,294,97,309,140,358,165,373,170,370,184,372,194,362,250,362,263,363,270,372,285,369,291,369,307,365,329,339,361,308,338,292,315,318,295,340,257,354,203,355,168,347"
					onfocus="this.blur()" shape="poly">
			</map>


		</div>
		<div class="right">
			<div class="topInfo">
				<div class="areaInfo">413~424구역</div>
				<div class="areaInfo">
					<div class="dropdown">
						<select class="selectpicker">
							<option>구역전체</option>
							<option>Ground</option>
							<option>101~114구역</option>
							<option>201~210구역</option>
							<option>301~311구역</option>
							<option>312~323구역</option>
							<option>401~412구역</option>
							<option>413~424구역</option>
							<option>D01~D07구역</option>
							<option>T01~T17구역</option>
						</select> <select class="selectpicker">
							<option>열전체</option>
							<option>Ketchup</option>
							<option>Relish</option>
						</select>
					</div>
				</div>
			</div>
			<div class="imageList">
			<form action="http://localhost:8080/cornview/rowNo" name="rowno" method="get">
				<c:forEach var="img" items="${imageList}">
					<div class="card">
						<input type="hidden" id="no1" name="row_num" value="${img.image_area}구역 ${img.image_row}열 ${img.image_no}번">
						<input type="hidden" id="no2" name="img_num" value="/image/2/${img.image_area}/${img.image_name}">
						<div onClick="document.forms['rowno'].submit();" style="cursor: pointer;">
						<img width="350px" height="250px" src="<spring:url value='/image/2/${img.image_area}/${img.image_name}'/>" alt="hall_image" />
						<c:choose>
						<c:when test = "${not empty img.image_row}">
							<c:choose>
							<c:when test = "${not empty img.image_no}">
								<div>${img.image_area} ${img.image_row}열 ${img.image_no}번</div>
	         				</c:when>
	         				<c:otherwise>
	         					<div>${img.image_area} ${img.image_row}열</div>
	         				</c:otherwise>
	         				</c:choose>
         				</c:when>
				         <c:otherwise>
				         	<c:choose>
				         	<c:when test = "${not empty  img.image_no}">
								<div>${img.image_area} ${img.image_no}번</div>
	         				</c:when>
							<c:otherwise>
								<div>${img.image_area}</div>
							</c:otherwise>
							</c:choose>
				         </c:otherwise>
				         </c:choose>
					</div>
				</div>
				</c:forEach>
			</form>
			</div>
		</div>
	</div>
</body>


</html>