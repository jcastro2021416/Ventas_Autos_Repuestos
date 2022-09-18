<%-- 
    Document   : editarFactura
    Created on : 17/09/2022, 04:22:26 PM
    Author     : HP Compaq Elite 8000
--%>

<%@page import="modelo.Factura"%>
<%@page import="modelo.FacturaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <%
                FacturaDAO nuevaPersonaDAO = new FacturaDAO();
                int codFactura = Integer.parseInt((String)request.getAttribute("codFac"));
                Factura nuevaFactura = (Factura) nuevaPersonaDAO.list(codFactura);
            %>
            <h1>Editar Factura<h1>
            <form>
                <strong>DPI:</strong>
                <input class="form-control" type="text" name="txtDPI" placeholder="YYYY-MM-DD" value="<%=nuevaFactura.getFechaFactura()%>"><br><br>
                <strong>Total Factura</strong>
                <input class="form-control" type="text" name="txtTotal" placeholder="GTQ" value="<%=nuevaFactura.getTotalFactura()%>"><br><br>
                <strong>Codigo Cliente</strong>
                <input class="form-control" type="text" name="txtCliente" value="<%=nuevaFactura.getCodCliente()%>">>
                <input class="btn btn-primary" type="submit" name="accion" value="Actualizar">
            </form>        
        </div>
    </body>
</html>
