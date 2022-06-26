/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import SQL.MetodosSQL;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Date;

/**
 *
 * @author Usuario
 */
public class CatalogoServlet extends HttpServlet {

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
            MetodosSQL metodos = new MetodosSQL();
            
            
            int count = metodos.tamanoCatalogo();
            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletTest</title>");            
            out.println("</head>");
            out.println("<body>");
           
            out.println("<table cellpadding='10' cellspacing='10' border>");
            out.println("<tbody>");
             out.println("<form action='Compra'");
            out.println("<h1>Catàlogo</h1>");
            for(int i=1; i<=count; i++){
                out.println("<tr>"); 
                String base64 = metodos.imgCatalogo(String.valueOf(i));
                out.println("<td><img src='data:image/png;base64,"+base64+"' width='150' height='150'></td>"); //<img src='data:image/png;base64,"+metodos.imgCatalogo(String.valueOf(i))+"'>
                out.println("<th>"+metodos.nombreCatalogo(String.valueOf(i))+" <br><br> Fecha de subida: <br>"+metodos.fecha(String.valueOf(i)) +"</th>");
                out.println("<td> Precio: $"+metodos.precio(String.valueOf(i))+"</td>");
                out.println("<th> <input type='submit' value='Comprar' name='btnComprar"+i+"'> </th>");
                out.println("</tr>");
            }
            
            
            out.println("</tbody>");
            out.println("</form>");
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
