/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Logica.Controladora;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hernán Misael
 */
@WebServlet(name = "SvAltaEmpleado", urlPatterns = {"/SvAltaEmpleado"})
public class SvAltaEmpleado extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
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
            out.println("<title>Servlet SvAltaEmpleado</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SvAltaEmpleado at " + request.getContextPath() + "</h1>");
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
       
        try {
            //traigo los datos del JSP
            int dni = Integer.parseInt(request.getParameter("dni"));
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String fecha = request.getParameter("fecha_nac");
            //convierto String a Date
            Date fecha_nac =  new SimpleDateFormat("dd/MM/yyyy").parse(fecha);
            
            String direccion = request.getParameter("direccion");
            String cargo = request.getParameter("cargo");
            String usuario = request.getParameter("usuario");
            String contra = request.getParameter("contra");
            
            //traigo la sesión y asigno los atributos para abrir en cualquier JSP
            /*request.getSession().setAttribute("nombre", nombre);
            request.getSession().setAttribute("apellido", apellido);
            request.getSession().setAttribute("pelo", profesion);
            request.getSession().setAttribute("titulo", titulo);
            request.getSession().setAttribute("java", edad);*/
            
            //conecto con la lógica
            Controladora control = new Controladora();
            control.crearEmpleado(dni, nombre, apellido, fecha_nac, direccion, usuario, contra, cargo);
            
            //armar la respuesta
            response.sendRedirect("index.jsp");
        } catch (ParseException ex) {
            Logger.getLogger(SvAltaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
