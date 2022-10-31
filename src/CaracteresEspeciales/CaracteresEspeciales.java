package CaracteresEspeciales;

public class CaracteresEspeciales {

    public static void main(String args[]) {
        var nombre = "JATCH";
        
        // \n no dara un nuevo salto de linea en la consola:
        System.out.println("Nueva linea: \n" + nombre);
        
        // \t mostrara un caracter tabulador en la consola:
        System.out.println("Tabulador: \t" + nombre);
        
        // \b va a retroceder un espacio en la salida de la consola:
        System.out.println("Retroceso: \b" + nombre);
        
        //Se usa el caracter escape (diagonal invertida) para mostrar comilla simple, no es necesario el escape pero es lo correcto:
        System.out.println("Comilla simple: \'" + nombre + "\'");
        
        //Se usa escape para mostrar comilla doble sin que el IDE lo interprete como fin de cadena:
        System.out.println("Comilla doble: \"" + nombre + "\"");
    }
}