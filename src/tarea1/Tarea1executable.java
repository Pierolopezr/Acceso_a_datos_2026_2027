package tarea1;

import java.io.File;

import static tarea1.Metodos.*;

public class Tarea1executable {
    public static void parte2(){
        System.out.println("--EJERCICIO Prueba 1--");
        String rutaPrueba1 = "/home/accesodatos/IdeaProjects/AD_2026_2027/src";
        System.out.println("Resultado: " + esDirectorio(rutaPrueba1)); // es directorio ¿?
        System.out.println("-----");
        System.out.println("--EJERCICIO Prueba 2--");
        String rutaPrueba2 = "/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea1/";
        System.out.println("Resultado: " + esFicheiro(rutaPrueba2)); // es ficheiro ¿?
        System.out.println("-----");
        System.out.println("--EJERCICIO Prueba 3--");
        //String rutaPrueba3 = "/home/accesodatos/IdeaProjects/AD_2026/src/tarea1/pruebaDirectorio/pruebaBorrarDirectorio";
        //borraDirectorio(rutaPrueba3); // Borrar directorio (si tiene contenido suelta false y no se borra)
        System.out.println("-----");
        System.out.println("--EJERCICIO Prueba 4--");
        String rutaPrueba4 = "/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea1/";
        mContenido(rutaPrueba4); // Listado de archivos dentro de un directorio
        System.out.println("-----");


        System.out.println("--EJERCICIO 1--");
        String ruta1 = "/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea1/pruebas/arquivosdir/";
        crearDirectorio(ruta1); // crear directorio
        System.out.println("-----");

        System.out.println("--EJERCICIO 2--");
        String ruta2 = "/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea1/pruebas/arquivosdir";
        String archivoNuevo = "Products1.txt";
        crearFicheiro(ruta2, archivoNuevo); // crear ficheiro  en el directorio creado
        System.out.println("-----");

        System.out.println("--EJERCICIO 3--");
        String ruta3 = "/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea1/pruebas/arquivosdir/subdir";
        crearDirectorio(ruta3); // crear directorio subdir dentro de arquivosdir
        String ruta4 = "/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea1/pruebas/arquivosdir/subdir/";
        String archivoNuevo2 = "Products2.txt";
        crearFicheiro(ruta4, archivoNuevo2); // crear ficheiro dentro de un directorio
        System.out.println("-----");

        System.out.println("-----");
        System.out.println("--EJERCICIO 4--");
        String ruta5 = "/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea1/pruebas/arquivosdir";
        mContenido(ruta5); // Listado de archivos dentro de un directorio
        System.out.println("-----");

        System.out.println("--EJERCICIO 5--");
        String ruta6 = "/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea1/pruebas/arquivosdir";
        String archivoExistente = "Products1.txt";
        modoAcceso(ruta6, archivoExistente); // Se puede escribir o leer el archivo ¿?
        caclulaLonxitude(ruta6, archivoExistente); // Calcular la longitud en bytes del archivo
        System.out.println("-----");

        System.out.println("--EJERCICIO 6--");
        String ruta7 = "/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea1/pruebas/arquivosdir";
        String archivoExistente3 = "Products1.txt";
        mLectura(ruta7, archivoExistente3); // Modificar el archivo a solo lectura
        System.out.println("-----");

        System.out.println("--EJERCICIO 7--");
        String ruta8 = "/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea1/pruebas/arquivosdir";
        String archivoExistente4 = "Products1.txt";
        mEscritura(ruta8, archivoExistente4); // Habilitar escritura
        System.out.println("-----");

        System.out.println("--EJERCICIO 8--");
        String ruta9 = "/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea1/pruebas/arquivosdir";
        String archivoExistente5 = "Products1.txt";
        //borraFicheiro(ruta9, archivoExistente5); // Borrar fichero
        System.out.println("-----");

        System.out.println("--EJERCICIO 9--");
        File ruta10 = new File("/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea1/pruebas/arquivosdir/subdir");
        //borradorRecursivo(ruta10); // Borrar todo desde directorio padre
        System.out.println("-----");


        System.out.println("--EJERCICIO 10--");
        File ruta11 = new File("/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea1/pruebas/arquivosdir");
        recur(ruta11); // recursividad
        System.out.println("-----");


    }
}
