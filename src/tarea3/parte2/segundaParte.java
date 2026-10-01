package tarea3.parte2;

import java.io.Serializable;

// productoTransient
public class segundaParte implements Serializable{
    private static final long serialVersionUID =2L;

    private String nombre;
    private transient int nume1; // IGNORA este atributo, no lo guarda en los bytes del archivo (java asigna por defecto: int=null, string=null, boolean=false)
    private double nume2;

    public segundaParte(String nombre, int nume1, double nume2){
        this.nombre = nombre;
        this.nume1 = nume1;
        this.nume2 = nume2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNume1() {
        return nume1;
    }

    public void setNume1(int nume1) {
        this.nume1 = nume1;
    }

    public double getNume2() {
        return nume2;
    }

    public void setNume2(double nume2) {
        this.nume2 = nume2;
    }
}
