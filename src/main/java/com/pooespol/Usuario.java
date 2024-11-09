package com.pooespol;
import java.util.Date;
import javax.swing.JSpinner.DateEditor;

public class Usuario {
    protected int codigoUnico;
    protected String cedula;
    protected String nombres;
    protected String apellidos;
    protected String usuario;
    protected String contraseña;
    protected char rol;
    public Usuario(int codigoUnico, String cedula,String nombres, String apellidos, String usuario, String contraseña, char rol){
        this.codigoUnico=codigoUnico;
        this.cedula=cedula;
        this.nombres=nombres;
        this.apellidos=apellidos;
        this.usuario=usuario;
        this.contraseña=contraseña;
        this.rol=rol;
    }
    public String consultarReserva(Date fecha){
        return "Reserva consultada para la fecha"+fecha.toString();

    }
    public void gestionarReserva(Date fecha){
        System.out.println("Reserva gestionada para la fecha:"+ fecha.toString());
    }
    public void enviarCorreo(String motivo){
        System.out.println("Correo enviado con el motivo:"+ motivo);
    }
    public int getCodigoUnico(){
        return codigoUnico;
    }
    public void setCodigoUnico(int codigoUnico){
        this.codigoUnico=codigoUnico;
    }
    public String getCedula(){
        return cedula;
    }
    public void setCedula(String cedula){
        this.cedula=cedula;
    }
    public String getNombres(){
        return nombres;
    }
    public void setNombres(String nombres){
        this.nombres=nombres;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuario){
        this.usuario=usuario;
    }
    public String getContraseña(){
        return contraseña;
    }
    public void setContraseña(String contraseña){
        this.contraseña=contraseña;
    }
    public char getRol(){
        return rol;
    }
    public void setRol(char rol){
        this.rol=rol;
    }
}

