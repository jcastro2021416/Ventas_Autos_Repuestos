<%-- 
    Document   : add
    Created on : 21/09/2022, 01:05:20 AM
    Author     : Reyes
--%>

<%-- 
    Document   : add
    Created on : 26-ago-2022, 16:15:39
    Author     : Edson Patzan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<a href="listar.jsp"></a>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>Agregar Vehiculos</title>
    </head>
    <body>
        <div class="container">
            <div class="col-lg-5">
        <h1 class="text-center">Agregar Vehiculos</h1>
        <form action="Controlador"> 
            <strong >idVehiculos:</strong><br>
            <input class="form-control" type = "text" name="txtDPI"><br><br>
            <strong >matricula:</strong><br><br>
            <input class="form-control" type = "text" name="txtDPI"><br><br>
            <strong >marca:</strong><br>
            <input class="form-control" type = "text" name="txtDPI"><br><br>
            <strong >color:</strong><br><br>
            <input class="form-control" type = "text" name="txtDPI"><br><br>
            <strong >codCliente:</strong><br>
            <input class="form-control" type = "text" name="txtDPI"><br><br>            
            <input class="btn btn-primary" type="submit" name="accion" value="Agregar"><br>
            </form>
            </div>
        </div>
    </body>
</html>

