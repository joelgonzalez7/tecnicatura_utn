/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio1;
import java.util.Scanner;
/**
 *
 * @author Joe
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Crear el objeto Scanner para entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Declaración de variables
        int alto;
        int ancho;

        // Solicitar los valores al usuario
        System.out.print("Ingrese el alto del rectangulo: ");
        alto = sc.nextInt();

        System.out.print("Ingrese el ancho del rectangulo: ");
        ancho = sc.nextInt();

        // Calcular área y perímetro
        int area = alto * ancho;
        int perimetro = 2 * (alto + ancho);

        // Imprimir resultados en el formato requerido (sin tildes, con espacios y mayúsculas correctas)
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);

        
    }
    
}
