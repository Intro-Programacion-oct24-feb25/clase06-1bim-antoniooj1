/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
  // existe una modificacion en el proceso de la problematica ,el porcentaje del 
descuento del seguro sera ingresado por teclado. Considerar los valores
posibles a ingresar son entre 1 y 15, si la persona ingresa un valot fuera 
de este rango el valor del porcentaje va a ser 10
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ComercioTres {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // 10,2 / 10.2
        
        String nombre;
        String apellido;
        int edad;
        double sueldoBasico;
        int numeroProductos;
        
        double productividad;
        double coeficiente = 0.6;
        double bono  = 0;
        
        double porcentajeSeguro = 0;
        double adicionalSeguro;
        
        double sueldoFinal; 
        
        System.out.println("Ingrese el nombre por favor");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el apellido por favor");
        apellido = entrada.nextLine();
        
        System.out.println("Ingrese la edad por favor");
        edad = entrada.nextInt();

        System.out.println("Ingrese el sueldo básico por favor");
        sueldoBasico = entrada.nextDouble();        
        
        System.out.println("Ingrese el número de productos vendidos "
                + "por favor");
        numeroProductos = entrada.nextInt();
        System.out.println("Ingrese el porcentaje del seguro");
        porcentajeSeguro = entrada.nextInt();
        
        
        // opción 1
        if (porcentajeSeguro >= 1 && porcentajeSeguro <= 15) {
            porcentajeSeguro = porcentajeSeguro + 0;
        } else {
            porcentajeSeguro = 10;
            //funciona ya que al introducir un numero mayor o igual al 1 y
            // menor o igual al 15 se presenta este valor y caso contrario se 
            // muestra el 10 ya que la condicion es falsa
            
        }

        // opción 2
        /*
        if (porcentajeSeguro > 15) {
            //porcentajeSeguro = 10;
            // La dos funciona pero si introduces un valor negativo seria 
            //incorrecto por lo ccual es incorrecta
            
        }

         // opción 3
        if (porcentajeSeguro < 1 || porcentajeSeguro > 15) {
            //porcentajeSeguro = 10;
            // la tres funciona debido a que si ingresamos un valor en el rango 
            // entre 1 y 15 las dos son falsas y se hacen verdaderas y si 
            //ingresamos otro valor sale el 10
        }

        // opción 4
        if (porcentajeSeguro < 1 && porcentajeSeguro > 15) {
            //porcentajeSeguro = 10;
           //la tres no funciona debido a que si ingresamos un valor en el rango 
           // entre 1 y 15 las dos son falsas y al tener and se convierte en 
           // falso por lo cual se convierte en 10
           
        }
        
        // calcular la productividad
        productividad = numeroProductos * coeficiente;
         //condicionales anidados
        if (productividad<=30){
            bono = 25; // $25
        }else{
            if (productividad>=31 && productividad<80){
                bono = 50;
            }else{
                if (productividad>=80 && productividad < 200) {
                    bono = 100;
                }else{
                    if(productividad >= 200){
                        bono = 200;
                    }
                }
            }
        }
        
       
        adicionalSeguro = (sueldoBasico * porcentajeSeguro)/100;
        sueldoFinal = adicionalSeguro + bono + sueldoBasico;
        
        System.out.printf("Reporte de Empleado EL GRAN COMERCIO\n\n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Edad: %d\n"
                + "Sueldo: $%.2f\n"
                + "Número de productos vendidos: %d\n"
                + "\tProductidad: %.2f\n"
                + "\tBono: $%.2f\n"
                + "Adicional del seguro: $%.2f\n\n"
                + "Sueldo final: $%.2f\n", 
                nombre, 
                apellido,
                edad,
                sueldoBasico,
                numeroProductos,
                productividad,
                bono,
                adicionalSeguro,
                sueldoFinal);
        
        
    }
    
}
