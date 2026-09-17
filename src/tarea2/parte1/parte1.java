package tarea2.parte1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class parte1 {
    public static void CopiarContenido(String Filename1, String Filename2){ // filename 1 = texto1.txt y filename2 es para texto2.txt
       try{
           File ficheiroOrigen = new File(Filename1); // Creo el ficheiro a copiar
           FileInputStream fis = new FileInputStream(ficheiroOrigen); // Permite leer los bytes del archivo

           File ficheiroDestino = new File(Filename2);  // Creo el ficheiro a pegar
           FileOutputStream fos = new FileOutputStream(ficheiroDestino); // Permite escribir bytes en un ficheiro y si no existe, lo crea.

           int byteleido; // byte temporal para recibir cada byte recibido en el paso del bucle

           while ((byteleido = fis.read()) != -1){ //Lee un byte, lo asigna a byteLeido y comprueba que no hayamos llegado al final del archivo (-1) que es el final de lectura de bytes del metodo read()
               fos.write(byteleido); // Escribo en el ficheiroDestino el mismo byte que acabamos de leer
           }

           fis.close();
           fos.close();

           System.out.println("Copia realizada con éxito ;D a: " + Filename2);

       }catch (IOException e){
           System.out.println("No se pudo copiar el archivo. Error "  + e.getMessage());
       }

    }
}