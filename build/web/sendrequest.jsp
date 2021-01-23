<%-- 
    Document   : sendrequest
    Created on : 16-Oct-2020, 19:26:06
    Author     : deepali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel ="stylesheet" href="css/userhomepage.css">
        
        <script type="text/javascript">
            function redirectPage(use,rname)
            {
                for(var val =0, r1=use.elements; val < r1.length; val++)
                    if(r1[val].name == rname && r1[val].checked)
                        use.action=r1[val].value;
            }
        </script>
        
    </head>
    <body>
        <br><br><br>
        <h2><center>Choose the type of Electronics</center></h2>
        <div align="center" >
            <form  action ="#" method="post" onsubmit="redirectPage(this, 'r1');">
                <input type ="radio" name="r1" value="smallelectronics.jsp">Small Electronics<br><br>
                <input type ="radio" name="r1" value="bigelectronics.jsp">Big Electronics<br><br>
                <input type ="submit" value="Next"/>
            </form>
        </div>
    </body>
</html>
