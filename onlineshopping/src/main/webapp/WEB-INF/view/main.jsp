<%@page import="javax.servlet.descriptor.TaglibDescriptor"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>

<spring:url var="css" value="/resources/css"></spring:url>
<spring:url var="js" value="/resources/js"></spring:url>
<spring:url var="images" value="/resources/images"></spring:url>


<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<title>Online-Shopping-${title}</title>
<script>
	window.menu = '${title}';
	window.contextRoot = '${contextRoot}';
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.css" rel="stylesheet">
<%-- <link href="${css}/bootstraptheme.css" rel="stylesheet"> --%>
<!-- Add custom CSS here -->
<link href="${css}/myapp.css" rel="stylesheet">

<link href="${css}/dataTables.bootstrap.css" rel="stylesheet">




</head>

<body>

	<div class="se-pre-con"></div>
	<div class="wrapper">
		<!-- navigation -->
		<%@include file="./shared/navbar.jsp"%>


		<!-- pagecontent -->

		<div class="content">



			<c:if test="${userClickedHome == true}">
				<%@include file="home.jsp"%>

			</c:if>

			<c:if test="${userClickedAbout == true}">
				<%@include file="about.jsp"%>

			</c:if>


			<c:if test="${userClickedContact == true}">
				<%@include file="contact.jsp"%>

			</c:if>
			
			<c:if test="${userClickedProduct == true or userClickedCategoryProduct == true}">
				<%@include file="listProduct.jsp"%>

			</c:if>
			
			
			<c:if test="${userClickedSingleCategory == true}">
				<%@include file="singleViewProductDetail.jsp"%>

			</c:if>
			
			<c:if test="${userClickedManageProduct == true}">
				<%@include file="manageProduct.jsp"%>

			</c:if>

		</div>
		<!--footer comes here -->

		<%@include file="./shared/footer.jsp"%>



	</div>







	<!-- jQuery -->
		<script src="${js}/jquery.js"></script>

		<%-- <script src="${js}/jquery.validate.js"></script> --%>

		<!-- Bootstrap Core JavaScript -->
		<script src="${js}/bootstrap.min.js"></script>
		
		<!-- DataTable Plugin -->
		<script src="${js}/jquery.dataTables.js"></script>
		
		<!-- DataTable Bootstrap Script -->
		<script src="${js}/dataTables.bootstrap.js"></script>
		

		
		<!-- Self coded javascript -->
		<script src="${js}/myapp.js"></script>
	





</body>

</html>

