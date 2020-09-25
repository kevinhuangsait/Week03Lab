
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 831719
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String symbol = request.getParameter("submit");
        String value1 = request.getParameter("value1");
        request.setAttribute("value1", value1);
        String value2 = request.getParameter("value2");
        request.setAttribute("value2", value2);
        int x = Integer.parseInt(value1);
        int y = Integer.parseInt(value2);
        
        
        if(symbol.equals("+"))
        {
            request.setAttribute("message", (x+y));
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        else if(symbol.equals("-"))
        {
            request.setAttribute("message", (x-y));
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        else if(symbol.equals("*"))
        {
            request.setAttribute("message", (x*y));
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        else if(symbol.equals("/"))
        {
            request.setAttribute("message", (x/y));
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
    }
    
}
