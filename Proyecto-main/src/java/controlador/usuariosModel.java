
package controlador;

class usuariosModel {
     private int id;
    private String nombre, apellidos, contrasena, usuario_generado;
    private double dinero; 

    public usuariosModel(int id, String nombre, String apellidos, String contrasena, String usuario_generado, double dinero) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.contrasena = contrasena;
        this.usuario_generado = usuario_generado;
        this.dinero = dinero;
    }

    public usuariosModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getUsuario_generado() {
        return usuario_generado;
    }

    public void setUsuario_generado(String usuario_generado) {
        this.usuario_generado = usuario_generado;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    
}
