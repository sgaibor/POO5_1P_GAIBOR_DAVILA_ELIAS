package com.pooespol;
import java.util.Date;
public class Reserva {
    private int codigoReserva;
    private Usuario usuario;
    private Date fecha;
    private Espacio espacio;
    private Estado estado;
    private String motivo;
    private int numeroDeReservas;
    public Reserva(int codigoReserva, Usuario usuario, Date fecha, Espacio espacio, Estado estado, String motivo) {
        this.codigoReserva = codigoReserva;
        this.usuario = usuario;
        this.fecha = fecha;
        this.espacio = espacio;
        this.estado = estado;
        this.motivo = motivo;
        this.numeroDeReservas = 1;
}
public void aprobar() {
    estado = Estado.APROBADO;
    System.out.println("Reserva aprobada: " + codigoReserva);
}
public void rechazar(String motivo) {
    estado = Estado.RECHAZADO;
    this.motivo = motivo;
    System.out.println("Reserva rechazada: " + codigoReserva + " - " + motivo);
}

public int getCodigoReserva() {
    return codigoReserva;
}

public void setCodigoReserva(int codigoReserva) {
    this.codigoReserva = codigoReserva;
}

public Usuario getUsuario() {
    return usuario;
}

public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
}

public Date getFecha() {
    return fecha;
}

public void setFecha(Date fecha) {
    this.fecha = fecha;
}

public Espacio getEspacio() {
    return espacio;
}

public void setEspacio(Espacio espacio) {
    this.espacio = espacio;
}

public Estado getEstado() {
    return estado;
}

public void setEstado(Estado estado) {
    this.estado = estado;
}

public String getMotivo() {
    return motivo;
}

public void setMotivo(String motivo) {
    this.motivo = motivo;
}

public int getNumeroDeReservas() {
    return numeroDeReservas;
}

public void setNumeroDeReservas(int numeroDeReservas) {
    this.numeroDeReservas = numeroDeReservas;
}

@Override
public String toString() {
    return "Reserva{" +
            "codigoReserva=" + codigoReserva +
            ", usuario=" + usuario.getNombres() + " " + usuario.getApellidos() +
            ", fecha=" + fecha +
            ", espacio=" + espacio.getNombre() +
            ", estado=" + estado +
            ", motivo='" + motivo + '\'' +
            ", numeroDeReservas=" + numeroDeReservas +
            '}';
}
}