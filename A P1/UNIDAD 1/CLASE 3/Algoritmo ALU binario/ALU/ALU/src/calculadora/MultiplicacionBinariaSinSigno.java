
package calculadora;

import java.util.Scanner;

public class MultiplicacionBinariaSinSigno {
    Scanner scan = new Scanner(System.in);
    public MultiplicacionBinariaSinSigno(){
        //Constructor
    }
    //Metodo rotacion Circular a la Derecha
    public /*static*/ String rotarCDerecha(String binario) {
        String binarioRotado;
        binarioRotado = binario.charAt(binario.length() - 1) + binario.substring(0, binario.length() - 1);
        return binarioRotado;
    }
    
    //Metodo para convertir Decimal a Binario
    public /*static*/ String DecimalABinario(long decimal) {
	if (decimal <= 0) {
		return "0";
	}
	StringBuilder binario = new StringBuilder();
	while (decimal > 0) {
		short residuo = (short) (decimal % 2);
		decimal = decimal / 2;
		// Insertar el dígito al inicio de la cadena
		binario.insert(0, String.valueOf(residuo));
	}
	return binario.toString();
    }
    
    //Metodo para convertir Binario a Decimal
    public long BinarioADecimal(long numero){//numero tiene que ser un binario
        long aux, digito, decimal;//
        int exponente;
        boolean esBinario;
        
        //Leer un número por teclado y comprobar que es binario
        do {
            //Leemos el numero
             //System.out.print("Introduce un numero binario: ");
             //numero = scan.nextLong();
             
             //comprobamos que sea un número binario es decir
             //que este formado solo por ceros y unos
             esBinario = true;
             aux = numero;
             while (aux != 0) {
                        digito = aux % 10; //última cifra del números
                        if (digito != 0 && digito != 1) { //si no es 0 ó 1
                             esBinario = false; //no es un número binario
                        }
                        aux = aux / 10; //quitamos la última cifra para repetir el proceso                           
              }
         } while (!esBinario); //se vuelve a pedir si no es binario
        
        //proceso para pasar de binario a decimal
         exponente = 0;
         decimal = 0; //será el equivalente en base decimal
         
         while (numero != 0) {
                   //se toma la última cifra
                   digito = numero % 10;
                   //se multiplica por la potencia de 2 correspondiente y se suma al número                          
                   decimal = decimal + digito * (int) Math.pow(2, exponente);
                   //se aumenta el exponente
                   exponente++;
                   //se quita la última cifra para repetir el proceso
                   numero = numero / 10;
         }
         //System.out.println("Decimal: " + decimal);
         return decimal;
        }
    
    //main
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        long R3 = 0;
        long R4 = 0;
        long C = 0;//Acarreo o Carrier
        int CONT = 4;//contador
        
        String R1 = "1011";//Multiplicando
        String R2 = "1101";//Multiplicador
        /*                
        //String resultado;
        System.out.print("Ingrese un numero binario de máx 4 bits: ");
        R1 = scan.next();
        System.out.println();
        System.out.print("Ingrese un segundo numero binario de máx 4 bits: ");
        R2 = scan.next();
        System.out.println();
        */
        
        //mostrar numeros ingresados
        System.out.print("Numero 1: " + R1);
        System.out.println();
        System.out.print("Numero 2: " + R2);
        System.out.println();
        /*
        //prueba de que si funciona la rotacion der. usando >>>
        
        resultado = R1+R2;//Es tipo String       
        System.out.print("concat: " + resultado);
        
        long r = Long.parseLong(resultado);//Sale tipo long binario
        MultiplicacionBinariaSinSigno m2 = new MultiplicacionBinariaSinSigno();
        long r1 = m2.BinarioADecimal(r);// sale tipo decimal long
        long r2 = r1 >>> 1;
        System.out.println();
        System.out.print("r2: "+r2);
        System.out.println();
        String r3 = m2.DecimalABinario(r2);//Sale binario String
        System.out.print("r3: " + r3);
        System.out.println();
        */
        //try {
            // Verifico que el binario ingresado sea válido
            long num1 = Long.parseLong(R1);
            long num2 = Long.parseLong(R2);
            MultiplicacionBinariaSinSigno m = new MultiplicacionBinariaSinSigno();
            //Iteracion
            do{
                //for(CONT=0; CONT < R2.length();CONT++){
                    //Verificamos bit menos sign. de R2
                    if(R2.substring(CONT-1,CONT).equals("1")){
                        /*
                            }else{//Sea 0 el valor menos sign. No realizamos nada 
                            if(R2.substring(R2.length()-1,R2.length()).equals("0")){
                                //Dejamos el valor que tiene R3 (0)
                                R3 += R3;
                            }
                        }
                        */
                            //SUMA
                            R3 += num1;
                            //DESPLAZAMIENTOS

                        //DESPLAZAMIENTO DERECHA SIN SIGNO
                        
                        R4 = num2;
                        num2 = C+R3+R4;
                        //Pasar auxiliar (binario tipo long) a decimal

                        num2 = m.BinarioADecimal(num2);// Sale tipo long decimal

                        //Desplazamiento a la derecha una posicion
                        num2 = num2 >>> 1;//Es Tipo Decimal long        

                        //Pasando de Decimal a Binario String
                        R2 = m.DecimalABinario(num2);//Producto Parcial
                        }else{
                        //Volverlo a Desplazar a la Derecha al resultado
                        //DESPLAZAMIENTO DERECHA SIN SIGNO
                        num2 = Long.parseLong(R2);
                        //Pasar auxiliar (binario tipo long) a decimal

                        num2 = m.BinarioADecimal(num2);// Sale tipo long decimal

                        //Desplazamiento a la derecha una posicion
                        num2 = num2 >>> 1;//Es Tipo Decimal long        

                        //Pasando de Decimal a Binario String
                        R2 = m.DecimalABinario(num2);//Producto Parcial
                    }
                                                       
                //}//FIN DE CICLO FOR   
                    CONT--;
            }while(CONT == 0);    
                //System.out.println("Presione la tecla 's' para continuar la iteracion, u otra tecla para salir:");
            //}while(scan.next().equals("s"));   
        /*
        } catch (NumberFormatException e) {
            System.out.println("Ha ingresado un numero invalido");
        }    
        */      
                
                    //ROTACION Cir. DERECHA                    
                    //String binario = String.valueOf(auxiliar);
                    R2 = m.rotarCDerecha(R2); 
                    //RESULTADO                
                    System.out.println("Resultado: " + R2);
                    System.out.println();
    }    
}
//Fuentes
// http://blog-programando-ando.blogspot.com/2013/10/rotar-un-numero-binario-en-java.html 

// https://es.wikibooks.org/wiki/Programación_en_Java/Operadores_de_bits