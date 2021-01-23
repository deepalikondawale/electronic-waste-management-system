<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("userid");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String database = "e-wastedb";
String userid = "root";
String password = "mysqldb";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            table , th, td{
                border: 1px solid black;
                border-collapse: collapse;
            }
            td {
                padding: 10px;
            }
        </style>
    </head>
<body>
    <div align="center">
<h1>Clients Details</h1>
<table border="1" width="70%" height="80" align="center">
<tr>
    <td><center><b>Serial No</b></center></td>
<td><center><b>First Name</b></center></td>
<td><center><b>Last Name</b></center></td>
<td><center><b>User Name</b></center></td>
<td><center><b>Mobile No</b></center></td>
<td><center><b>Address</b></center></td>

</tr>


<%
try{
connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/e-wastedb", "root", "mysqldb");
statement=connection.createStatement();
String sql ="select * from user";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td><center><%=resultSet.getString("userid") %></center></td>
<td><center><%=resultSet.getString("fname") %></center></td>
<td><center><%=resultSet.getString("lname") %></center></td>
<td><center><%=resultSet.getString("username") %></center></td>
<td><center><%=resultSet.getString("mobileno") %></center></td>
<td><center><%=resultSet.getString("address") %></center></td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
    </div>
</body>
</html>
