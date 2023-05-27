package Unidad6;
import Unidad5.Ruta;

import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;



/*
Resuelva utilizando como base su solución desarrollada para el ejercicio T3y4.1 Jerarquía de clases - Práctica 1 – Persona, de la unidad 3y4. 
En su block de notas, coloque las siguientes líneas en un archivo de texto, cada línea contiene los datos correspondientes a un profesor de tiempo completo 
(curp, nombre, teléfono, fecha de nacimiento y clave) o por horas (curp, nombre, teléfono, fecha de nacimiento, clave y horas) con cada dato separado por una coma:

 * Crear una aplicación en java que tenga:

-	Un método que lea el archivo de texto anterior separe cada dato en una variable del tipo adecuado para poder crear un objeto ProfesorTiempoCompleto o ProfesorPorHoras, según la cantidad de datos en la línea leída del archivo, cree el objeto y guárdelo en un archivo binario de objetos.

-	Un método que lea el archivo binario de objetos y los coloque en un ArrayList de referencias a Persona y regrese el ArrayList<Persona>

-	Un método principal que presente un menú con las opciones:

o	Crear archivo de objetos (llamar al primer método)

o	Leer archivo de objetos (llamar al segundo método)

o	Listar todas las personas

o	Listar el nombre y el teléfono de las personas con un salario menor al indicado por el usuario (ejemplo: 4,200.00)

o	Listar la clave, el nombre y la CURP de las personas que cumplan años en el mes indicado por el usuario (ejemplo: 12).

o	Salir
 */

public class Proyecto {

    //metodo de lectura de archivo de texto

    public static void main(String[] args) throws IOException, FileNotFoundException {
        //bucar archivo de texto


        //leer archivo de texto
        ArrayList<Profesor> lista = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("text.txt"));
        //procesar archivo
        int contador = 0;

        while (br.ready()){
            String linea = br.readLine();
            if (contador==0){
                String[] nombres = linea.split(",");
            }else{
                String[] datos = linea.split(",");
                if (datos.length==5){
                    lista.add(new ProfesorTiempoCompleto(datos[0], datos[1], datos[2], new Fecha(datos[3]), datos[4]));
                }else if (datos.length==6){
                    lista.add(new ProfesorPorHoras(datos[0], datos[1], datos[2], new Fecha(datos[3]), datos[4], Integer.parseInt(datos[5])));
                }
            }

            contador++;

        }
        br.close();
        //crear una ruta a la carpeta archivos
        String path = new Ruta().getRutaCarpeta("Archivos");
        //crear archivo binario
        File archivo = new File(path, "archivo.dat");

        //guardar en archivo binario
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("archivo.dat"));
        oos.writeObject(lista);
        oos.close();






    }
    
    
}
