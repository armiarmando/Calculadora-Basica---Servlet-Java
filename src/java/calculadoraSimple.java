/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author josea
 */
public class calculadoraSimple extends HttpServlet {
PrintWriter out;
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
        float num1, num2, resultado = 0;
        try{
            num1 = Float.parseFloat(request.getParameter("operando1"));
            num2 = Float.parseFloat(request.getParameter("operando2"));
        }catch(NumberFormatException e){
            num1 = 0;
            num2 = 0;
        }
        
        String suma = request.getParameter("suma");
        String resta = request.getParameter("resta");
        String multiplicacion = request.getParameter("multiplicacion");
        String division = request.getParameter("division");
        
        response.setContentType("text/html;charset-utf8");
        out =response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta charset-'utf-8'>");
        out.println("<title>Calculadora Simple</title>");
        out.println("<body>");
        if(suma != null){
            resultado = num1 +num2;
        }
        if(resta != null){
            resultado = num1 -num2;
        }
        if(multiplicacion != null){
            resultado = num1 *num2;
        }
        if(division != null){
            resultado = num1 /num2;
        }
        
        generaRespuesta(resultado,num1,num2);
        out.println("</body>");
        out.println("</html>");
                
        }

    
    public void generaRespuesta(float resultado,float num1, float num2){
         out.println("<form action='calculadoraSimple' method='POST\'>");
         out.println(" <label> Numero 1: </label> <input type='text' name='operando1' value="+num1+" size='14'>");  
         out.println("<br><br>"); 
         out.println(" <label> Numero 2: </label> <input type='text' name='operando2' value="+num2+ " size='14'>");  
         out.println("<br><br>");
         out.println("<input type='submit' name='suma' value='+' >&nbsp;&nbsp;&nbsp;");   
         out.println("<input type='submit' name='resta' value='-' >&nbsp;&nbsp;&nbsp;");   
         out.println("<input type='submit' name='multiplicacion' value='*' >&nbsp;&nbsp;&nbsp;");  
         out.println("<input type='submit' name='division' value='/' >&nbsp;&nbsp;&nbsp;");   
         out.println("<br><br>");
         out.println(" <label> Resultado: </label><input type='text' name='resultado' value="+resultado+" size='14' readonly>"); 
    
        out.println("</form>");
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
