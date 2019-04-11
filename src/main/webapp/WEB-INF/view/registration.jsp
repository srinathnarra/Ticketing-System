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
    <style>
body, html {
  height: 100%;
  margin: 0;
}

.bg {
  /* The image used */
  background-image: url("/static/images/movie-ticket-booking.jpg");

  /* Full height */
  height: 100%; 

  /* Center and scale the image nicely */
  background-position: center;
  background-repeat: no-repeat;
  background-size: cover;
}
</style>

    <script type="text/javascript">
    function validate()
    {
    	
    	var uname = document.getElementById("uname").value;
    	var pwd = document.getElementById("pwd").value;
    	var lname = document.getElementById("lname").value;
    	var phoneno = document.getElementById("phoneno").value;
    	var fname = document.getElementById("fname").value;
    	var userid = document.getElementById("userid").value;
    	var age = document.getElementById("Age").value;
    	
    	var reguname = /[a-z]{5}/i;
    	if(reguname.test(uname))
        {
    	  document.getElementById("lbluser").style.visibility="hidden";
    	  var regfname = /[a-z]{3}/i;
    	  if(regfname.test(fname))
     	  {
     	    document.getElementById("lblfname").style.visibility="hidden";
     	    var reglname = /[a-z]{3}/i;
	        if(reglname.test(lname))
		    {
		     document.getElementById("lbllname").style.visibility="hidden";  		     
		     var regphoneno = /[7-9]\d{9}/;
		     if(regphoneno.test(phoneno))
  		     {
  		       document.getElementById("lblphone").style.visibility="hidden";   
  		       var regage = /[0-9]\d{1}/;
   		       if(regage.test(age))
   		       {
   		        document.getElementById("lblage").style.visibility="hidden"; 
   		        var reguserid = /[a-z]{5}/i;
 		        if(reguserid.test(userid))
 		          {
 		           document.getElementById("lbluserid").style.visibility="hidden";  
 		           var regpwd = /[a-z]{8}/i;
	    		   if(regpwd.test(pwd))
	    		        {
	    		         document.getElementById("lblpwd").style.visibility="hidden";   
	    		         return true;
	    		        }
	    		       else
   		               {  		    		
   		                document.getElementById("lblpwd").style.visibility="visible";   		    		
   		                return false;
   		               } 
   		          }
 		          else
  		          {  		    		
  		           document.getElementById("lbluserid").style.visibility="visible";   		    		
  		           return false;
  		          } 
   		       }
  		       else
   		       {  		    		
   		         document.getElementById("lblage").style.visibility="visible";   	 		     
   		         return false;
   		       }  
  		      }
  		      else
 		      {  		    		
 		       document.getElementById("lblphone").style.visibility="visible";   		    		
 		       return false;
 		      }
     	    }
	        else
            {
              document.getElementById("lbllname").style.visibility="visible";
             return false;
            }
     	  }
 	       else
 		   {
 		    document.getElementById("lblfname").style.visibility="visible";
 		    return false;
 		   }         
        }
        else
        {   		
    	 document.getElementById("lbluser").style.visibility="visible";   		
    	 return false;
    	}	
    }
        





/* 
    	if(uname.value.trim()=="")

        {
    		uname.style.border = "solid 3px red";
    		document.getElementById("lbluser").style.visibility="visible";
    		return false;
    		
        }
    	else if()
    	else
    	{
           return true;
    	} */

   
    </script>
    

</head>
<body >
	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/welcome" class="navbar-brand">Home</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="/login">Login</a></li>					
				</ul>
			</div>
		</div>
	</div>
  	<div align="center"> <img src="/static/images/movie-ticket-booking.jpg"></div>

	<c:choose>

		<c:when test="${mode=='MODE_REGISTER' }">
			<div class="container text-center">
				<h3>Please Register Below and Login To Book Tickets</h3>
				<hr>
				<form onsubmit ="return validate()" class="form-horizontal" method="POST" action="save-user">
				     <c:if test="${not empty error }">
						<div class= "alert alert-danger">
							<c:out value="${error }"></c:out>
							</div>
					</c:if>
					<input type="hidden" name="id" value="${user.id }" />
					<div class="form-group">
						<label class="control-label col-md-3">User Name</label>
						<div class="col-md-7">
							<input id="uname" type="text" class="form-control" name="username"
								value="${user.username }" />
							<lable id="lbluser" style="color:red; visibility:hidden;">User Name should start with alphanet and it should be atleast 5 character size</lable>
							<br></br>						
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">First Name</label>
						<div class="col-md-7">
							<input id="fname" type="text" class="form-control" name="firstname"
								value="${user.firstname }" />
						    <lable id="lblfname" style="color:red; visibility:hidden;">First Name should start with alphanet and it should be atleast 3 character size</lable>
								
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Last Name</label>
						<div class="col-md-7">
							<input id="lname" type="text" class="form-control" name="lastname"
								value="${user.lastname }" />
						    <lable id="lbllname" style="color:red; visibility:hidden;">Last Name should start with alphanet and it should be atleast 3 character size</lable>
								
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-3">Phone No </label>
						<div class="col-md-3">
							<input id="phoneno" type="text" class="form-control" name="phoneno"
								value="${user.phoneno }" />
					    <lable id="lblphone" style="color:red; visibility:hidden;">Phone No should start with 7 or 8 or 9 and Phone No size should be of 10</lable>
								
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Age </label>
						<div class="col-md-3">
							<input id="Age" type="text" class="form-control" name="age"
								value="${user.age }" />
		                    <lable id="lblage" style="color:red; visibility:hidden;">Age should be greater than 1 digit size</lable>
								
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-3">User Id </label>
						<div class="col-md-3">
							<input id="userid" type="text" class="form-control" name="userid"
								value="${user.userid }" />
			                <lable id="lbluserid" style="color:red; visibility:hidden;">User id must be like @gmail or @yahoo and ends with .com or .co or .in</lable>
								
						</div>
					</div>
					
					<div class="form-group">
						<label class="control-label col-md-3">Password</label>
						<div class="col-md-7">
							<input id="pwd" type="password" class="form-control" name="password"
								value="${user.password }" />
						    <lable id="lblpwd" style="color:red; visibility:hidden;">Password must be more than 8 character size</lable>
								
						</div>
					</div>
					
					<div class="form-group ">
			          <input  type="submit" class="btn btn-primary" value="Register" />
		             </div>
				</form>
			</div>
		</c:when>
		
	</c:choose>
  
     
	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="static/js/jquery-1.11.1.min.js"></script>
	<script src="static/js/bootstrap.min.js"></script>
</body>
</html>