
<%@include file="includes/header.jsp" %>

<div class="panel">
	<div class="row" style="border-bottom: 1px solid #766F5E;">
		<h2>
<%-- 			<% --%>
// 				out.print(produit.getNom());
<%-- 			%> --%>
		</h2>
	</div>

	<div class="row">
		<div class="large-6 columns">
		<object type="text/html" style="margin-left:auto;margin-right: auto;width: 100%;height: 20rem;">
		</object>
		</div>
		
		<div class="large-6 columns">

			<div class="row" style="padding:2rem;">
				<h2>
<!-- 					Catégorie: -->
<%-- 					<% --%>
// 					out.print(produit.getCategorie().getName());
<%-- 				%> --%>
				</h2>
			</div>

			<div class="row" style="padding:2rem;">
				<p>
<%-- 					<% --%>
// 						out.print(produit.getDescription());
<%-- 					%> --%>
				</p>
			</div>

			<div class="row" style="padding:2rem;">
				<div class="large-6 columns">
					<label class="inline"> Prix &euro; :
<%-- 					 <% --%>
// 						out.print(produit.getPrix());
<%-- 					%> --%>
					</label>
				</div>
				
			</div>
		</div>

	</div>
</div>

<%@include file="includes/footer.jsp" %>

