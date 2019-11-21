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
</script>

<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.css" rel="stylesheet">
<%-- <link href="${css}/bootstraptheme.css" rel="stylesheet"> --%>
<!-- Add custom CSS here -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>


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

		</div>
		<!--footer comes here -->

		<%@include file="./shared/footer.jsp"%>



	</div>






	<!-- JavaScript -->
	<script src="${js}/jquery-1.10.2.js"></script>
	<script src="${js}/bootstrap.min.js"></script>
	<script src="${js}/myapp.js"></script>

</body>

</html>
