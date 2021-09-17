
package calculadora;

import java.util.Scanner;

public class Binario {
    //Atributos
    
    //Metodos
    //main
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String binario;
        int numero;
        
        System.out.println("Ingrese el numero binario de máx 31 bits: ");
        binario = scan.next();
        
        try {
            // Verifico que el binario ingresado sea válido
            numero = Integer.parseInt(binario, 2);
            //Iteracion
            do {
                binario = rotarCDerecha(binario);
                System.out.println("Rotacion derecha: " + binario);
                System.out.println("Presione 's' para continuar rotando, u otra tecla para salir:");
            } while (scan.next().equals("s"));
            
        } catch (NumberFormatException e) {
            System.out.println("Ha ingresado un numero invalido");
        }
    }
    
    public static String rotarCDerecha(String binario) {
        String binarioRotado;
        binarioRotado = binario.charAt(binario.length() - 1) + binario.substring(0, binario.length() - 1);
        return binarioRotado;
    }
    /*
    El programa funciona así:
1. Pide al usuario ingresar un número binario. Esto se hace mediante la clase Scanner; si desean saber más sobre Scanner pueden visitar este link.
2. El programa verifica que el número binario ingresado es válido. Para ello se usa el bloque try-catch, y un intento de parseo al entero numero. De una manera sencilla, podemos decir que si el número ingresado es correcto se ejecuta el bloque de código dentro del try, pero si no es correcto, se ejecuta el bloque de código dentro del catch.
3. Finalmente, es la función rotarDerecha() la encargada de rotar el binario. En esta operación se usa la concatenación de la que hablé antes. 
4. Se le pregunta al usuario si desea seguir rotando el número: si presiona la letra 's', se repite desde el paso 3. Si presiona cualquier otra tecla, como por ejemplo 'f'', el programa se detiene.
    */
}
