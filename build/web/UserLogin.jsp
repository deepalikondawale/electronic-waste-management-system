<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Login Page</title>
        <link rel ="stylesheet" href="css/AdminLogin.css">
    </head>
    <body>
        <center> 
       
        <form action="LoginCheck.jsp" method="post"> 
            <div class ="login-page">
            <div class="form">
             <input type="text" name="username" placeholder="user name">
             <input type="password" name="password" placeholder="password"> 
             <button>Login</button><br>
            <p class="message">Not registered? <a href="NewUserRegistration.jsp">Create an account</a></p>
            </div>
            </div>
        </form> 
    </center>
    </body>
</html>