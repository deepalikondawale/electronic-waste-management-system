<%-- 
    Document   : smallelectronics
    Created on : 18-Oct-2020, 11:37:15
    Author     : deepali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel ="stylesheet" href="css/smallelectronics.css">
    </head>
    <body>
        <form method="post" action="smallelectronicscheckbox.jsp" >

<h1 class="title">Select E-waste Electronics Types</h1>            
            
<ul class="unstyled centered">
<label for=username">User Name</label>
<input type="text" id="username" name="username" placeholder="Your last username.."><br><br>
    Select Items:<br>
<input type="checkbox" id="se1" name="smallelectronics" value="Pendrive">
<label for="se1">Pendrive</label>
  
  <input type="checkbox" id="se2" name="smallelectronics" value="Smartphone">
  <label for="se2">Smartphone</label>
  
  <input type="checkbox" id="se3" name="smallelectronics" value="Monitor">
  <label for="se3">Monitor</label>
  
  <input type="checkbox" id="se4" name="smallelectronics" value="Keyboard">
  <label for="se4">Keyboard</label>
  
  <input type="checkbox" id="se5" name="smallelectronics" value="Mouse">
  <label for="se5">Mouse</label>
  
  <input type="checkbox" id="se6" name="smallelectronics" value="CPU">
  <label for="se6">CPU</label>
  
  <input type="checkbox" id="se7" name="smallelectronics" value="USB">
  <label for="se7">USB</label>
  
  <input type="checkbox" id="se8" name="smallelectronics" value="Speakers">
  <label for="se8">Speakers</label>
  
  <input type="checkbox" id="se9" name="smallelectronics" value="Radio">
  <label for="se9">Radio</label>
  
  <input type="checkbox" id="se10" name="smallelectronics" value="Watches">
  <label for="se10">Watches</label>
  
  <input type="checkbox" id="se11" name="smallelectronics" value="Mini fan">
  <label for="se11">Mini fan</label>
  
<input type="submit" value="Submit">
</ul>
</form>
    </body>
</html>
