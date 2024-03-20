package org.example.simple_calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/calculator")
public class CalculatorServlet extends HelloServlet{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        super.doGet(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstOperandStr = req.getParameter("first-operand");
        String secondOperandStr = req.getParameter("second-operator");
        String operatorStr = req.getParameter("operator");

        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1>Result:</h1>");

        try {
            if (firstOperandStr != null && secondOperandStr != null && operatorStr != null && !firstOperandStr.isEmpty() && !secondOperandStr.isEmpty() && !operatorStr.isEmpty()) {
                float firstOperator = Float.parseFloat(firstOperandStr);
                float secondOperator = Float.parseFloat(secondOperandStr);
                char operator = operatorStr.charAt(0);

                float result = Calculator.calculator(firstOperator, secondOperator, operator);
                writer.println("<p>" + firstOperator + " " + operator + " " + secondOperator + " = " + result + "</p>");
            } else {
                writer.println("<p>Missing or invalid parameters.</p>");
            }
        } catch (Exception e) {
            writer.println("<p>Error: " + e.getMessage() + "</p>");
        }
        writer.println("</html>");
    }
}
