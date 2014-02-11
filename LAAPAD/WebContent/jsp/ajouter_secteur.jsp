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
  
<div class="panel">

		

	<form data-abide  method="post" action="AjoutSecteur">
	
	<div class="row">
		<h2>Ajouter un secteur </h2>
		</div>


			<div class="row">
				<div class="small-8">
					<div class="row">
						<div class="small-3 columns">
							<label for="right-label" class="right inline">Nom du secteur<small>required</small>
							</label>
						</div>
						<div class="small-9 columns">
							<input type="text" name="secteur_name" value="" /> <small
								class="error">Name is required and must be a string.</small>
						</div>
					</div>
				</div>
			</div>
			
			
				<div class="row">
				<div class="small-8">
					<div class="row">
						<div class="small-3 columns">
							<label for="right-label" class="right inline">Adresse</label>
						</div>
						<div class="small-9 columns">
							<input type="text" name="secteur_adr" value="" /> 
							<small class="error">Name is required and must be a string.</small>
						</div>
					</div>
				</div>
			</div>
			
			
				<div class="row">
				<div class="small-8">
					<div class="row">
						<div class="small-3 columns">
							<label for="right-label" class="right inline"> Longitute<small>required</small>
							</label>
						</div>
						<div class="small-9 columns">
							<input type="text" name="secteur_long" value="" /> <small
								class="error">Name is required and must be a string.</small>
						</div>
					</div>
				</div>
			</div>
			
			
					<div class="row">
				<div class="small-8">
					<div class="row">
						<div class="small-3 columns">
							<label for="right-label" class="right inline"> Latittude <small>required</small>
							</label>
						</div>
						<div class="small-9 columns">
							<input type="text" name="secteur_lat" value="" /> <small
								class="error">Name is required and must be a string.</small>
						</div>
					</div>
				</div>
			</div>
		
	
		
		<div class="row">
			<div class="large-12 columns">
		<button type="submit">Submit</button>
		</div>
		</div>
	</form>
</div>
    
    <script src="js/vendor/jquery.js"></script>
    <script src="js/foundation.min.js"></script>
    <script>
      $(document).foundation();
    </script>
  </body>
</html>
