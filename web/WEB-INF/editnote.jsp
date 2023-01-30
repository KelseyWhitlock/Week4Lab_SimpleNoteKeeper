<%-- 
    Document   : editnote
    Created on : 27-Jan-2023, 2:02:23 PM
    Author     : Kelsey
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Note Edit</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <br>
        <br>
        <h2>Edit Note</h2>
        <br>
        <br>
        <form>
        Title: <input type="text" name="title" value="${note.title}">
        <br><br>
        Contents: <input type="textarea" name="cotents" cols="25" value="">
        <br>
        <input type="sumbit" name="sumbit" value="Save">
        </form>
    </body>
</html>
