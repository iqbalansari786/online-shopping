<div class="container">

	<div class="row">
	<!--  to display category -->
		<div class="col-md-3">
		<%@include file="./shared/category.jsp" %>
		
		</div>
		<!--  to display product -->
		
		
		
		<div class="col-md-9">
		
			<div class="row">
			
				
				
				<div class="col-lg-12">
				
				<c:if test="${userClickedProduct == true }">
						<script >
							window.categoryId='';
						</script>
				
				
					<ol class="breadcrumb">
						<li><a href="${contextRoot}/home">HOME</a></li>
						<li class="active">All Products</li>
					
					</ol>
					</c:if>
						<c:if test="${userClickedCategoryProduct == true }">
						
						<script>
						window.categoryId='${category.category_id}';

						</script>
						
					<ol class="breadcrumb">
						<li><a href="${contextRoot}/home">HOME</a></li>
						<li class="active">Category</li>
							<li class="active">${category.category_name}</li>
					
					</ol>
					</c:if>
				
				</div>
			
			</div>
		
		
				<div class="row">
				
				  <div class="col-xs-12">
				  
				  		<table id="productList"  class="table table-striped table-border">
				  		
				  				<thead>
				  					<tr>
				  					
				  						<th></th>
				  							<th>NAME</th>
				  							<th>BRAND</th>
				  							<th>PRICE</th>
				  							<th>QUANTITY</th>
				  							<th></th>
				  					</tr>
				  				
				  				</thead>
				  				
				  				
				  					<tfoot>
				  					<tr>
				  					
				  							<th></th>
				  							<th>NAME</th>
				  							<th>BRAND</th>
				  							<th>PRICE</th>
				  							<th>QUANTITY</th>
				  							<th></th>
				  					</tr>
				  				
				  				</tfoot>
				  		
				  		
				  		</table>
				  
				  </div>
				
				</div>
		
		</div>
	
	</div>


</div>