<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>

        <link rel="stylesheet" href="css/login.css">
        <link href="https://fonts.googleapis.com/css?family=Montserrat:500&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
</head>
<body>
	
      	
      
<!-- header navigations ends hear  -->
        
        
        
        <div class="hero">
        	<p>Add/Edit Items</p>
      		<div class="form-box">
      			<div class="button-box">
      				<div id="btn"></div>
      				<button type="button" class="toggle-btn" onclick="login()">Add New Item</button>
      				<button type="button" class="toggle-btn" onclick="register()">Edit Existing Item</button>
      				
      			</div>
	      		<form id="login" class="input-group" action="#" method="post">
	      			<input type="text" name="itemName" class="input-field" placeholder="Item Name" required>
	      			<input type="text" name="date" class="input-field" placeholder="Date" required>
	      			<input type="text" name="type" class="input-field" placeholder="Item Type" required>
	      			<input type="text" name="unit" class="input-field" placeholder="Unit" required>
	      			<input type="password" name="price" class="input-field" placeholder="Price" required>
	      			
	      			<button type="submit" class="submit-btn">Add</button>
	      			
	      			
      			</form>   
      			<form id="register" class="input-group" method="post" action="<%= request.getContextPath()%>/register">
      				<input type="text" name="id" class="input-field" placeholder="Id" required>
      				<input type="text" name="lName" class="input-field" placeholder="Item Name" required>
      				<input type="text" name="phoneNo" class="input-field" placeholder="Date" required>
	      			<input type="text" name="email" class="input-field" placeholder="Item Type" required>
	      			<input type="text" name="username" class="input-field" placeholder="Unit" required>	      			
	      			<input type="password" name="password" class="input-field" placeholder="Price" required>
	      			
	      			<button type="submit" class="submit-btn">Save</button>
					
      			</form>   
      			
      		</div>

      		   		
      	</div>
      	
      	
      	
      	
      	
      	
      	
<!-- footer contents -->

        <script type="text/javascript" src="js/mobile.js"></script>
        <script type="text/javascript">
		
        var x = document.getElementById("login");
        var y = document.getElementById("register");
        var z = document.getElementById("btn");
        
        function register(){
			x.style.left = "-400px";
			y.style.left = "50px";
			z.style.left = "110px";
		
		}
        function login(){
			x.style.left = "50px";
			y.style.left = "450px";
			z.style.left = "0";
		
		}
        
		</script>
    </body>
</html>