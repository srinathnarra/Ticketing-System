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
<link href="/static/jqueryui.css" rel="stylesheet">
<link href="/static/jqueryui.structure.css" rel="stylesheet">
<link href="/static/jqueryui.theme.css" rel="stylesheet">

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
				<h3>Booking Details</h3>
				<form class="form-horizontal" method="POST" action="/Book-Summary">
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
							</tr>
				  </thead>
				  <tbody>
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
				                </tr>	
				                							
					</tbody>
						
					</table>
                 <div class="form-group">
						<label class="control-label col-md-3">Enter no of tkts</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="nooftkts"
								value="${booking_details.nooftkts }" />
						</div>
						
						<label class="control-label col-md-3">Selct Show Time</label>
						<div class="col-md-7">
							 <select name="showTimeslcted" class="form-control" name="${booking_details.showtimeslcted }">        
                                       <option value="10AM">10 AM</option>
                                       <option value="02PM">02 PM</option>
                                       <option value="06PM">06 PM</option>
                                       <option value="09PM">09 PM</option>
                                </select>								
						</div>
						
						<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Proceed to book" />
						<input type="hidden" class="btn btn-primary" name="movieId" value="${movies.movieid}"/>
					    </div>
					    
				</div>
				
				                   
                                       
                                  


				 
	      </form>
	 </div>	
	   
	
<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
	    <script src="static/jqueryui/jquery-ui.js" type="text/javascript"></script>
	
</body>
</html>  
	  
		