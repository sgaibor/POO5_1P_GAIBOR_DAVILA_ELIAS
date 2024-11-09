package com.pooespol;
import java.util.ArrayList;
public class Profesor extends Usuario {

    private String facultad;
    private String carrera;
    private ArrayList<String> materias;

    public Profesor(int codigoUnico, String cedula,String nombres, String apellidos, String usuario, String contraseña, char rol,String facultad, String carrera, ArrayList<String> materias){
        super(codigoUnico,cedula,nombres,apellidos,usuario,contraseña,rol);
        this.facultad=facultad;
        this.carrera=carrera;
        this.materias=materias;
    }

    public String getFacultad(){
        return facultad;
    }

    public void setFacultad(String facultad){
        this.facultad=facultad;
    }

    public String getCarrera(){
        return carrera;
    }

    public void setCarrera(String carrera){
        this.carrera=carrera;
    }

    public ArrayList<String> getMaterias(){
        return materias;
    }

    public void setMaterias(ArrayList<String> materias){
        this.materias=materias;
    }

    

    
}
