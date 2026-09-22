package tarea2.parte3;

import java.io.*;

public class terceraParte {
    public static void DataIO(String Filename1){

        String cadenaTexto = "o tempo está xélido";

        try{

            File Ficheiro = new File(Filename1);


            // Escritura
            FileOutputStream fos = new FileOutputStream(Ficheiro); // Creo el flujo de escritura en el disco
            BufferedOutputStream bos = new BufferedOutputStream(fos); // Lo envuelvo en un búffer de memoria RAM para mejorar la velocidad
            DataOutputStream dos = new DataOutputStream(bos); // Para escribir datos primitivos y cadenas UTF en formato binario

            for(int i=1; i<4; i++){


                System.out.println("escribindo a cadea: " + cadenaTexto);
                dos.writeUTF(cadenaTexto); // Escribo la cadena en el archivo con formato UTF-8 (2 bytes de longitud de string + 1 byte por cada caracter de string que le pasamos como parámetro)
                System.out.println("Tamaño o ficheiro: " + dos.size()); // Devuelve el tamaño en bytes del ficheiro
            }

            System.out.println("Tamaño final o ficheiro: " + dos.size());

            dos.close();


            // Lectura
            FileInputStream fis = new FileInputStream(Filename1); // creo el flujo de lectura en el disco
            BufferedInputStream bis = new BufferedInputStream(fis); // Lo envuelvo en un búffer de memoria RAM para mejorar la velocidad
            DataInputStream dis = new DataInputStream(bis); // Para leer datos primitivos y cadenas UTF en formato binario

            while (dis.available()>0){ // available -> Devuelve un valor 0, si ya se leyeron todos bytes del ficheiro
                System.out.println("Quedan: " + dis.available() + " bytes por leer."); // Para indicar cuátos bytes quedan en el flujo
                String cadenaAleer = dis.readUTF(); // Leo la cadena de texto en formato UTF-8
                System.out.println("cadea: " + cadenaAleer);

            }
            System.out.println("Xa non queda nada por leer");

            dis.close();

        }catch (IOException e){
            System.out.println("Error con las operaciones DATA IO" + e.getMessage());
        }

    }

}
