/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejocadenas;

/**
 *
 * @author reroes
 */
public class EjemploCadenas {
    public static void main(String[] args) {
        String ciudad = "loJa";
        ciudad = ciudad.toUpperCase();
        System.out.printf("%s\n", ciudad.toLowerCase());
        // System.out.printf("%s\n", ciudad.toUpperCase());
        // imprime primero en minuscula porque solo esta pidiendo que se imprima
        // en esa linea asi pero la variable esta inicializada en mayuscula por 
        // lo cual en el segundo print seria con mayuscula
        System.out.printf("%s\n", ciudad);
        // toLowerCase es un método
        // toUpperCase es un método
        
    }
}
