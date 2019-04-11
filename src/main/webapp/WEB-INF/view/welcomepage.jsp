<!DOCTYPE html >
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="sat, 01 Dec 2001 00:00:00 GMT">
<title>tecno-tab | home</title>
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
/* body, html {
  height: 10%;
  margin: 0;
} */

.bg {
  /* The image used */
  background-image: url("/static/images/movie-ticket-booking.jpg");
   margin-top: 10%;
 /*
  height: 10%; 
  width: 0%;
  */

  /* Center and scale the image nicely */
  background-position:bottom; 
  background-repeat: no-repeat;
  background-size: cover;
}
</style>
    <script type="text/javascript">
    
    function validate()
    {
    	
    	alert("validate")
    	
    
    }
    </script>
    
    

</head>
<body >
    
    
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/welcome" class="navbar-brand">Home</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="/login">Login</a></li>
					<li><a href="/registration">New Registration</a></li>
					<li><a href="/adminlogin">Admin</a></li>
					
				</ul>
			</div>
		</div>
	</div>
	

	<c:choose>
		<c:when test="${mode=='MODE_HOME' }">
		
			<div class="container" id="homediv">
				<div class="jumbotron text-center">
				    
					<h1>Welcome to BookTickets.com</h1>
					<h3>Please Book Your Tickets By Login</h3>
				</div>
				 
			</div>
            
		</c:when>
	</c:choose>
	
	<div align="center"> <img src="/static/images/movie-ticket-booking.jpg"></div>
				
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
</body>

</html>