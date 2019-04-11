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
					<li><a href="/log-out">Log out</a></li>
					
				</ul>
			</div>
		</div>
	</div>

	<div class="container" id="homediv">
		<div class="jumbotron text-center">
			<h1>Welcome to Movie Booking.com</h1>
			<h3>Glad to see you!!!</h3>
		</div>
	</div>

	
	     <div class="container text-center" id="tasksDiv">
				<h3>All Movies</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered">
						<thead>
							<tr>
								<th>Movie Id</th>
								<th>Movie Name</th>
								<th>Movie Area</th>
								<th>Tkts at 10AM</th>
								<th>Tkts at 2PM</th>
								<th>Tkts at 6PM</th>
								<th>Tkts at 9PM</th>
								<th>Price of Tkt</th>
								<th>Movie Date</th>
								<th>Thetaer Name</th>								
								<th>Click to book</th>
								
								
                		</tr>
						</thead>
						<tbody>
							<c:forEach var="movies" items="${movies}">
								<tr>
									<td>${movies.movieid}</td>
									<td>${movies.moviename}</td>
									<td>${movies.moviearea}</td>
									<td>${movies.tktsavalbleattenam}</td>
									<td>${movies.tktsavableattwopm}</td>
									<td>${movies.tktsavbleatsixpm}</td>
									<td>${movies.tktsavalbleatninepm}</td>
								    <td>${movies.tkttprice}</td>						
									<td>${movies.moviedate}</td>
									<td>${movies.theatername}</td>									
									<td>
									<a href="/Book-tkts?movieid=${movies.movieid }"><span
											class="glyphicon">&#xe009</span></a>
					                </td>							                					
								</tr>
							</c:forEach>
						</tbody>						
					</table>
				</div>
	    </div>
	
	

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
</body>
</html>