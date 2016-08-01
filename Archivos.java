/* Algoritmos y Estructuras de Datos.
 * Nombres: Didier Salazar, 15487. Raul de Leon, Michelle Morales, Joselin Ortiz.
 * Archivos.java ... Clase encargada de leer y escribir sobre archivos.
 * 
 */

import java.io.*;
       
/**
 * Clase encargada de leer y escribir sobre archivos.
 * @author Didier Salazar, 15487. Raul de Leon, Michelle Morales, Joselin Ortiz.
 */
public class Archivos{

    /**
     * Metodo designado para leer archivos.
     * @param direccion Direccion en donde se encuentra el archivo a leer.
     * @return Devuelve como una cadena lo que se encontró en el archivo.
     */
    public String leerArchivos(String direccion){
        String texto = "";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            //Se hace un recorrido linea por linea en el archivo buscando texto para añadir a la cadena a devolver.
            while((bfRead = bf.readLine()) != null){
                //Hace el ciclo mientra bfRead tiene datos
                temp = temp + bfRead;//guardado e; texto del archivo
                temp+=" ";
            }
            texto = temp;
        }catch(Exception e){
            System.err.println("No se encontro archivo");
        }
        //Se devuelve el texto del archivo.
        return texto;
    }

    /**
     * Metodo designado para escribir una cadena de texto en un archivo.
     * @param direccion Direccion en donde se encuentra el archivo a leer.
     * @param texto Texto que se sobrescribira en el archivo.
     * @throws IOException Por si ocurre un error.
     */
    public void escribirArchivos(String direccion, String texto) throws IOException{
        BufferedWriter bw;
        //Se escribe en el archivo.
        bw = new BufferedWriter(new FileWriter(direccion));
        bw.write(texto);  
        //Se cierra el archivo.
        bw.close();
    }
}
    