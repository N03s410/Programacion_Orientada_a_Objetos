package com.mycompany.actividad_2;

//Ingresar blibliotecas
import java.util.Scanner;
import java.util.ArrayList;


// Iniciar la clase
public class Actividad_2{
    public static void main(String[] args){
        //Parte I
        System.out.println("Actividad 2 Programa 1: ");
        // Lista de nombres
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Noe");
        nombres.add("Joaquin");
        nombres.add("Luis");
        nombres.add("Nicolas");
        nombres.add("Damian");
        nombres.add("Dante");
        nombres.add("Jacinto");
        //INGRESAR NOMBRE
        Scanner ingreso = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ingresa tu nombre: ");
        String nombre_inp = ingreso.nextLine();  // Read user input
        String nombre = nombre_inp.toLowerCase();
        System.out.println("Hola " + nombre);  // Output user input
        if (nombres.contains(nombre)){
           System.out.println("Bienvenido" + nombre + ", Que tengas un buen dia");
        } else{
            System.out.println("Error, el nombre " + nombre + " no se encuntra en el registro");
                    }
        // PARTE II
        System.out.println("Actividad 2 Programa 2: ");
        //Definir numero inicial del contador
        int contador = 2;
        //Definir lista
        ArrayList<Integer> numeros= new ArrayList<>();
        numeros.add(contador);
        //Bucle
        while (contador<101){
            contador++;
            if (contador%2==0){
                numeros.add (contador);
            }
            else{
                
            }
            
        }
        //Mostrar lista
        System.out.print(numeros);                 

        }
    }