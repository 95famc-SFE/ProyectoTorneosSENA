package servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegistroServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // 1. Capturamos los datos que vienen del formulario index.html
        String nombre = request.getParameter("nombreEquipo");
        String categoria = request.getParameter("categoria");

        // 2. Guardamos estos datos en el 'request' para que el JSP pueda verlos
        request.setAttribute("equipoRegistrado", nombre);
        request.setAttribute("categoriaSeleccionada", categoria);

        // 3. Redirigimos el flujo hacia la página JSP de resultados
        // Esto cumple con el requisito de usar elementos de JSP de la guía
        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Servlet para registro de equipos de fútbol";
    }
}
