package com.pooespol;

public class Espacio {
    private int codigoUnico;
    private String tipoEspacio;
    private String nombre;
    private int capacidad;
    private Disponibilidad disponibilidad;
    private char rolPermitido;

    public Espacio(int codigoUnico, String tipoEspacio, String nombre, int capacidad, Disponibilidad disponibilidad, char rolPermitido) {
        this.codigoUnico = codigoUnico;
        this.tipoEspacio = tipoEspacio;
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.disponibilidad = disponibilidad;
        this.rolPermitido = rolPermitido;
    }

    public boolean estaDisponible() {
        return disponibilidad == Disponibilidad.DISPONIBLE;
    }
    public int getCodigoUnico() {
        return codigoUnico;
    }

    public void setCodigoUnico(int codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    public String getTipoEspacio() {
        return tipoEspacio;
    }

    public void setTipoEspacio(String tipoEspacio) {
        this.tipoEspacio = tipoEspacio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Disponibilidad getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Disponibilidad disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public char getRolPermitido() {
        return rolPermitido;
    }

    public void setRolPermitido(char rolPermitido) {
        this.rolPermitido = rolPermitido;
    }

    @Override
    public String toString() {
        return "Espacio{" +
                "codigoUnico=" + codigoUnico +
                ", tipoEspacio='" + tipoEspacio + '\'' +
                ", nombre='" + nombre + '\'' +
                ", capacidad=" + capacidad +
                ", disponibilidad=" + disponibilidad +
                ", rolPermitido=" + rolPermitido +
                '}';
    }
}