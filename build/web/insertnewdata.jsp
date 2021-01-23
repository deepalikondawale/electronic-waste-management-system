<%-- 
    Document   : insertnewdata
    Created on : 09-Oct-2020, 10:59:58
    Author     : deepali
--%><%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>




<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            String username = request.getParameter("username");
            String mobileno = request.getParameter("mobileno");
            String password = request.getParameter("password");
            String address = request.getParameter("address");
            
            
         try{
             Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-wastedb", "root", "mysqldb");
             Statement st = con.createStatement();
             
             st.executeUpdate("insert into user (fname, lname, username, password, mobileno,  address)values('"+firstname+"', '"+lastname+"', '"+username+"', '"+password+"', '"+mobileno+"',  '"+address+"')");
             
             out.println("data is inserted");
         
         
         
         
         
         }catch(Exception e){
         
             out.println(e);
         
         }
                     
        %>    
    </body>
</html>
