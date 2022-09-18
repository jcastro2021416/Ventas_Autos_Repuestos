/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Factura;
import modelo.FacturaDAO;

/**
 *
 * @author USER
 */
public class Controlador extends HttpServlet {
    String listar ="facturaView.jsp"; // COMPLETAR
    String add ="web/Empleado.jsp";
    String edit="view/editarFactura";
    Factura nuevaFactura = new Factura();
    FacturaDAO nuevaFacturaDAO = new FacturaDAO();
    int idFactura;
    
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String acceso = "";
        String action = request.getParameter("accion");
        if (action.equalsIgnoreCase("listar")){
            acceso = listar;
        }else if(action.equalsIgnoreCase("add")){
            acceso = add;
        }else if(action.equalsIgnoreCase("Agregar")){ //AGREGAR
            String fFactura = request.getParameter("txtFecha");
            String tFactura = request.getParameter("txtTotal");
            String cCliente = request.getParameter("txtCliente");
            nuevaFactura.setFechaFactura(fFactura);
            nuevaFactura.setTotalFactura(Double.parseDouble(tFactura));
            nuevaFactura.setCodCliente(Integer.parseInt(cCliente));  
            nuevaFacturaDAO.add(nuevaFactura);
            acceso = listar;
            
        }else if(action.equalsIgnoreCase("editar")){ //EDITAR
            request.setAttribute("codFac", request.getParameter("idFactura"));
            
        }else if(action.equalsIgnoreCase("Actualizar")){ //ACTUALIZAR
            idFactura = Integer.parseInt(request.getParameter(""));
            String fechaFactura = request.getParameter("");
            String totalFactura = request.getParameter("");
            String codCliente = request.getParameter("");
            nuevaFactura.setFechaFactura(fechaFactura);
            nuevaFactura.setTotalFactura(Double.parseDouble(totalFactura)); // cambiar idfactura por TotalFactura 
            nuevaFactura.setCodCliente(Integer.parseInt(codCliente)); // cambiar id factura por codCliente
            nuevaFacturaDAO.edit(nuevaFactura);
            acceso = listar;
             
       }     
        RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    
            
        
        
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
