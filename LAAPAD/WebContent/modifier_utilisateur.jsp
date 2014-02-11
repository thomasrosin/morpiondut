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
	        <h3>Modifier un utilisateur</h3>
			<hr />
			
				<div class="row">
				    <div class="large-4 medium-4 columns">
				      <label>Nom</label>
				      <input type="text" placeholder="Nom de l'utilisateur &agrave; modifier" />
				    </div>
				    <div class="large-4 medium-4 columns">
				      <label>Pr&eacute;nom</label>
				      <input type="text" placeholder="Pr&eacute;nom de l'utilisateur &agrave; modifier" />
				    </div>
				</div>
				
				<div class="row">
				    <div class="large-12 columns">
				      <label>Adresse</label>
				      <input type="text" placeholder="Adresse de l'utilisateur &agrave; modifier" name="adresse" />
				    </div>
				</div>
				
				<div class="row">
				    <div class="large-12 columns">
				      <label>Code postal</label>
				      <input type="text" placeholder="Code postal de l'utilisateur &agrave; modifier" name="code_postal" />
				    </div>
				</div>
				
				<div class="row">
				    <div class="large-12 columns">
				      <label>Ville</label>
				      <input type="text" placeholder="Ville de l'utilisateur &agrave; modifier" name="ville" />
				    </div>
				</div>
			
				<div class="row">
				    <div class="large-12 columns">
				      <label>Adresse e-mail</label>
				      <input type="text" placeholder="Adresse e-mail de l'utilisateur &agrave; modifier" name="adresse_email" />
				    </div>
				</div>
				
				<div class="row">
				    <div class="large-12 columns">
				      <label>Mot de passe</label>
				      <input type="password" placeholder="Mot de passe de l'utilisateur &agrave; modifier" name="mot_passe" />
				    </div>
				</div>
				
				<div class="row">
				    <div class="large-12 columns">
				      <label>Confirmation du mot de passe</label>
				      <input type="password" placeholder="Confirmation du mot de passe de l'utilisateur &agrave; modifier" name="confirmation_passe" />
				    </div>
				  </div>
				
      	</div>
      </div>
    </div>
	
	<div class="row">
		<p style="float: left;"><a href="#" class="medium secondary button">Retour</a></p>
		<p style="float: right;"><a href="#" class="medium success button">Valider</a></p>
	</div>
	
	<input type="hidden" name="id_modif_ut" value="VVVVVV" />
	
	</form>
    
    <script src="js/vendor/jquery.js"></script>
    <script src="js/foundation.min.js"></script>
    <script>
      $(document).foundation();
    </script>
  </body>
</html>
