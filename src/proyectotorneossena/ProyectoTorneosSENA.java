package proyectotorneossena;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ProyectoTorneosSENA {
    
    public static void main(String[] args) {
        //Datos de la base de datos MySQL
        String url = "jdbc:mysql://localhost:3306/sistema_torneos";
        String usuario = "root";
        String password = "Nacileon.10";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conectar = DriverManager.getConnection(url, usuario, password);
            
            // NUEVO CÓDIGO PARA INSERTAR
            String sql = "INSERT INTO USUARIO (nombre, apellido, email, password, rol) VALUES ('Felipe', 'Mayorga', '95.famc@gmail.com', '1234', 'administrador')";
            java.sql.Statement st = conectar.createStatement();
            st.executeUpdate(sql);
            
            System.out.println("Conexion exitosa y usuario guardado en la base de datos");
                    
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar" + e.getMessage());
            
        }
    }
}
