package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    // Definimos los datos de la base de datos sistema_torneos
    private static final String URL = "jdbc:mysql://localhost:3306/sistema_torneos";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "Nacileon.10";

    public static Connection conectar() {
        Connection conexion = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexión: " + e.getMessage());
        }
        return conexion;
    }
}