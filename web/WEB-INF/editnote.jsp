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
        <form action="note" method="post">
        <h1>Simple Note Keeper</h1>
        <br>
        <br>
        <h2>Edit Note</h2>
        <br>
        <br>
        Title: <input type="text" name="title" value="${note.title}">
        <br><br>
        Contents: <textarea name="contents" role="5" cols="25" ${note.contents}> </textarea>
        <br>
        <input type="submit" name="submit" value="Save">
        </form>
    </body>
</html>
