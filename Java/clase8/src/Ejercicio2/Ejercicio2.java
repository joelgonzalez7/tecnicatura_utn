/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;
import java.util.Scanner;

/**
 *
 * @author Joe
 */
public class Ejercicio2 {
    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

        // Solicitar números al usuario
        System.out.println("Ingrese el primer numero:");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero:");
        int num2 = scanner.nextInt();

        // Usar operador ternario para determinar el mayor
        int mayor = (num1 > num2) ? num1 : num2;

        // Imprimir resultado
        System.out.println("El mayor es: " + mayor);      
    }
}
