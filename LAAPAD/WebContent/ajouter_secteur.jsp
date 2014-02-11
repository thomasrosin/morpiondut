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
	        <h3>Ajouter un secteur</h3>
			<hr />
				<div class="row">
				    <div class="large-12 columns">
				      <label>Nom</label>
				      <input type="text" placeholder="Nom du secteur &agrave; cr&eacute;er" name="nom_secteur" />
				    </div>
				</div>
				
				  <div class="row">
				    <div class="large-6 medium-6 columns">
				      <label>Dans les magasins</label>
				      <ul>
						<li class="list-magasins"><input id="checkbox1" type="checkbox"><label for="checkbox1">Auchan Petite Foret - 23 avenue Cl&eacute;menceau</label></li>
						<li class="list-magasins"><input id="checkbox2" type="checkbox"><label for="checkbox2">Cora Grand Bois - 17 rue de la r&eacute;publique</label></li>
						<li class="list-magasins"><input id="checkbox3" type="checkbox"><label for="checkbox3">Auchan Petite Foret - 23 avenue Cl&eacute;menceau</label></li>
						<li class="list-magasins"><input id="checkbox4" type="checkbox"><label for="checkbox4">Cora Grand Bois - 17 rue de la r&eacute;publique</label></li>
						<li class="list-magasins"><input id="checkbox5" type="checkbox"><label for="checkbox5">Auchan Petite Foret - 23 avenue Cl&eacute;menceau</label></li>
						<li class="list-magasins"><input id="checkbox6" type="checkbox"><label for="checkbox6">Cora Grand Bois - 17 rue de la r&eacute;publique</label></li>
						<li class="list-magasins"><input id="checkbox7" type="checkbox"><label for="checkbox7">Auchan Petite Foret - 23 avenue Cl&eacute;menceau</label></li>
						<li class="list-magasins"><input id="checkbox8" type="checkbox"><label for="checkbox8">Cora Grand Bois - 17 rue de la r&eacute;publique</label></li>
					  </ul>
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
