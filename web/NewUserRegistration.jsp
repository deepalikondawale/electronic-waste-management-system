<%-- 
    Document   : registration
    Created on : 06-Oct-2020, 19:10:26
    Author     : deepali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Page</title>
        <link rel ="stylesheet" href="css/registration.css">
        
        <script> 
function validate()
{ 
     var firstname = document.form.firstname.value;
     var lastname = document.form.lastname.value;
     var username = document.form.username.value;
     var mobileno = document.form.mobileno.value;
     var password = document.form.password.value;
     var address= document.form.address.value;
     
     if (firstname==null || firstname=="")
     { 
     alert("First Name can't be blank"); 
     return false; 
     }
     else if (lastname==null || lastname=="")
     { 
     alert("lastname can't be blank"); 
     return false; 
     }
     else if (email==null || email=="")
     { 
     alert("Email can't be blank"); 
     return false; 
     }
     else if (mobileno==null || mobileno=="")
     { 
     alert("mobileno can't be blank"); 
     return false; 
     }
     else if(password.length<6)
     { 
     alert("Password must be at least 6 characters long."); 
     return false; 
     } 
     else if (address===null || address==="")
     { 
     alert("address can't be blank"); 
     return false; 
     }
 } 
</script> 
        
    </head>
    <body>
           <center> 
        <h2>Registration Form</h2> 
        <form action="insertnewdata.jsp" method="post"> 
            <br/>
            <label for="firstname">First Name</label>
            <input type="text" id="firstname" name="firstname" placeholder="Your first name.."><br><br
    
    <label for=lastname">Last Name</label>
    <input type="text" id="lastname" name="lastname" placeholder="Your last name.."><br>
    
   <label for=username">User Name</label>
    <input type="text" id="username" name="username" placeholder="Your last username.."><br>
    
    <label for="mobileno">Mobile No</label>
    <input type="text" id="mobileno" name="mobileno" placeholder="Your mobile no.."><br>
    
    <label for="password">Password</label>
    <input type="text" id="password" name="password" placeholder="Your password.."><br>
    
    <label for="address">Address</label>
    <input type="text" id="address" name="address" placeholder="Your address.."><br>
    
    
    
           
            <input type="submit" value="Submit"> 
        </form> 
    </center>


    </body>
</html>
