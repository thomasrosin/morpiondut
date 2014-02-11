<!doctype html>
<html class="no-js" lang="en">
  <head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Foundation | Welcome</title>
    <link rel="stylesheet" href="foundation/css/foundation.css" />
    <link rel="stylesheet" href="css/default.css" />
    <script src="foundation/js/vendor/modernizr.js"></script>
  </head>
  <body>
  
	<div class="row">
      <div class="large-12 columns">
        <h1>Administration de LAAPAD</h1>
      </div>
    </div>
    
	<form method="post" action="">
    <div class="row">
      <div class="large-12 columns">
      	<div class="panel">
	        <h3>Associer un poduit &agrave; un magasin</h3>
			<hr />
			
			<!-- UNE LIGNE -->
			
			<div>
				<div class="row">
				    <div class="large-12 columns" style="float: left; width: 90%;">
				      <label>Produit</label>
				      <select>
				        <option value="husker">Husker</option>
				        <option value="starbuck">Starbuck</option>
				        <option value="hotdog">Hot Dog</option>
				        <option value="apollo">Apollo</option>
				      </select>
				    </div>
					<div style="float: right; width: 10%; margin-top: 17px;"><a href="#" class="small button">+</a></div>
				  </div>
			</div>
			
			<!-- FIN LIGNE -->
			
			<!-- UNE LIGNE -->
			
			<div>
				<div class="row">
				    <div class="large-12 columns" style="float: left; width: 90%;">
				      <label>Secteur</label>
				      <select>
				        <option value="husker">Husker</option>
				        <option value="starbuck">Starbuck</option>
				        <option value="hotdog">Hot Dog</option>
				        <option value="apollo">Apollo</option>
				      </select>
				    </div>
					<div style="float: right; width: 10%; margin-top: 17px;"><a href="#" class="small button">+</a></div>
				  </div>
			</div>
			
			<!-- FIN LIGNE -->

			<!-- UNE LIGNE -->
			
			<div>
				<div class="row">
				    <div class="large-12 columns" style="float: left; width: 90%;">
				      <label>Magasin</label>
				      <select>
				        <option value="husker">Husker</option>
				        <option value="starbuck">Starbuck</option>
				        <option value="hotdog">Hot Dog</option>
				        <option value="apollo">Apollo</option>
				      </select>
				    </div>
					<div style="float: right; width: 10%; margin-top: 17px;"><a href="#" class="small button">+</a></div>
				  </div>
			</div>
			
			<!-- FIN LIGNE -->
			
				  <div class="row">
				    <div class="large-12 columns">
				      <label>Prix</label>
				      <input type="text" placeholder="Prix du produit &agrave; associer" name="prix" />
				    </div>
				</div>
      	</div>
      </div>
    </div>
	
	<div class="row">
		<p style="float: left;"><a href="#" class="medium secondary button">Retour</a></p>
		<p style="float: right;"><a href="#" class="medium success button">Valider</a></p>
	</div>
	
	</form>
    
    <script src="js/vendor/jquery.js"></script>
    <script src="js/foundation.min.js"></script>
    <script>
      $(document).foundation();
    </script>
  </body>
</html>
