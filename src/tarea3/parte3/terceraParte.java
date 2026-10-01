package tarea3.parte3;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileWriter;
import java.io.IOException;

public class terceraParte {
    public static void generarXML(String fileName){
        try{
            XMLOutputFactory fabricaXml = XMLOutputFactory.newInstance(); // Creamos la fábrica invocando al metodo estático newInstance()
            FileWriter conectorArchivo = new FileWriter(fileName); // Abrimos el conector de archivo de texto plano en el disco
            XMLStreamWriter escritorXml = fabricaXml.createXMLStreamWriter(conectorArchivo); //La fábrica nos entrega el escritor XMLStreamWriter

            escritorXml.writeStartDocument("1.0");
            escritorXml.writeStartElement("autores");
            escritorXml.writeStartElement("autor");
            escritorXml.writeAttribute("codigo", "a1");
            escritorXml.writeStartElement("nome");
            escritorXml.writeCharacters("Alexandre Dumas");
            escritorXml.writeEndElement();
            escritorXml.writeStartElement("titulo");
            escritorXml.writeCharacters("El conde de montecristo");
            escritorXml.writeEndElement();
            escritorXml.writeStartElement("titulo");
            escritorXml.writeCharacters("Los miserables");
            escritorXml.writeEndElement();
            escritorXml.writeEndElement();

            escritorXml.writeStartElement("autor");
            escritorXml.writeAttribute("codigo", "a2");
            escritorXml.writeStartElement("nome");
            escritorXml.writeCharacters("Fiodor Dostoyevsky");
            escritorXml.writeEndElement();
            escritorXml.writeStartElement("titulo");
            escritorXml.writeCharacters("El idiota");
            escritorXml.writeEndElement();
            escritorXml.writeStartElement("titulo");
            escritorXml.writeCharacters("Noches blancas");
            escritorXml.writeEndElement();
            escritorXml.writeEndElement();

            escritorXml.writeEndElement(); // Cierra el elemento raíz principal
            escritorXml.writeEndDocument(); // Finaliza la estructura del documento XML

            escritorXml.flush(); // Fuerza a que todos los datos acumulados se guarden físicamente en el disco duro.
            escritorXml.close(); // Cierra la herramienta escritorXML liberando memoria
            conectorArchivo.close(); // Cierra el conector de archivo de texto FileWriter

            System.out.println("¡El archivo 'autores.xml' se ha generado con éxito!");

        }catch(IOException | XMLStreamException e){
            System.out.println("Error " + e.getMessage());
        }
    }
    }
