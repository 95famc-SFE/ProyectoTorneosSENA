package vista;

import controlador.UsuarioDAO;
import modelo.Usuario;

public class MenuPrincipal {
    public static void main(String[] args) {
        UsuarioDAO dao = new UsuarioDAO();

        // 1. PROBAMOS LA INSERCIÓN (CREATE)
        Usuario nuevo = new Usuario();
        nuevo.setNombre("Andrés");
        nuevo.setApellido("Sena");
        nuevo.setEmail("andres.sena@correo.com");
        nuevo.setPassword("clave789");
        nuevo.setRol("jugador");
        
        dao.registrar(nuevo);

        // 2. PROBAMOS LA ELIMINACIÓN (DELETE)
        // Vamos a eliminar el ID 1 (el que creamos al principio) para probar
        // dao.eliminar(1); 
        
        System.out.println("¡Pruebas de la guía completadas!");
    }
}
