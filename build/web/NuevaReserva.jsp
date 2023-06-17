<!doctype html>
<html lang="es">
  <head>
  	<title>Principal</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900" rel="stylesheet">
		
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
		<link rel="stylesheet" href="css/style.css">
  </head>
  <body>
		
		<div class="wrapper d-flex align-items-stretch">
			<nav id="sidebar">
				<div class="custom-menu">
					<button type="button" id="sidebarCollapse" class="btn btn-primary">
	          <i class="fa fa-bars"></i>
	          <span class="sr-only">Toggle Menu</span>
	        </button>
        </div>
				<div class="p-4 pt-5">
		  		<h1><a href="index.html" class="logo">Menú</a></h1>
	        <ul class="list-unstyled components mb-5">
                    <li class="active">
                        <a href="#homeSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Huéspedes</a>
                        <ul class="collapse list-unstyled" id="homeSubmenu">
                           
                            <li>
                                <a href="#">Ver Huéspedes Registrados</a>
                            </li>
                        </ul>
                    </li>
	         
                    
                    <li>
                        <a href="#pageSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Reservas</a>
                        <ul class="collapse list-unstyled" id="pageSubmenu">
                            <li>
                                <a href="#">Nueva Reserva</a>
                            </li>
                            <li>
                                <a href="#">Reservas por Huésped</a>
                            </li>
                            <li>
                                <a href="#">Reservas por día</a>
                            </li>
                        </ul>
                    </li>
                    
                    <li>
                        <a href="#pageSubmenu" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">Empleados</a>
                        <ul class="collapse list-unstyled" id="pageSubmenu">
                            <li>
                                <a href="#">Alta Empleado (X)</a>
                            </li>
                            <li>
                                <a href="#">Ver Empleados (X)</a>
                            </li>
                            <li>
                                <a href="#">Ver Reservas por Empleado</a>
                            </li>
                        </ul>
                    </li>

	        </ul>


	        <div class="footer">
	        	<p>
                            Copyright 2021. Hernán Misael para curso Desarrollo Fullstack Java (PoloTIC) 
			</p>
	        </div>

	      </div>
    	</nav>

        <!-- Page Content  -->
        <div id="content" class="p-4 p-md-5 pt-5">
            
            
        
            
        
        
        </div>
    </div>

    <script src="js/jquery.min.js"></script>
    <script src="js/popper.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/main.js"></script>
  </body>
</html>