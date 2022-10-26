package p03_concatenacion;

import java.util.Scanner;                               //Se importa la clase Scanner

public class Concatenacion {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);          //Se crea el objeto scan desde la clase Scanner.
        System.out.println("Escribe tu nombre: ");
        var input = scan.nextLine();                    //Se crea la variable input que va a recibir los datos ingredsados.
        var usuario = input;                            //La cadena ingresada se añade a la variable usuario. 
        System.out.println("Bienvenido " + usuario);    //Concatenación de cadena mas variable usuario.
        
        var i = 3;                                      //Variables aleatorias para pruebas.
        var j = 4;
        
        System.out.println(i + j);                      //Se suman i + j porque java los detecta como enteros.
        System.out.println(i + j + usuario);            //Se evalúa de izquierda a derecha realizando suma y concatenacion.
        System.out.println(usuario + i +j);             //Como la primer variable fue una cadena trata todas ellas como cadenas (Se le llama contexto cadena)
        System.out.println(usuario + (i + j));          //Para que no trate todas las variables como cadena se usan parentesis.
    }
}