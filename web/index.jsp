<%-- 
    Document   : index
    Created on : 05-abr-2021, 20:07:10
    Author     : josea
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="calculadoraSimple" method="post">
            <label> Numero 1: </label> <input type="text" name="operando1" value="0" size="14">
            <br><br>
            <label> Numero 2: </label> <input type="text" name="operando2" value="0" size="14">
             <br><br>
            <input type="submit" name="suma" value="+" >&nbsp;&nbsp;&nbsp;
            <input type="submit" name="resta" value="-" >&nbsp;&nbsp;&nbsp;
            <input type="submit" name="multiplicacion" value="*" >&nbsp;&nbsp;&nbsp;
            <input type="submit" name="division" value="/" >&nbsp;&nbsp;&nbsp;
            <br><br>
            <label> Resultado: </label><input type="text" name="resultado" value="0" size="14">
    
        </form>
    </body>
</html>
