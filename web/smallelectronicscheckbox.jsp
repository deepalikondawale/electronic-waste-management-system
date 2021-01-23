<%@ page import="java.io.*,java.util.*, java.sql.*"%>
<%= new java.util.Date() %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@page import="java.sql.*"%>
<%
String username = request.getParameter("username");
String items="";
String smallelectronics[]=request.getParameterValues("smallelectronics");
for(int i=0;i<smallelectronics.length;i++){
    items+=smallelectronics[i]+" ";
}

        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-wastedb", "root", "mysqldb");
        Statement st=con.createStatement();
        int i=st.executeUpdate("insert into smallelectronics(username,items, date) values('"+username+"', '"+items+"', NOW())");
        out.println("Data is successfully inserted into database.");
        }
        catch(Exception e){
        out.println(e);
        }
        %>
    