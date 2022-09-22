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
        <link href="./css/EstilosAs.css" rel="stylesheet" type="text/css"/>
        <title>Asesorías</title>
    </head>
    <body class="bg">
            <div class="container2">
                <div>
                    <div>
                        <form action="Validar" method="POST">
                            <div class="container">
                                <h1 class="textP text-center">Asesorías</h1>
                                <center><img src="Image/Asset-2.png" class="img"/></center>
                                <center><label class="text2 text-center">Estimado cliente, ¿Cómo podemos brindarle ayuda?</label></center><br>
                            </div>
                            <div class="br">
                                <label><U><B><font class="text2 br">*REPUESTOS</font></B></U></label>
                                <div class="text-center br">
                                    <LEFT><a href="" class="btn button1 br">Filtros</a></LEFT>                                 
                                    <RIGHT><a href="" class="btn button1 br">Baterìas</a></RIGHT>
                                </div>
                                <div class="text-center br">
                                    <LEFT><a href="" class="btn button1 br">Bombillas</a></LEFT>
                                    <RIGHT><a href="" class="btn button1 br">Neumàticos</a></RIGHT>
                                </div>
                                <div class="text-center br">
                                    <LEFT><a href="" class="btn button1 br">Bujìas</a></LEFT>
                                    <RIGHT><a href="" class="btn button1 br">Embragues</a></RIGHT>
                                </div>
                            </div>
                            <div>
                                <label><U><B><font class="text2 br">*AUTOS</font></B></U></label>
                                <div class="text-center br">
                                    <LEFT><a href="" class="btn button2 br">Velocidad</a></LEFT>
                                    <RIGHT><a href="" class="btn button2 br">Trabajo Pesado</a></RIGHT>
                                    <RIGHT><a href="" class="btn button2 br">Todo Terreno</a></RIGHT>
                                </div>
                            </div>
                            <center><input type="submit" name="accion" value="Adquirir asesoría" class="btnP button br"><center/>
                        </form>
                    </div>
                </div>
            </div>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>