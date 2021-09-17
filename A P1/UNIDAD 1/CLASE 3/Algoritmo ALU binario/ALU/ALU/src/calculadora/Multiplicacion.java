
package calculadora;

import java.util.*;

public class Multiplicacion {
    //Atributos
        String cadena1 = new String();
        String cadena2 = new String();
        int cadena[] = new int [20];
        int cdena[] = new int [20];
        int cdenamd[] = new int [20];
        int result[] = new int [20];
        int i, dim, dim2;
    
    Scanner scan = new Scanner(System.in);
     
    //Constructor
    public Multiplicacion(){
        //Constructor
    }
    
    //Metodo leer
    public void leer(){
        System.out.println("Ingrese el primer numero en binario:");
        cadena1 = scan.nextLine();        
        for(i = 0;  i < cadena1.length(); i++){
            //charAt = Devuelve el carácter situado en la posición 'index=i' pasada por parámetro. La primera posición es la 0.
            //transforma la cadena en un numero entero.
            if(cadena1.charAt(i) == 48) // 48 es por el codigo ASCII igual a cero.
                cadena[i] = 0;
            else
                cadena[i] = 1;
        }
        dim = i;
        
        System.out.println("Ingrese el segundo numero en binario:");
        cadena2 = scan.nextLine();
        
        for(i = 0;  i < cadena2.length(); i++){
            //charAt = Devuelve el carácter situado en la posición 'index=i' pasada por parámetro. La primera posición es la 0.
            //transforma la cadena en un numero entero.
            if(cadena2.charAt(i) == 48) // 48 es por el codigo ASCII igual a cero.
                cdena[i] = 0;
            else
                cdena[i] = 1;
        }        
        dim2 = i;
    }
    
    //Metodo sumar
    public void sumar(){
        System.out.println("Sumando.... ");
        int j = 0;
        for(i = 0; i<dim; i++){
            if(i < (dim - dim2)){
                cdenamd[i] = 0;
            }else{
                cdenamd[i] = cdena[j];
                j++;
            }
        }
        
        int acarreo = 0;
        
        for(i = dim-1; i >= 0; i--){
            if(acarreo == 1){
                cadena[i] = cadena[i] + acarreo;
                if(cadena[i] == 2){
                    acarreo = 1;
                    cadena[i] = 0;
                }
            }
            result[i+1] = cadena[i] + cdenamd[i];
            if(result[i+1]==2){
                acarreo = i;
                result[i+1] = 0;
            }else{
                acarreo = 0;
            }
        }
        
        if(acarreo == 1)
            result[0] =  acarreo;
    }
    
    //Metodo multiplicar
    public void multiplicar(){
        //
    }
    
    //Metodo mostrar
    public void mostrar(){
        //**********************************************************************
        System.out.print("Numero1: ");
        for(i=0; i<dim; i++){
            System.out.print(cadena[i] + " ");
        }
        System.out.println();//Salto de linea
        
        System.out.print("Numero2: ");
        for(i = 0; i < dim; i++){
            System.out.print(cdenamd[i] + " ");
        }
        System.out.println();//Salto de linea
        //**********************************************************************
        System.out.print("Suma: ");
        for(i = 0; i < dim + 1; i++){
            System.out.print(result [i] + "  ");
        }
    }
    
    //Metodo Main
    public static void main(String[] args) {
        System.out.println("MULTIPLICACION DE NUMEROS BINARIOS SIN SIGNO");
        System.out.println("--------------------------------------------");
        //Multiplicacion m1 = new Multiplicacion();
        //m1.leer();
        //m1.sumar();
        //m1.mostrar();
        
        //int[] R3 = new int[4];
        int R3 = 0;
        int R4 = 0;
        int C = 0;
        int CONT = 0;
        
        int[] R1 = {1,0,1,1};
        int[] R2 = {1,1,0,1};
        int[] Acumulador = {0,0,0,0};//R3
        //int[] Carrier = {0};//C
        
        for(int i = 0; i<4; i++){ // i < 4 porque se daran 4 pasadas o recorridos.
            
            if(R2[3] == 1){// 0 1 2 3   --> R2[3]   
                //SUMA
                Acumulador[i] += R1[i];
                //R3 += R1[i];
            }else{
                if(R2[3] == 0){//Sea 0 el valor menos sign.                    
                    Acumulador[i] = Acumulador[i];                    
                }
            }
            //DESPLAZAMIENTOS
            CONT = CONT + 1;             
            
            //DesplazamientoDerecha[i] = Carrier[i]+Acumulador[i]+R2[i];
            //DesplazamientoDerecha[i] = DesplazamientoDerecha[i] >>> 1;           
        }
        
        System.out.print("numero 1 o multiplando: ");
        for(int i=0; i<4; i++){
            System.out.print(R1[i] + " ");
        }     
        System.out.println();//salto de linea
        System.out.print("numero 2 o multiplador: ");
        for(int i=0; i<4; i++){
            System.out.print(R2[i] + " ");
        }
        System.out.println();
        System.out.print("El resultado es: ");   
        /*
        System.out.print("Concat: ");
        for(int i=0; i<4; i++){
            System.out.print(R1[i]+" "+R2[i] + " ");
        }
        System.out.println();
        System.out.print("Acumulador: ");
        for(int i=0; i<4; i++){
            System.out.print(Acumulador[i] + " ");
        }
        System.out.println();
        
        System.out.print("El resultado es: ");        
        for(int i=0; i<4; i++){
            System.out.print(Acumulador[i]+" "+R2[i]+" ");
        }
        */
        System.out.println();
    }
}
// https://es.wikibooks.org/wiki/Programaci%C3%B3n_en_Java/Operadores_de_bits
// https://es.convertbinary.com/numeros/