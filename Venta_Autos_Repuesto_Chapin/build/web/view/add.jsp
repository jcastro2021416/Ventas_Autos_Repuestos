<%-- 
    Document   : add
    Created on : 22/09/2022, 12:11:30 PM
    Author     : JOSEI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link href="./css/EstilosAs.css" rel="stylesheet" type="text/css"/>
        <title>Agregar Vehiculos</title>
    </head>
    <body>
        <div class="container">
            <div class="container">
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
                <input class="btn btn-danger" type="submit" name="accion" value="Agregar"><br>
            </form>
            </div>
        </div>
    </body>
</html>
