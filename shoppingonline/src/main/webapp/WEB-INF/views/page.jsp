<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>MyM - ${title}</title>

<script>
	window.menu = '${title}';
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">
<!-- Bootstrap lux theme -->
<link href="${css}/bootstrap-lux-theme.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>
	<div class="wrapper">

		<!-- Navigation -->

		<%@include file="./shared/navbar.jsp"%>

		<!-- Page Content -->
		<div class="content">
		<!-- Home Content  -->
		<c:if test="${userClickHome == true }">
			<%@include file="home.jsp"%>
		</c:if>
		<!-- only when user click on productos -->
		<c:if test="${userClickProductos == true }">
			<%@include file="productos.jsp"%>
		</c:if>
		<!-- only when user click on servicio tecnico -->
		<c:if test="${userClickServicioTecnico == true }">
			<%@include file="serviciotecnico.jsp"%>
		</c:if>
		<!-- only when user click on contacto -->
		<c:if test="${userClickContacto == true }">
			<%@include file="contacto.jsp"%>
		</c:if>
		<!-- only when click all categories or one partucular -->
		<c:if test="${userClickAllProducts == true or userClickCategoryProducts == true }">
			<%@include file="listProducts.jsp"%>
		</c:if>
		</div>
		<!-- /.container -->

		<!-- Footer -->

		<%@include file="./shared/footer.jsp"%>


		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.js"></script>
		<script src="${js}/bootstrap.bundle.min.js"></script>

		<!-- javascript propio -->
		<script src="${js}/myapp.js"></script>
	</div>
</body>

</html>
