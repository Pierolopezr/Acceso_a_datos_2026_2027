package tarea3;
import tarea3.parte1.primeiraParte;
import tarea3.parte2.segundaParte;
import static tarea3.parte3.terceraParte.generarXML;

import java.io.*;




public class Tarea3executable {

    public static void parte1(){
        primeiraParte Objeto = new primeiraParte("Juan", 2, 5.3);
        File ficheiro = new File("/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea3/parte1/serial"); // archivo "serial"


        // SERIALIZACIÓN
        try (

                FileOutputStream archivo = new FileOutputStream(ficheiro); // // Abrimos la conexión básica de escritura de bytes en 'serial'
                ObjectOutputStream salida = new ObjectOutputStream(archivo);) // Envolvemos el flujo para convertir objetos Java a bytes
        { // Uso try-with-resources entre () para que Java cierre automáticamente los flujos

            salida.writeObject(Objeto); // Guardamos el objeto completo de un solo golpe dentro del archivo "serial"
            System.out.println("Objeto serializado correctamente");

        }catch (IOException e){
            System.out.println(" Error salida " + e.getMessage());
        }

        // DESERIALIZACIÓN
        try (
                FileInputStream archivo = new FileInputStream(ficheiro); // Abrimos la conexión básica de lectura de bytes desde 'serial'
                ObjectInputStream entrada = new ObjectInputStream(archivo);// Envolvemos el flujo para reconstruir objetos desde bytes
        ){
            primeiraParte objLeido= (primeiraParte) entrada.readObject(); // Leemos y convertimos los bytes al tipo de objeto original
            System.out.println("Objeto deserializado correctamente " + objLeido.getNome());
        }catch (IOException  | ClassNotFoundException e){
            System.out.println("Error entrada: " + e.getMessage());
        }
    }

    public static void parte2(){
        segundaParte Trasient = new segundaParte("Luis", 1, 9.1);
        File ficheiro2 = new File("/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea3/parte2/serial2");
        System.out.println("num1 antes de aplicar Trasient : " + Trasient.getNume1());


        // SERIALIZACIÓN
        try(
                FileOutputStream archivo = new FileOutputStream(ficheiro2);
                ObjectOutputStream salida = new ObjectOutputStream(archivo);
                )
        {
            salida.writeObject(Trasient); // Ignora num1 por ser "trasient"
            System.out.println("Objeto serializado correctamente");
        }catch (IOException e){
            System.out.println("Error salida " + e.getMessage());
        }
        // DESERIALIZACIÓN
        try(
                FileInputStream archivo = new FileInputStream(ficheiro2);
                ObjectInputStream entrada = new ObjectInputStream(archivo);
                )
        {
            segundaParte objLeido = (segundaParte) entrada.readObject();
            System.out.println("Objeto deserializado correctamente " + objLeido);
            System.out.println("\\n--- VALORES RECUPERADOS DESDE EL ARCHIVO ---"); // Cabecera de consola.
            System.out.println("Nome recuperado: " + objLeido.getNombre()); // Muestra "Juan" (se guardó correctamente)
            System.out.println("num2 recuperado: " + objLeido.getNume2()); // Muestra 5.3 (se guardó correctamente).
            System.out.println("num1 recuperado (atributo transient): " + objLeido.getNume1()); // ¡Muestra 0 porque NO se guardó en el archivo!

        }catch (IOException | ClassNotFoundException e){
            System.out.println("Error entrada: " + e.getMessage());
        }
    }

    public static void parte3(){
        String rutaFinal= "/home/accesodatos/IdeaProjects/AD_2026_2027/src/tarea3/parte3/autores.xml"; // Ruta donde se guardará autores.xml [passage 97].
        generarXML(rutaFinal); // Crear un archivo xml a partir de la api StAX (Streaming API for XML (API de Flujo para XML) )
                               // ya que puedo crear o leer archivos XML paso a paso mediante flujos eficientes.)
    }
}

