<%-- 
    Document   : LoginCheck
    Created on : 14-Oct-2020, 18:03:41
    Author     : deepali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.io.*,java.util.*, java.sql.*"%>

<%
    String username = request.getParameter("username");
    session.putValue("username", username);
    String password = request.getParameter("password");
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-wastedb", "root", "mysqldb");
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery("select * from user where username='"+username+"' and password='"+password+"'");
    try
    {
        rs.next();
        if(rs.getString("password").equals(password)&& rs.getString("username").equals(username))
        {
            response.sendRedirect("userhomepage.jsp");
           
        }
        else
        {
            request.setAttribute("errorMessage", "Invalid user or password");
            request.getRequestDispatcher("User.jsp").forward(request, response);
            
            
        }
    }
    
    catch (Exception e)
    {
       out.println(e);
    }
    %>



