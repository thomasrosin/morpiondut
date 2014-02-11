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
	
	<form method="post" action="AjoutProduit" enctype="multipart/form-data">
    <div class="row">
      <div class="large-12 columns">
      	<div class="panel">
	        <h3>Ajouter un produit</h3>
			<hr />
				<div class="row">
				    <div class="large-12 columns">
				      <label>Code</label>
				      <input type="text" placeholder="Code du produit &agrave; cr&eacute;er" name="code_produit" />
				    </div>
				</div>
				
				<div class="row">
				    <div class="large-12 columns">
				      <label>Nom</label>
				      <input type="text" placeholder="Nom du produit &agrave; cr&eacute;er" name="nom_produit" />
				    </div>
				</div>
				
				<div class="row">
				    <div class="large-12 columns">
				      <label>Description</label>
				      <textarea placeholder="Description du produit &agrave; cr&eacute;er" name="description_produit"></textarea>
				    </div>
				  </div>
				
				<div class="row">
				    <div class="large-12 columns">
				      <label>Illustration</label>
				      <input type="file" name="illustration_produit" />
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