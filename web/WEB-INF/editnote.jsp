<%-- 
    Document   : editnote
    Created on : Sep 23, 2018, 8:47:02 PM
    Author     : 683676
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Note</title>
    </head>
    <body>
         <h1>Simple Note Keeper</h1>
        <br>
        <h2>View Note</h2>
        <br>
        <form method="post" action="save">
        <h3>Title: </h3> 
        <input type="text" name="editTitle">
        <br>
        <h3>Contents:</h3>
        <input type="text"  name="editContents" >
        
        
        <input type="submit" >

        </form>
        <br>
        <br>
        
            
    </body>
</html>
