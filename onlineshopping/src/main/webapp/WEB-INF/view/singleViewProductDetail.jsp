<div class="container">

	<div class="row">
	
			<div class="col-xs-12">
			
					<ol class="breadcrumb">
						<li><a href="${contextRoot}/home"></a>HOME</li>
						<li><a href="${contextRoot}/viewAllProduct">VIEWALL PRODUCT</a></li>
						<li class="active">${product.name}</li>
						
					
					</ol>
			
			</div>
	
	
	</div>
	
	<div class="row">
	
			<div class=" col-xs-12 col-sm-4">
				<div class="thumbnail">
				
					<img alt="" src="${images}/${product.code}.jpg" class="img img-responsive"/>
				
				</div>
			
			</div>
				
				
				<div class="col-sm-8">
				
						<h3>${product.name }</h3>
						<hr/>
						
						<p>${product.description}</p>
						<h4>Price:<Strong>&#8377; ${product.unitPrice}</Strong></h4>
						
						<h6>Qauntity available:${product.quantity}</h6>
						
						<a href="${contextRoot}/cart/add/${product.id}/product" class="btn btn-success">add cart
						
						<span class="glyphicon glyphicon-shopping-cart"></span>
						</a>
					<a href="${contextRoot}/viewAllProduct" class="btn btn-success">Back</a>
			
			</div>
	
	</div>


</div>