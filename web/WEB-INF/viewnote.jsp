<%-- 
    Document   : viewnote
    Created on : Sep 23, 2018, 8:46:50 PM
    Author     : 683676
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <form method="get" action="view">
            <h1>Simple Note Keeper</h1>
            <br>
            <h2>View Note</h2>
            <br>
            <h3>Title: </h3> 
            ${note.title}
            <br>
            <h3>Contents:</h3>
            ${note.contents}
            <br>
            </form>
        <br>
        <a href="note?edit">Edit</a>
    
    </body>
</html>
