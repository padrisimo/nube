<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="es">
<head>
	<meta charset="UTF-8">
	<title>nubeagenda</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/4.1.1/normalize.css">
	<link rel="stylesheet" href="css/master.css">
	<link href='https://fonts.googleapis.com/css?family=Montserrat' rel='stylesheet' type='text/css'>
</head>
<body>
	<header>
		<button>Sing In</button>
	</header>
	<section id="login">
		<div class="nube"><img src="img/nube.png" alt=""></div>
		<h1>nubeagenda</h1>
		<h3>tu agenda en la nube</h3>
		
		<form action="" method="POST">
			<input type="text" placeholder="email" id="email" name="email">
			<input type="text" id="password" name="password" placeholder="password">
			<button>Log In</button>
		</form>
		<div class="error"><%=request.getAttribute("mssError")!=null?request.getAttribute("mssError"):"" %></div>
	</section>
	<footer>
        <h5>&#123;bien perro code&#125; by <a href="http://padrisimo.esy.es/" target"_blank">padrisimo</a></h5>
    </footer>
</body>
</html>