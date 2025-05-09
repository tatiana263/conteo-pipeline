package co.edu.unbosque.controller;

public class conteoLetras {

    public static void main(String[] args) {
       
        String palabra = "Buenas Tardes";  
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
