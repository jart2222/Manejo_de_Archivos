package org.aguzman.archivos.ejemplos.servicio;

import java.io.*;
import java.util.Scanner;

public class ArchivoServicio {
    public void crearArchivo(String nombre){
        File archivo= new File(nombre);
        try(BufferedWriter buffer=new BufferedWriter(new FileWriter(archivo,true));) {
            buffer.append("Hola que tal amigos!\n")
                    .append("Todo bien? yo aca escribiendo un archivo...\n")
                    .append("Hasta luego Lucas!\n");
            //buffer.close(); Se abre un recurso y si no se logra se cierra en automatico
            //cuando termina se cierra solo
            System.out.println("El archivo se ha creado con exito! ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void crearArchivo2(String nombre){
        File archivo= new File(nombre);
        try(PrintWriter buffer=new PrintWriter(new FileWriter(archivo,true));) {
            buffer.println("Hola que tal amigos!");
            buffer.println("Todo bien? yo aca escribiendo un archivo...");
            buffer.printf("Hasta luego %s!","Lucas");
            //buffer.close(); Se abre un recurso y si no se logra se cierra en automatico
            //cuando termina se cierra solo
            System.out.println("El archivo se ha creado con exito! ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String leerArchivo(String nombre){
        StringBuffer sb=new StringBuffer();
        File archivo=new File(nombre);
        try(BufferedReader reader=new BufferedReader(new FileReader(archivo));) {
            String linea;
            while ((linea=reader.readLine())!=null){
                sb.append(linea).append("\n");
            }

            //reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }

    public String leerArchivo2(String nombre){
        StringBuffer sb=new StringBuffer();
        File archivo=new File(nombre);
        try(Scanner s=new Scanner(archivo)) {
            s.useDelimiter("\n");
            while (s.hasNext()){//mientas tenga un siguiente elemento
                sb.append(s.next()).append("\n");
            }
            //s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}
