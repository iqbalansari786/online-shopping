<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<p class="lead">Category</p>
<div class="list-group">

<c:forEach var="category" items="${categories}">
	<a href="${contextRoot}/show/${category.category_id}/products" class="list-group-item">${category.category_name}</a> 
</c:forEach>
		
</div>