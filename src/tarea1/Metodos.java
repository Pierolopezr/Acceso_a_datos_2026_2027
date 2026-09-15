package tarea1;

import java.io.File;
import java.io.IOException;

public class Metodos {
    public static String esDirectorio(String rutaAbsoluta) { // String porque devuelve una cadena de texto con el return
        File ObjetoElemento = new File(rutaAbsoluta);
        if (ObjetoElemento.exists() && ObjetoElemento.isDirectory()) {
            return "es directorio";
        } else {
            return "no es directorio";
        }
    }

    public static String esFicheiro(String rutaAbsoluta) {
        File ObjetoElemento = new File(rutaAbsoluta);
        if (ObjetoElemento.exists() && ObjetoElemento.isFile()) {
            return "es Ficheiro";
        } else {
            return "no es ficheiro";
        }
    }

    public static void crearDirectorio(String rutaAbsoluta) { // void porque no devuelve nada. solo ejecuta y nos comunica con un println
        File ObjetoCarpeta = new File(rutaAbsoluta);
        if (!ObjetoCarpeta.exists()) {
            boolean creado = ObjetoCarpeta.mkdir();
            if (creado) {
                System.out.println("Directorio creado en ruta: " + rutaAbsoluta);
            } else {
                System.out.println("No se pudo crear el directorio");
            }
        } else {
            System.out.println("El directorio ya existe");
        }
    }

    public static void crearFicheiro(String directorioName, String fileName) {
        // Crea un  ficheiro nunha ruta absoluta que EXISTA previamente, estos dous valores
        //deben pasarse ao metodo como valores String.
        //So debe crearse dito ficheiro en dita ruta cando non exista previamente.
        // Se hizo uso de "createNewFile" y de "try-catch"
        File CarpetaPadre = new File(directorioName);

        if (CarpetaPadre.isDirectory()) {
            File nuevoFicheiro = new File(CarpetaPadre, fileName);

            if (!nuevoFicheiro.exists()) {
                try {
                    boolean creado = nuevoFicheiro.createNewFile();
                    System.out.println("Ficheiro creado con éxito en " + directorioName);
                } catch (IOException e) {
                    System.out.println("Error al crear al ficheiro" + e.getMessage());
                }

            } else {
                System.out.println("El ficheiro ya existe");
            }
        } else {
            System.out.println("La ruta para crear el ficheiro no existe");
        }

    }

    public static void modoAcceso(String dirName, String fileName) {
        File carpetaPadre = new File(dirName);
        if (carpetaPadre.isDirectory()) {
            File fichero = new File(carpetaPadre, fileName);
            if (fichero.exists()) {
                if (fichero.canRead()) {
                    System.out.println("Se puede leer el ficheiro " + fileName);
                } else {
                    System.out.println("Non se puede leer el ficheiro");
                }

                if (fichero.canWrite()) {
                    System.out.println("Se puede escribir en el ficheiro " + fileName);
                } else {
                    System.out.println("Non se puede escribir en el ficheiro");
                }
            } else {
                System.out.println("EL ficheiro no existe");
            }
        } else {
            System.out.println("El directorio no existe");
        }
    }

    public static void caclulaLonxitude(String dirName, String fileName) {
        File carpetaPadre = new File(dirName);
        if (carpetaPadre.isDirectory()) {
            File fichero = new File(carpetaPadre, fileName);
            if (fichero.isFile()) {
                long creado = fichero.length();
                System.out.println("La lonxitude del archivo es: " + creado + " bytes");
            } else {
                System.out.println("Error al calcular la lonxitude");
            }
        } else {
            System.out.println("El directorio no existe");
        }
    }

    public static void mLectura(String dirName, String fileName) {
        File carpetaPadre = new File(dirName);
        if (carpetaPadre.isDirectory()) {
            File fichero = new File(carpetaPadre, fileName);
            if (fichero.exists()) {
                boolean creado = fichero.setReadOnly();
                System.out.println("Ahora solo se permite lectura en el archivo " + fileName);
            } else {
                System.out.println("Error al modificar el archivo");
            }
        } else {
            System.out.println("El directorio no existe");
        }
    }

