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

</head>
<body>
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/welcome" class="navbar-brand">Tecno-Tab</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="/login">Login</a></li>
					<li><a href="/register">New Registration</a></li>
					<li><a href="/show-users">All Users</a></li>
				</ul>
			</div>
		</div>
	</div>

	<div class="container" id="homediv">
		<div class="jumbotron text-center">
			<h1>Booking Summary</h1>
			<h3>Glad to see you!!!</h3>
		</div>
	</div>
  <div class="container text-center">
	<h3>Booking Summary</h3>
	 <table class="table table-striped table-bordered">
				   <thead>
							<tr>
								<th>Booking Id</th>
								<th>Movie Id</th>
								<th>Movie Name</th>
					            <th>Movie Area</th>	
					            <th>Theater Name</th>	
					            <th>Show Time</th>							
								<th>User name</th>
								<th>no of tkts</th>							
								<th>Ticket Price</th>
								<th>Booking Date</th>
																																		
							</tr>
				  </thead>
				  <tbody>
								<tr>
									<td>${bookingdetails.booking_id}</td>
									<td>${bookingdetails.movie_id}</td>
									<td>${bookingdetails.moviename}</td>
									<td>${bookingdetails.moviearea}</td>
									<td>${bookingdetails.theatername}</td>
									<td>${bookingdetails.movietime}</td>
									<td>${bookingdetails.username}</td>
									<td>${bookingdetails.nooftkts}</td>
									<td>${bookingdetails.totalprice}</td>
									<td>${bookingdetails.bookingdate}</td>
									
									
					
				                </tr>	
				                							
					</tbody>
						
					</table>
	</div>	
     <div class="container text-center">
			
				<form class="form-horizontal" method="POST" action="/Pdf-Generate">
			   
                 <div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Click here to generate PDF" />
						<input type="hidden" class="btn btn-primary" name="bookingId" value="${bookingdetails.booking_id}"/>
					    </div>
	      </form>
	 </div>	
	 
	 <div class="container text-center">
		<form class="form-horizontal" method="POST" action="/sendemail">
		
                 <div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Click here to send email" />
						<input type="hidden" class="btn btn-primary" name="bookingId" value="${bookingdetails.booking_id}"/>
					    </div>
	      </form>
	 </div>	
	   
</body>
	  