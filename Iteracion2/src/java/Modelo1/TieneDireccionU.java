package Modelo1;
// Generated 13/04/2016 11:24:39 AM by Hibernate Tools 4.3.1



/**
 * TieneDireccionU generated by hbm2java
 */
public class TieneDireccionU  implements java.io.Serializable {


     private int usuario;
     private DireccionUsuario direccionUsuario;

    public TieneDireccionU() {
    }

    public TieneDireccionU(int usuario, DireccionUsuario direccionUsuario) {
       this.usuario = usuario;
       this.direccionUsuario = direccionUsuario;
    }
   
    public int getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }
    public DireccionUsuario getDireccionUsuario() {
        return this.direccionUsuario;
    }
    
    public void setDireccionUsuario(DireccionUsuario direccionUsuario) {
        this.direccionUsuario = direccionUsuario;
    }




}


