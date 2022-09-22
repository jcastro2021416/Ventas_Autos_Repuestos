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
        <link href="css/Log.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
          <div class="container mt-6 col-lg-6">
              <div class="login-container">
              <div class="login-info-container">
                  <div class="card-body">
            <form action="Validar" method="POST">
            <div class="form-group text-center">
                                <h1>Login</h1>
                                <img class="img" src="Image/Logo.png"><br><br>
                                <p><strong><h4>Venta de Repuestos AutosChapin</h4></strong></p>
                </div>
                <div class="form-group">
                    <strong><h4 style="color: #0a0a0a"size="4">Usuario</h4></strong>
                    <input type="text" name="txtUser" class="form-control">
                </div>
                <div class="form-group">
                    <strong><h4 style="color: #0a0a0a"size="4">Contraseña</h4></strong>
                    <input type="password" name="txtPass" class="form-control">
                </div>
                <input class=" btn-danger btn-block" type="submit" name="accion" value="Ingresar">
                </div>
            </form>
           </div>
              <img class="image-container" src="Image/Login.png" alt="">
          </div> 
          </div>
        </div>
        
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</html>

