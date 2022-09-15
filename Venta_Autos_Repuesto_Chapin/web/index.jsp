<%-- 
    Document   : index
    Created on : 9/09/2022, 07:39:55 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>Asesorías</title>
    </head>
    <body>
        <style>
            body {background-color: #fbc353;}
        </style>
            <div class="container mt-5 col-lg-5">
                <div class="card col-sm-10">
                    <div class="card-body">
                        <form class="form-sign" action="Validar" method="POST">
                            <div class="form-group text-center">
                                <h3>Asesorías</h3>
                                <label>Estimado cliente, ¿Cómo podemos brindarle ayuda?</label>
                            </div>
                            <div class="form-group">
                                <label><U><B><font color="red">*REPUESTOS</font></B></U></label>
                                <CENTER><font color="blue"><font size="3">Filtros</font></font></CENTER>    
                                <CENTER><font color="blue"><font size="3">Baterias</font></font></CENTER>
                                <CENTER><font color="blue"><font size="3">Bombillas</font></font></CENTER>
                                <CENTER><font color="blue"><font size="3">Neumáticos</font></font></CENTER>
                                <CENTER><font color="blue"><font size="3">Bujías</font></font></CENTER>
                                <CENTER><font color="blue"><font size="3">Embragues</font></font></CENTER>
                            </div>
                            <div class="form-group">
                                <label><U><B><font color="red">*AUTOS</font></B></U></label>
                                <CENTER><font color="blue"><font size="3">Velocidad</font></font></CENTER>
                                <CENTER><font color="blue"><font size="3">Trabajo Pesado</font></font></CENTER>
                                <CENTER><font color="blue"><font size="3">Todo Terreno</font></font></CENTER>
                            </div>
                            <input type="submit" name="accion" value="Adquirir asesoría" class="btn btn-primary btn-block">
                        </form>
                    </div>
                </div>
            </div>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>