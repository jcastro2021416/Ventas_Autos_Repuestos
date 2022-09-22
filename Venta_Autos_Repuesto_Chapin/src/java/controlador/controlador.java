package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Vehiculos;
import modelo.VehiculosDAO;

public class controlador extends HttpServlet {

    String listar = "view/listar.jsp";
    String add = "view/add.jsp";
    Vehiculos nuevoVehiculo = new Vehiculos();
    VehiculosDAO nuevoVehiculoDAO = new VehiculosDAO();
   
    
   
     
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
        
        String acceso = "";
        String action = request.getParameter("accion");
        if(action.equalsIgnoreCase("listar")){
            acceso = listar;
        }    else if (action.equalsIgnoreCase("add")){
            acceso = add;
        }
        
                else if(action.equalsIgnoreCase("Agregar")){
                    
                    String matricula = request.getParameter("txtmatricula");
                    String marca = request.getParameter("txtmarca");
                    String modelo = request.getParameter("txtmodelo");
                    String color = request.getParameter("txtcolor");
                    nuevoVehiculo.setMatricula(matricula);
                    nuevoVehiculo.setMarca(marca);
                    nuevoVehiculo.setModelo(modelo);
                    nuevoVehiculo.setColor(color);
                                
                    nuevoVehiculoDAO.add(nuevoVehiculo);
                    acceso = listar;
                }
         RequestDispatcher vista = request.getRequestDispatcher(acceso);
        vista.forward(request, response);
        
        
        
    } 
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
