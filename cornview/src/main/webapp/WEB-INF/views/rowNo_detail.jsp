<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
	language="java"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />


<html>
<head>

<link href="./resources/css/rowNo.css" rel="stylesheet" type="text/css">

<!-- jquery -->
<script src="http://code.jquery.com/jquery-latest.min.js"></script>

<!-- CDN -->
<link rel="stylesheet" href="https://unpkg.com/swiper/css/swiper.css">
<script src="https://unpkg.com/swiper/js/swiper.js"></script>


<!-- resources -->
<link rel="stylesheet" href="./resources/css/swiper.min.css">
<script src="./resources/js/swiper.min.js"></script>

<title>Home</title>

</head>

<body>
	<div class="row_num">

		<div class="back_pic">
			<a href="javascript:void(0);" onclick="history.back();"> ← 리스트 보기</a>
		</div>
	</div>
	<%
		String row_num = request.getParameter("row_num");
		String img_num = request.getParameter("img_num");

		out.println("<p>" + row_num + "</p>");

		out.println("<img src=" + img_num + "/>");
	%>

	<div class="near_row_num">
		<p>근처 열 좌석뷰</p>
	</div>


	<div class="swiper-container">
		<div class="swiper-wrapper">

			<c:forEach var="img" items="${imgList}" end="6">
				<h2>img_num</h2>
				<div class="swiper-slide"><img src="<%=img_num%>" alt="고척돔" /></div>
				
			</c:forEach>
		</div>
		<!-- Add Pagination -->
		<div class="swiper-pagination"></div>
	</div>

	<script>
		$(document).ready(function() {
			//initialize swiper when document ready 
			var swiper = new Swiper('.swiper-container', {
				slidesPerView : 3,
				spaceBetween : 0,
				freeMode : true,
				pagination : {
					
					clickable : true,
				},
			});
		});
	</script>

</body>
</html>

