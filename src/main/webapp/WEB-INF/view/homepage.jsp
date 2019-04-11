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
<body >
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/welcome" class="navbar-brand">Tecno-Tab</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="/show-users">Profile Settings</a></li>
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
	 			<h1 style="color:blue;font-size:50px;">Welcome ${user.username } !!!</h1>	 
	 </div>
	<c:choose>
		<c:when test="${mode=='MODE_REGION' }">
			<div  class="container text-center">
			<h3>User Login</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="/show-movies">
					<c:if test="${not empty error }">
						<div class= "alert alert-danger">
							<c:out value="${error }"></c:out>
							</div>
					</c:if>
				<h3>Please Select Region And Date</h3>
				
	              <div class="form-group">
						<label class="control-label col-md-3">Please Select City</label>
						<div class="col-md-7">
							<input id="cityname" type="text" class="form-control" name="moviearea"
								value="${movie.moviearea }" />
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Select movie date</label>
						<div class="col-md-7">
							<input id="dateinput" placeholder="click here to select date" type="text" class="form-control" name="moviedate"
								value="${movie.moviedate }" />
						</div>
					</div>
					<div class="form-group ">
						<input type="submit" class="btn btn-primary" value="Submit" />
					</div>
					</form>
					</div>
					</c:when>
	</c:choose>
	 
	
	

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
    <script src="static/jqueryui/jquery-ui.js" type="text/javascript"></script>
    
    
	
</body>
   <script> 
   var citylist =["Hyderabad","Pune","Chennai","Bangalore"];
    $("#cityname").autocomplete({
    	source:citylist
    },{
    	autofocus:true
    });    
    </script>

    <script> 
    $("#dateinput").datepicker({dateFormat: 'yy-mm-dd'});    
    </script>
</html>