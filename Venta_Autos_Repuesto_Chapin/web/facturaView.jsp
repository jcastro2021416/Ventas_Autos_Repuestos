<%-- 
    Document   : Factura
    Created on : 16/09/2022, 03:21:36 AM
    Author     : HP Compaq Elite 8000
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Factura"%>
<%@page import="modelo.FacturaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Factura</title>
        <link rel="stylesheet" href="Factura.css"/>
        <link rel="stylesheet" href="bootstrap.css">
    </head>
    <body>
        <div class="contenedor">
            <div class="col-lg-5">
                <h1>Agregar Factura</h1>
                <br><br>
                <form action="Controlador">
                    <strong>Fecha:</strong><br>
                    <input class="form-control" type="text" name="txtFecha" placeholder="YYYY-MM-DD"></input><br><br>
                    <strong>TotalFactura:</strong><br>
                    <input class="form-control" type="text" name="txtTotal" placeholder="GTQ"><br><br>
                    <strong>Cliente</strong><br>
                    <input class="form-control" type="text" name="txtCliente"><br><br><br><br>
                    <a href="" class="btn btn-success">Agregar Nueva Factura</a>
                </form>
            </div>
            <div class="col-lg-7">
                <h1>Facturas</h1>
                <br><br>
                <table class="table table-bordered">
                    <thead>         
                        <tr>
                            <th class="text-center text-primary">CODIGO FACTURA</th>
                            <th class="text-center text-primary">FECHA FACTURA</th>
                            <th class="text-center text-primary">TOTAL FACTURA</th>
                            <th class="text-center text-primary">CODIGO CLIENTE</th>
                            <th class="text-center text-primary">ACCIONES</th>
                        </tr>
                    </thead>
                    <%
                        FacturaDAO dao = new FacturaDAO();
                        List<Factura> listaFactura = dao.listar();
                        Iterator<Factura> iterator = listaFactura.iterator();
                        Factura per = null;
                        while(iterator.hasNext()){
                            per = iterator.next();
                        }
                    %>
                    <tbody>
                        <tr>
                            <td class="text-center active"><%= per.getIdFactura()%></td>
                            <td class="text-center"><%= per.getFechaFactura()%></td>
                            <td class="text-center active"><%= per.getTotalFactura()%></td>                            
                            <td class="text-center"><%= per.getCodCliente()%></td>
                            <td class="text-center">
                                <a class="btn btn-warning">Edit</a>
                            </td>
                        </tr>
                    </tbody>>
                </table>
            </div>
        </div>
    </body>
</html>
