package tarea2.parte2;

import java.io.*;

public class segundaParte {
    public static long CopiarContenido2(String Filename1, String Filename2){ // filename 1 = texto1.txt y filename2 es para texto2.txt
        long tiempoInicio = System.currentTimeMillis(); // Guardo el tiempo exacto inicial del sistema en milisegundos.
        try{
            File ficheiroOrigen = new File(Filename1); // Creo el objeto file asociado a la imagen de origen
            FileInputStream fis = new FileInputStream(ficheiroOrigen); // Permite leer los bytes del archivo

            File ficheiroDestino = new File(Filename2);  // Creo el objeto file asociado a la imagen de destino
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
        long tiempoFinal = System.currentTimeMillis();
        return (tiempoFinal - tiempoInicio);
    }

    public static void EngadirContenido2(String Filename1, String Filename2){
        try{
            File ficheiroOrigen = new File(Filename1); // Creo el objeto file asociado al archivo a copiar
            FileInputStream fis = new FileInputStream(ficheiroOrigen); // Permite leer los bytes del archivo

            File ficheiroDestino = new File(Filename2);  // Creo el ficheiro a pegar
            FileOutputStream fos = new FileOutputStream(ficheiroDestino, true); //  Al añadir append con true decido si quiero respetar el contenido y añado a partir del final de este
                                                                                        // si fuera false, borrra todo y sobreescribe
            int byteleido; // byte temporal para recibir cada byte recibido en el paso del bucle

            while ((byteleido = fis.read()) != -1){ //Lee un byte, lo asigna a byteLeido y comprueba que no hayamos llegado al final del archivo (-1) que es el final de lectura de bytes del metodo read()
                fos.write(byteleido); // Escribo en el ficheiroDestino el mismo byte que acabamos de leer
            }

            fis.close();
            fos.close();

            System.out.println("El añadido ha sido realizado con éxito ;D a: " + Filename2);

        }catch (IOException e){
            System.out.println("Error " + e.getMessage());
        }
    }
    public static long copiarConBuffer(String Filename1, String Filename2){
        long tiempoInicio = System.currentTimeMillis();
        try{
            File ficheiroOrigen = new File(Filename1); // Creo el objeto file asociado a la imagen de origen
            File ficheiroDestino = new File(Filename2); // Creo el objeto file asociado a la imagen de destino

            FileInputStream fis = new FileInputStream(ficheiroOrigen); // lee los bytes de la imagen
            BufferedInputStream bis = new BufferedInputStream(fis); // envuelvo los bytes en un buffer de memoria RAM de 8 Kb

            FileOutputStream fos = new FileOutputStream(ficheiroDestino); // permite escribir bytes en un ficheiro, si no existe, lo crea
            BufferedOutputStream bos = new BufferedOutputStream(fos); // envuelvo los byes a escribir (flujo de escritura) en buffer de memoria RAM

            int byteleido;

            while ((byteleido = bis.read()) != -1){  //Lee un byte, lo asigna a byteLeido y comprueba que no hayamos llegado al final del archivo (-1) que es el final de lectura de bytes del metodo read()
                bos.write(byteleido); // Escribo dentro del buffer de salida
            }

            bis.close();
            bos.close();

            System.out.println("El añadido con envoltura de buffer de memoria RAM ha sido un éxito. " + Filename2  );

        }catch (IOException e){
            System.out.println("Error al envolver con buffer " + e.getMessage());
        }
        long tiempoFinal = System.currentTimeMillis();
        return (tiempoFinal- tiempoInicio);

    }
}
