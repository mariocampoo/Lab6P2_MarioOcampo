
import java.util.Date;

public class Usuario {
    private String usuario;
    private String contraseña;
    private String correo;
    private String residencia;
    private String nacimiento;
    

    public Usuario() {
    }

    public Usuario(String usuario, String contraseña, String correo, String residencia, String nacimiento) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.correo = correo;
        this.residencia = residencia;
        this.nacimiento = nacimiento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }



    @Override
    public String toString() {
        return "Usuario" + "\n"
                + " Usuario = " + usuario + "\n"
                + " Contrase\u00f1 a = " + contraseña + "\n"
                + " Correo = " + correo + "\n"
                + " Residencia = " + residencia + "\n"
                + " Nacimiento = " + nacimiento;
    }
    
    
    
    
}
