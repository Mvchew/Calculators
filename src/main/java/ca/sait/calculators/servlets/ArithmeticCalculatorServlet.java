
package ca.sait.calculators.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Melvin Chew
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

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
        
        request.setAttribute("result", "---");

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
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
    
    String num1 = request.getParameter("num1");
    String num2 = request.getParameter("num2");

    int result;

    try {
        if (request.getParameter("operator").equals("add")) {
    
            result = Integer.parseInt(num1) + Integer.parseInt(num2);

            request.setAttribute("result", result);

        } else if (request.getParameter("operator").equals("sub")) {
            
            result = Integer.parseInt(num1) - Integer.parseInt(num2);

            request.setAttribute("result", result);

        } else if (request.getParameter("operator").equals("mult")) {
            
            result = Integer.parseInt(num1) * Integer.parseInt(num2);

            request.setAttribute("result", result);

        } else if (request.getParameter("operator").equals("div")) {
            
            result = Integer.parseInt(num1) / Integer.parseInt(num2);

            request.setAttribute("result", result);
        } 
    
} catch (Exception ex) {
            request.setAttribute("result", "Invalid");
}




        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }

 

}
