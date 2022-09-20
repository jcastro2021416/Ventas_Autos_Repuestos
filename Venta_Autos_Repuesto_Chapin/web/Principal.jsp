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
        <title>Menu Principal</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg"  style="background-color: blueviolet">
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
                    <a style="margin-left: 30px;" class="btn btn-outline-light"  href="Controlador?menu=Autos" target="myFrame">Autos</a>
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
                      <img src="img/usuario.png" alt="50" height=" 100" width="100"/>
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
                    
          </nav>
                    
                   <%--  <div class="m-4" style="height: 650px;">
                                <iframe name="myFrame" style="height: 50%; width: 50%">
                                <a style="margin-left: 50px;" class="btn btn-outline-black"  href="Controlador?menu=Id_Autos" target="myFrame">Id_Autos</a>
                           </iframe>
                                <li class="nav-item">    
                  </li>
                    </div>
                   --%>
                   
                   <%-- <div>
                       <center>
                           <iframe name="myFrame" style="height: 50%; width: 75%">
                           <a style="margin-left: 20px;" class="btn btn-outline-light"  href="Controlador?menu=Home" target="myFrame">Id_Autos</a>
                       </iframe>
                       </center>
                   </div>  --%>
                   <%-- <div>
                       <h1 class="text-center">Agregar autos</h1
                   </div>
                   <table class="table table-bordered">
                       <thead>
                           <tr>
                                <th class="text-center text-primary">Id_auto</th>
                                <th class="text-center text-primary">Matricula</th>
                                <th class="text-center text-primary">Marca</th>
                                <th class="text-center text-primary">Modelo</th>
                                <th class="text-center text-primary">Color</th>
                            </tr>
                        </thead
                   </table> --%>
                   
                    <center><div class="container">
                     <div class="col-lg-3">
                     <h1 class="text-center">Agregar Auto</h1>
                     <form action="Controlador">
                        <strong>Id_auto:</strong><br>
                        <input class="form-control" type= "text" name="txtDPI"><br>
                        <strong>Matricula:</strong><br><br>
                        <input class="form-control" type="text" name="txtNombre"><br>
                        <strong>Marca:</strong><br><br>
                        <input class="form-control" type="text" name="txtNombre"><br>
                        <strong>Modelo:</strong><br><br>
                        <input class="form-control" type="text" name="txtNombre"><br>
                        <strong>Color:</strong><br><br>
                        <input class="form-control" type="text" name="txtNombre"><br>
                        <input class="btn btn-primary" type="submit" name="accion" value="Agregar"><br>
                     </form>
                     </div></center>
    
    
                    <center><div class="container">
                     <div class="col-lg-3">
                     <h1 class="text-center">Agregar Repuesto</h1>
                     <form action="Controlador">
                        <strong>Id_repuestos:</strong><br>
                        <input class="form-control" type= "text" name="txtDPI"><br>
                        <strong>Nombre</strong><br><br>
                        <input class="form-control" type="text" name="txtNombre"><br>
                        <strong>Stock</strong><br><br>
                        <input class="form-control" type="text" name="txtNombre"><br>
                        <strong>Modelo:</strong><br><br>
                        <input class="form-control" type="text" name="txtNombre"><br>
                        <strong>Color:</strong><br><br>
                        <input class="form-control" type="text" name="txtNombre"><br>
                        <input class="btn btn-primary" type="submit" name="accion" value="Agregar"><br>
                     </form>
                     </div></center>
                    
        
        
        
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>
