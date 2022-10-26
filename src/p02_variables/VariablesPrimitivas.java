package p02_variables;

public class VariablesPrimitivas {
    public static void main (String args[]){
        //Definiendo variable entera:
        int variableEntera = 10;
        System.out.println(variableEntera);
        
        //Modificando variable entera:
        variableEntera = 5;
        System.out.println(variableEntera);
        
        //Definiendo variable cadena:
        String variableCadena = "Saludos";
        System.out.println(variableCadena);
        
        //Modificando variable cadena:
        variableCadena = "Adiós";
        System.out.println(variableCadena);
        
        //Definiendo variable con Var
        var variableEntera2 = 15;
        System.out.println(variableEntera2);
        
        var variableCadena2 = "Nueva cadena";
        System.out.println("variableCadena2 = " + variableCadena2);
        
        /*Las variables se pueden nombrar con letras o números pero no caracteres
        especiales, también pueden empezar con guiones bajops o con el símbolo de dólar.
        Se recomienda comenzar su nombre con minúscula y si tiene mas de una palabra
        escribir la siguiente junta y con mayúscula en la primer letra.
        No se recomienda utilizar acentos en los nombres de las variables.
        */
        //Ejemplos:
        var variableUno = 1;
        var _variableDos = 2;
        var $variableTres = 3;
        // var VariableUno = 1; No se recomienda por la mayúscula.
        // Var %VariableUno = 1; No se puede utilizar por el caracter especial.
        
        
        /* Si presiono ctrl+click sobre cualquier variable el IDE
        me llevará a la línea de código donde se definió dicha variable.*/
        
        /* Se puede definir una variable usando var en lugar del tipo de dato
        y así el compilador va a inferir qué tipo de dato es la variable.
        */
        
        //Atajos: sout+tab, soutv+tab = imprime la última variable definida
    }
}