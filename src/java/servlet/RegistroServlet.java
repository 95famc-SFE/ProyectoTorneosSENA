package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegistroServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // 1. Capturamos los datos con validación básica para evitar valores vacíos
        String nombre = request.getParameter("nombre_equipo");
        String categoria = request.getParameter("categoria");
        String capitan = request.getParameter("capitan");
        String idTorneoStr = request.getParameter("idTorneo");

        // --- CONFIGURACIÓN DE CONEXIÓN ---
        String url = "jdbc:mysql://localhost:3306/db_torneo_futbol"; 
        String user = "root"; 
        String pass = "Nacileon.10"; 

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            
            // 2. Query para insertar en todas las columnas de tu tabla
        String query = "INSERT INTO equipos (nombre_equipo, categoria, capitan, fk_torneo) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            
            // 3. Mapeo seguro de parámetros
            ps.setString(1, (nombre != null) ? nombre : "Sin Nombre");
            ps.setString(2, (categoria != null) ? categoria : "Sin Categoría");
            ps.setString(3, (capitan != null) ? capitan : "Sin Capitán");
            
            // Convertimos el ID del torneo asegurando que no esté vacío
            int idTorneo = (idTorneoStr != null && !idTorneoStr.isEmpty()) ? Integer.parseInt(idTorneoStr) : 1;
            ps.setInt(4, idTorneo); 
            
            // 4. Ejecución y confirmación en consola de NetBeans
            int filasAfectadas = ps.executeUpdate();
            
            if (filasAfectadas > 0) {
                System.out.println(">>> ÉXITO: Equipo '" + nombre + "' guardado físicamente en MySQL.");
            }
            
            con.close();
            
        } catch (Exception e) {
            System.out.println("¡ATENCIÓN! Error al guardar: " + e.getMessage());
            e.printStackTrace();
        }

        // 5. Pasamos datos al JSP y también incluimos el capitán para mostrarlo
        request.setAttribute("equipoRegistrado", nombre);
        request.setAttribute("categoriaSeleccionada", categoria);
        request.setAttribute("capitanEquipo", capitan); // Nuevo atributo para el JSP
        
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
}