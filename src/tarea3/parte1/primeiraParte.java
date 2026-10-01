package tarea3.parte1;

import java.io.Serializable; // Interfaz Serializable para permitir la serialización

public class primeiraParte implements Serializable {
    private static final long serialVersionUID =1L; // Identificador único de versión de la clase para validar la compatibilidad al deserializar

    // Atributos privados
    private String nome;
    private int num1;
    private double num2;

    // Constructor que inicializa los 3 atributos al instanciar el objeto
    public primeiraParte(String nome, int num1, double num2){
        // Asigno la variable local (nome, num1, num2) al atributo de la clase
        this.nome = nome;
        this.num1 = num1;
        this.num2 = num2;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public String getNome() {
        return nome;
    } // Devuelve la cadena guardada en nome.

    public void setNome(String nome) {
        this.nome = nome;
    }
}

