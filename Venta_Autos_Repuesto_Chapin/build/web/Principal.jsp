<%-- 
    Document   : Principal
    Created on : 13/09/2022, 09:42:01 PM
    Author     : Reyes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <link href="./css/EstilosPg.css" rel="stylesheet" type="text/css"/>
        <title>Menu Principal</title>
    </head>
    <body class='bg2'>
        <nav class="navbar navbar-expand-lg"  style="background-color: #0c0404">
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                  <li class="nav-item" active>
                      <a style="margin-left: 10px;" class="btn btn-outline-light"  href="Controlador?menu=Home" target="myFrame">Home</a>
                  </li>
                  <li class="nav-item">
                      <a style="margin-left: 30px;" class="btn btn-outline-light"  href="Controlador?menu=Accesorios" target="myFrame">Accesorios</a>
                  </li>
                  <li class="nav-item">
                    <a style="margin-left: 30px;" class="btn btn-outline-light"  href="Controlador?menu=Factura" target="myFrame">Factura</a>
                  </li>
                  <li class="nav-item">
                    <a style="margin-left: 30px;" class="btn btn-outline-light"  href="Controlador?menu=Autos" target="myFrame">Autos</a> <br>
                  </li> 
                  <li>
                <a class="btn btn-danger" style="margin-left: 30px;" href="view/add.jsp">Agregar Nuevo Auto</a>
                  </li>
                  
                </ul>
             </div>
            
                <div class="dropdown">

                  <button style="margin-left: 125px;"   class="btn btn-outline-light dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspoput="true" aria-expanded="false">
                   Perfil 
                    ${usuario.getNombreUsuario} 
                  </button>
                   <div class="dropdown-menu text-center" aria-labellebdy="dropdownMenuButton">
                   <a class="dropdown-item" href="#">
                      <img src="Image/perfil-del-usuario (1).png" alt="50" height=" 100" width="100"/>
                    </a>  
                       <li class="nav-item"></a>
                  </li>
                  
                    <a class="dropdown-item" href="#">${usuario.getNombreUsuario()}</a>
                    <a class="dropdown-item" href="#">usuario@gmail.com</a>
                    <div class="dropdown-divider"></div>
                        <form action="Validar" method="POST">                          
                            <button name="accion" name="salir" class="dropdown-item" href="#">Salir</button>             
                        </form>
                     </div>                        
                </div>                    
        </nav><br>
        <div class="bgDiv">
                    <div class="container2">
                        <h1 class="textP text-center">Pagina Principal</h1>                                                                             
                    </div><br><br>
                    <div class="container">
                        <h2 class="text text-center">Bienvenidos</h2><br>
                            <div class="text-center">
                                <a href="Principal.jsp">
                                   <img src="Image/casa.png" class="img2"/>
                                </a><br>
                                <a href="Empleado.jsp">
                                    <img src="Image/factura.png" class="img2"/>
                                </a><br>
                                <a href="asesor.jsp">
                                    <img src="Image/asesor1.png" class="img2"/>
                                </a><br>
                                
                             </div>
                    </div>
        </div>
                                              
        
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>
