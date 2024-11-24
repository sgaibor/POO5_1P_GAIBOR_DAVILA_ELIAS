package com.pooespol;

import java.util.Date;

public class Administrador extends Usuario {
    private String cargo;

    public Administrador(int codigoUnico, String cedula, String nombres, String apellidos, String usuario, 
                         String contraseña, char rol, String cargo) {
        super(codigoUnico, cedula, nombres, apellidos, usuario, contraseña, rol);
        this.cargo = cargo;
    }
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo=cargo;
    }

    public void gestionarReserva(Reserva r) {
        r.setEstado(Estado.APROBADO);
        System.out.println("Reserva " + r.getCodigoReserva() + " aprobada.");
    }

    public void rechazar(Reserva r, String motivo) {
        r.setEstado(Estado.RECHAZADO);
        System.out.println("Reserva " + r.getCodigoReserva() + " rechazada: " + motivo);
    }

    @Override
    public void gestionarReserva(Date fecha) {
        System.out.println("El administrador " + nombres + " está gestionando reservas.");
    }

    @Override
    public void enviarCorreo(String motivo) {
        System.out.println("Enviando correo al administrador " + nombres + " por: " + motivo);
    }
}

