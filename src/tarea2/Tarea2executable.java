package tarea2;


import static tarea2.parte1.primeraParte.*;
import static tarea2.parte2.segundaParte.*;
import static tarea2.parte3.terceraParte.*;

public class Tarea2executable {
    public static void parte1() {
        System.out.println("-----");
        System.out.println("-- PARTE 1 - EJERCICIO 2 --");
        String ruta1 = "/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea2/parte1/texto1";
        String ruta2 = "/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea2/parte1/texto2";
        //CopiarContenido(ruta1, ruta2); // Copiar contenido en otro ficheiro
        System.out.println("-----");

        System.out.println("-----");
        System.out.println("-- PARTE 1 - EJERCICIO 3 --");
        String ruta3 = "/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea2/parte1/texto1";
        String ruta4 = "/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea2/parte1/texto2";
        EngadirContenido(ruta3, ruta4); // Añadir contenido en otro ficheiro
        System.out.println("-----");
    }
    public static void parte2(){
        System.out.println("-----");
        System.out.println("-- PARTE 2 - EJERCICIO 1 --");
        String ruta5 = "/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea2/parte2/foto.jpg";
        String ruta6 = "/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea2/parte2/foto2.jpg";
        long tiempoSinBuffer = CopiarContenido2(ruta5, ruta6); // Copiar contenido imagen en otra. Además con long guarda la duración del proceso ya que lo devuelve con un return
        System.out.println("Tiempo empleado sin buffer: " + tiempoSinBuffer + " ms");
        System.out.println("-----");


        System.out.println("-----");
        System.out.println("-- PARTE 2 - EJERCICIO 2 --");
        String ruta7 = "/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea2/parte2/foto.jpg";
        String ruta8 = "/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea2/parte2/foto2.jpg";
        //EngadirContenido2(ruta7, ruta8); // Añadir contenido imagen en otra (SOLO AUMENTARÁ EL PESO DE LA IMAGEN 2)
        System.out.println("-----");

        System.out.println("-----");
        System.out.println("-- PARTE 2 - EJERCICIO 3 --");
        String ruta9 = "/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea2/parte2/foto.jpg";
        String ruta10 = "/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea2/parte2/foto3.jpg";
        // Lo mismo que el ejercicio 1, pero envuelto en un búffer de memoria RAM para que sea más rápido ya que encapsula bytes hasta su limite y ahí enviar los datos al disco. ES MÁS RÁPIDO
        long tiempoConBuffer = copiarConBuffer(ruta9, ruta10); // Además con long guarda la duración del proceso ya que lo devuelve con un return
        System.out.println("Tiempo empleado con buffer: " + tiempoConBuffer + " ms");
        System.out.println("-----");


        System.out.println("-----");
        System.out.println("-- PARTE 2 - EJERCICIO 4 --");
        long diferencia = tiempoSinBuffer - tiempoConBuffer;
        System.out.println("La ventaja de tiempo al usar búffer es: " + diferencia + " ms." // // Tiempos de velocidad con/sin BufferedStream
        );
        System.out.println("-----");
    }
    public static void parte3(){
        System.out.println("-----");
        System.out.println("-- PARTE 3 - EJERCICIO 1 --");
        String ruta11 = "/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea2/parte3/texto3.txt";
        // Uso de Data(Input/Output)Stream para trabajar con datos primitivos de java (int, double, boolean, char, etc) traducidos a formato binario.
        DataIO(ruta11);
    }
}