package controlador;

import java.sql.*;
import modelo.Usuario;

public class UsuarioDAO {
    
    // MÉTODO PARA INSERTAR (CREATE)
    public void registrar(Usuario user) {
        String sql = "INSERT INTO USUARIO (nombre, apellido, email, password, rol) VALUES (?, ?, ?, ?, ?)";
        try (Connection con = ConexionBD.conectar(); 
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setString(1, user.getNombre());
            ps.setString(2, user.getApellido());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getPassword());
            ps.setString(5, user.getRol());
            ps.executeUpdate();
            System.out.println("Usuario registrado exitosamente.");
            
        } catch (SQLException e) {
            System.out.println("Error al registrar: " + e.getMessage());
        }
    }

    // MÉTODO PARA ELIMINAR (DELETE)
    public void eliminar(int id) {
        String sql = "DELETE FROM USUARIO WHERE id_usuario = ?";
        try (Connection con = ConexionBD.conectar(); 
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Usuario eliminado.");
        } catch (SQLException e) {
            System.out.println("Error al eliminar: " + e.getMessage());
        }
    }
}