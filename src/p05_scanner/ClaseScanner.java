package p05_scanner;

import java.util.Scanner;
 
public class ClaseScanner {
    
    public static void main (String Args[]) {
        System.out.println("Escribe tu nombre: ");
        Scanner input = new Scanner(System.in);
        var usuario = input.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe el título: ");
        var titulo = input.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
    }
}