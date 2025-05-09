package co.edu.unbosque.controller;

import java.util.Scanner;

public class conteoLetras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = sc.nextLine();

        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (Character.isLetter(c)) {
                contador++;
            }
        }

        System.out.println("Palabra ingresada: " + palabra);
        System.out.println("Cantidad de letras: " + contador);
    }
}
