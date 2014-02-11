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
	        <h3>Modifier un magasin</h3>
			<hr />
				<div class="row">
				    <div class="large-12 columns">
				      <label>Nom</label>
				      <input type="text" placeholder="Nom du magasin &agrave; modifier" name="nom_magasin" />
				    </div>
				</div>
				
				<div class="row">
				    <div class="large-12 columns">
				      <label>Adresse</label>
				      <input type="text" placeholder="Adresse compl&egrave;te du magasin &agrave; modifier" name="adrese_magasin" />
				    </div>
				</div>
				
				<div class="row">
				    <div class="large-12 columns">
				      <label>Horaires d'ouverture</label>
				      <input type="text" placeholder="Horaires d'ouverture du magasin &agrave; modifier" name="horaires_magasin" />
				    </div>
				</div>
      	</div>
      </div>
    </div>
	
	<div class="row">
		<p style="float: left;"><a href="#" class="medium secondary button">Retour</a></p>
		<p style="float: right;"><a href="#" class="medium success button">Valider</a></p>
	</div>
	
	<input type="hidden" name="id_mag_modif" value="UUU" />
	
	</form>
    
    <script src="js/vendor/jquery.js"></script>
    <script src="js/foundation.min.js"></script>
    <script>
      $(document).foundation();
    </script>
  </body>
</html>
