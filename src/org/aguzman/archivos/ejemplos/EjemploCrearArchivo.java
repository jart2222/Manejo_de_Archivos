package org.aguzman.archivos.ejemplos;

import org.aguzman.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploCrearArchivo {
    public static void main(String[] args) {
        String nombreArchivo="C:\\Users\\jart2\\Documents\\codigos\\java\\curso_J\\Manejo_de_Archivos\\Archivo\\java.txt";

        ArchivoServicio service =new ArchivoServicio();
        service.crearArchivo2(nombreArchivo);
    }
}