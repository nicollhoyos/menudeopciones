package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Programa para crear ciclo
        // Y crear un menu de opciones
        Integer opcionSeleccionda=0;
        while(opcionSeleccionda!=5){
            System.out.println("Menu de opciones");
            System.out.println("****************");
            System.out.println("➕Digita 1 para sumar");
            System.out.println("➖Digita 2 para restar");
            System.out.println("✖️Digita 3 para multiplicar");
            System.out.println("➗Digita 4 para dividir");
            System.out.println("➡️Digita 5 para SALIR DEL PROGRAMA");
            Scanner leerTeclado = new Scanner(System.in);
            System.out.println("Seleccione una opcion por favor😊");
            opcionSeleccionda= leerTeclado.nextInt();

            //Evaluando caminos segun la opcion del usuario:
            if (opcionSeleccionda==1){
                System.out.println("SUMANDO...");
            } else if (opcionSeleccionda==2) {
                System.out.println("restando...");
            } else if (opcionSeleccionda==3) {
                System.out.println("multiplicando...");
            } else if (opcionSeleccionda==4){
                System.out.println("dividiendo...");
            } else if (opcionSeleccionda==5) {
            System.out.println("gracias por visitarnos");
            }else{
            System.out.println("opcion invalida");



        }

        }


}
    }
