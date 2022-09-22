<%--
    Document   : listar
    Created on : 26/08/2022, 04:43:23 PM
    Author     : Edson Patzan
--%>
<%@page import="modelo.Vehiculos"%>
<%@page import="modelo.VehiculosDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Cliente"%>
<%@page import="modelo.ClienteDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="./css/Estilo.css" rel="stylesheet" type="text/css"/>
        <title>Listar Vehiculos</title>
    </head>
    <body>
       <div class="container">
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th class="text-center text-danger">IdVehiculo</th>
                    <th class="text-center text-danger">Matricula</th>
                    <th class="text-center text-danger">Marca</th>
                    <th class="text-center text-danger">Modelo</th>
                    <th class="text-center text-danger">Color</th>
                    <th class="text-center text-danger">Codigo Persona</th>
                </tr>
            </thead>
            
            <%
               VehiculosDAO dao = new VehiculosDAO();
               List<Vehiculos> listaVehiculos = dao.listar();
               Iterator<Vehiculos> iterator = listaVehiculos.iterator();
               Vehiculos veh = null;
               while (iterator.hasNext()){
                   veh = iterator.next();
            %>
            <tbody>
                <tr>
                    <td class="text-center active"><%= veh.getIdVehiculos()%></td>
                    <td class="text-center"><%= veh.getMatricula()%></td>
                    <td class="text-center active"><%= veh.getMarca()%></td>
                    <td class="text-center active"><%= veh.getModelo()%></td>
                    <td class="text-center active"><%= veh.getColor()%></td>
                    <td class="text-center active"><%= veh.getCodCliente()%></td>
                    <a class="btn btn-warning" href="Controlador?accion=editar&IdVehiculos=<%= veh.getIdVehiculos()%>">Editar</a>
                    <a class="btn btn-danger" href="Controlador?accion=eliminar&IdVehiculos=<%= veh.getIdVehiculos()%>">Eliminar</a>
                        
                       <%--<a class="btn btn-danger" href="Controlador?accion=eliminar&codigoPersona=<%=per.getCodigoPersona()%>">Eliminar</a> --%>
                    </td>
                </tr>
                <%}%>
            </tbody>
            </table>
        </div>
    </body>
</html>