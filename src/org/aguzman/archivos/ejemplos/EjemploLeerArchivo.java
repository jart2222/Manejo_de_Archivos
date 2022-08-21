package org.aguzman.archivos.ejemplos;

import org.aguzman.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploLeerArchivo {
    public static void main(String[] args) {
        String nombreArchivo="C:\\Users\\jart2\\Documents\\codigos\\java\\curso_J\\Manejo_de_Archivos\\Archivo\\java.txt";
        ArchivoServicio servicio=new ArchivoServicio();
        System.out.println(servicio.leerArchivo2(nombreArchivo));
    }
}