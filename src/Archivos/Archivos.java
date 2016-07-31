/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;
/**
 *
 * @author raul_
 */
import java.io.*;
       
public class Archivos{
    public String leerArchivos(String direccion){
        String texto = "";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine()) != null){
                //Hace el ciclo mientra bfRead tiene datos
                temp = temp + bfRead;//guardado e; texto del archivo
                temp+=" ";
            }
            texto = temp;
        }catch(Exception e){
            System.err.println("No se encontro archivo");
        }
        return texto;
    }
    public void escribirArchivos(String direccion, String texto) throws IOException{
        BufferedWriter bw;
        bw = new BufferedWriter(new FileWriter(direccion));
        bw.write(texto);   
        bw.close();
    }
}
    