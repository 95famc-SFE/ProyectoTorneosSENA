package modelo;

public class Usuario {
    // Estas variables deben llamarse igual que las columnas de la base de datos
    private int idUsuario;
    private String nombre;
    private String apellido;
    private String email;
    private String password;
    private String rol;

    // Constructor vacío (necesario para Java)
    public Usuario() {}

    // Getters y Setters (Para que el programa pueda leer y escribir los datos)
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
}