    public static void mEscritura(String dirName, String fileName) {
        File carpetaPadre = new File(dirName);
        if (carpetaPadre.isDirectory()) {
            File fichero = new File(carpetaPadre, fileName);
            if (fichero.exists()) {
                boolean interruptor_de_escritura = true; // puedo habilitar si quiero o no escribir
                boolean creado = fichero.setWritable(interruptor_de_escritura); // habilitar la escritura con true, ya que setWritable necesita un argumento booleano.
                if (creado) { // si funciona el setwritable entonces....
                    if (interruptor_de_escritura) {
                        System.out.println("Ahora se permite escritura en el archivo " + fileName);
                    } else {
                        System.out.println("Ahora ya no puedes escribir");
                    }
                } else {
                    System.out.println("No funciona el argumento setWritable");
                }
            } else {
                System.out.println("Error al modificar el archivo");
            }

        } else {
            System.out.println("El directorio no existe");
        }
    }

    public static void borraFicheiro(String dirName, String fileName) {
        File carpetaPadre = new File(dirName);
        if (carpetaPadre.isDirectory()) {
            File fichero = new File(carpetaPadre, fileName);
            if (fichero.exists()) {
                boolean borrado = fichero.delete();
                if (borrado) {
                    System.out.println("Se ha eliminado correctamente el ficheiro " + fileName);
                } else {
                    System.out.println("No pudo eliminar el ficheiro " + fileName);
                }
            } else {
                System.out.println("El ficheiro no existe");
            }
        } else {
            System.out.println("El directorio no existe");
        }
    }

    public static void borraDirectorio(String dirName) {
        File carpeta = new File(dirName);
        if (carpeta.isDirectory()) {
            boolean carpetaBorrar = carpeta.delete();
            if (carpetaBorrar) {
                System.out.println("Se ha borrado correctamente el directorio: " + dirName);
            } else {
                System.out.println("No se ha podido borrar el directorio: " + dirName);
            }

        } else {
            System.out.println("ruta inexistente ou con descencencia.");
        }
    }

    public static void borradorRecursivo(File filName){
        if(filName.exists()){ // existe el archivo file¿?
            if(filName.isDirectory()){
                File[] elementos = filName.listFiles(); // Creo un array recorro las divisiones y subdivisiones del archivo dado
                if(elementos != null){ // verifico que la lista recorrida no sea nula
                    for(File elemento : elementos){ // recorre los elementos uno por uno
                            borradorRecursivo(elemento); // Recursividad, se va llamando uno a uno y aplicando el método
                    }
                }else{
                    System.out.println("El contenido es nulo");
                }
            }
            boolean borrador = filName.delete(); // borramos archivo por archivo según la recursividad hasta el directorio padre

            if(borrador){ // si funciona el borrador correctamente
                System.out.println("El directorio con sus subdivisiones han sido eliminados correctamente: " + filName.getAbsolutePath());
            }else{
                System.out.println("No se ha podido borrar el directorio con sus divisiones por permisos u otro error. ");
            }
        }else{
            System.out.println("El archivo no existe");
        }
    }
    public static void mContenido(String dirName) {
        File carpetaPadre = new File(dirName);
        if (carpetaPadre.isDirectory()) {
            String[] listaElementos = carpetaPadre.list();
            if (listaElementos != null && listaElementos.length > 0) {
                for (String elemento : listaElementos) {
                    System.out.println(elemento);
                }
            } else {
                System.out.println("El contenido del directorio es nulo o está vacío");
            }
        } else {
            System.out.println("No existe el directorio");
        }
    }

    public static void recur(File carpeta) { // recibe un objeto File por parámetro.


        if (carpeta == null || !carpeta.exists() || !carpeta.isDirectory()) {
            return; // Si no es una carpeta real, cortamos la ejecución y el metodo se detiene.
        }

        File[] elementos = carpeta.listFiles(); // con "listFIles()" obtenemos la lista de archivos y subcarpetas contenidas.

        if (elementos != null) {
            for (File elemento : elementos) {
                System.out.println(elemento.getAbsolutePath()); // Mostramos por pantalla la ruta completa del archivo o subcarpeta.

                // Recursividad
                if (elemento.isDirectory()) { // Preguntamos nuevamente
                    recur(elemento); //El metodo se llama a sí mismo para explorar la subcarpeta (recursividad).
                }
            }
        }
    }
}
