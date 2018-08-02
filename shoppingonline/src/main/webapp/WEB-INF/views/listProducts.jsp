<div class="container">
	<div class="row">
		<!-- columna side bar -->
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp"%>
		</div>
		<!-- columna productos -->
		<div class="col-md-9">
		
			<!-- se agrega breadcrumb -->
			<div class="row">
			<div class="col-lg-12">
			<c:if test="${userClickAllProducts == true}">
			<ol class="breadcrumb">
			<li><a href="${contextRoot}/home">Inicio </a></li>
			<li class="active"> / Todos los productos</li>			
			</ol>
			</c:if>
			<c:if test="${userClickCategoryProducts == true}">
			<ol class="breadcrumb">
			<li><a href="${contextRoot}/home">Inicio </a></li>
			<li class="active"> / categoria</li>
			<li class="active"> / ${category.name}</li>			
			</ol>
			</c:if>
			</div>
			</div>
		</div>

	</div>

</div>