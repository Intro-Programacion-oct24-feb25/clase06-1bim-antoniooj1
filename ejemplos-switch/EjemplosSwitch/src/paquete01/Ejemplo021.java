/*
*   Generar un programa que permita ingresar el número de día de la semana;
*   (1 - 7)
*   Si el usuario ingresa el 1, debe presentar el mensaje: Día 1  es Lunes
*   Si el usuario ingresa el 2, debe presentar el mensaje: Día 2  es Martes
*   Si el usuario ingresa el 3, debe presentar el mensaje: Día 3  es Miércoles
*   Si el usuario ingresa el 4, debe presentar el mensaje: Día 4  es Jueves
*   Si el usuario ingresa el 5, debe presentar el mensaje: Día 5  es Viernes
*   Si el usuario ingresa el 6, debe presentar el mensaje: Día 6  es Sábado
*   Si el usuario ingresa el 7, debe presentar el mensaje: Día 7  es Domingo
*   Si el usuario ingresa un número diferente de 1,2,3,4,5,6,7; debe presentar
*   un mensaje: Opción incorrecta

 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int dia;
        int year;
        int mes;
        System.out.println("Ingrese el dia de nacimiento");
        dia = entrada.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        mes = entrada.nextInt();
        System.out.println("Ingrese el año de nacimiento");
        year  = entrada.nextInt();

        String mesCadena ="";
        
        switch (mes) {
            case 1:
                
                mesCadena = "Enero";
                break;

            case 2:
                
                mesCadena = "febrero";
                break;

            case 3:
                mesCadena = "Marzo";
              
                break;

            case 4:
                mesCadena = "Abril";
                break;

            case 5:
                mesCadena = "Mayo";
                break;

            case 6:
                mesCadena = "Junio";
                break;

            case 7:
                mesCadena = "Julio";
                break;

            case 8:
                mesCadena = "Agosto";
                break;

            case 9:
                mesCadena = "Septiembre";
                break;

            case 10:
                mesCadena = "Octubre";
                break;

            case 11:
                mesCadena = "Noviembre";
                break;
            case 12:
                mesCadena = "Diciembre";
                break;
                
        }
        System.out.printf("usted ha nacido el %d de %s de %d\n",
                dia, mesCadena , year);

    }
}

