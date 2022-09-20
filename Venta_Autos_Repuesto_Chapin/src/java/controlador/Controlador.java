/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
public class Controlador extends HttpServlet {

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
         String menu = request.getParameter("menu");
         String accion = request.getParameter("accion");
         if(menu.equals("Principal")){
             request.getRequestDispatcher("Principal.jsp").forward(request, response);
         }else if(menu.equals("Empleado")){
             switch(accion){
                 case "Listar":
                 case "Agregar":
                     String DPI = request.getParameter("txtDPIEmpleado");
                     String nombres = request.getParameter("txtNombresEmpleado");
                     String telefono = request.getParameter("txtTelefonoEmpleado");
                     String est = request.getParameter("txtEstado");
                     String user = request.getParameter("txtUsuario");
                     request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                     break;
                     
                 case "Editar":
                     break;
                 case "Atualizar":
                     break;
                 case "Eliminar":
                     break;
                     
         } 
             request.getRequestDispatcher("Empleado.jsp").forward(request, response);
         }else if(menu.equals("Producto")){
             request.getRequestDispatcher("Producto.jsp").forward(request, response);
             
         }else if(menu.equals("Clientes")){
             request.getRequestDispatcher("Clientes.jsp").forward(request, response);
         }else if(menu.equals("RegistraVenta")){
             request.getRequestDispatcher("RegistrarVenta").forward(request, response);
         }else if(menu.equals("Home")){
             request.getRequestDispatcher("Principal.jsp").forward(request, response);
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
