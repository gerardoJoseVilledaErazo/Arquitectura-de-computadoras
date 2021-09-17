
package calculadora;

public class Ejercicio {
//Constructor
    public Ejercicio(){
        //Constructor
    }
//Metodos
    public static void main(String[] args) {
        Ejercicio ej2 = new Ejercicio();
        //prueba de desp. a la derecha
        /*
        int p = 5;//101
        int p1 = p >> 1;//0010
        //p1 --> binario
        System.out.print("prueba: "+ej2.DecimalABinario(p1));
        System.out.println();
        System.out.print("Despl. a la derecha: ");
        System.out.println();
        System.out.print("Original: 1001");
        System.out.println();
        String prueba = rotarCDerecha("1001");
        System.out.print("prueba: " + prueba);
        System.out.println();
        */        
//Main
//Declaracion e inicializacion de Variables
        Ejercicio ej = new Ejercicio();
        long aux;
        long R3 = 0;
        long R4 = 0;
        long C = 0;//Acarreo o Carrier
        int CONT = 4;//contador        
        String R1 = "0010";//Multiplicando
        String R2 = "0010";//Multiplicador
        try {            
            // Verifico que el binario ingresado sea válido            
            do{
                long num1 = Long.parseLong(R1);
                long num2 = Long.parseLong(R2);
                //2. Verificamos Bits Menos Significativo de R2:
                if(R2.substring(CONT-1,CONT).equals("1")){
                    R3 += num1;                    
                }else{
                    R3 += 0;                      
                }
                //3. Incrementamos la variable CONT en 1.
                CONT--;
                /*
                4. Las variables C, R3 y R4 se desplazan en conjunto una posición a la 
                derecha.
                */
                // >>> desp. a la derecha C+R3+R4 en conjunto
                //R4 = num2;
                //(C+R3+R4) >> 1;
                //0+1011+1101 --> 010111101 //int
                //binario --> decimal para rotar
                aux = C+R3+R4;
                aux = ej2.BinarioADecimal(aux);
                aux = aux >>> 1;
                //aux de Decimal a binario
                //ej2.DecimalABinario(aux);                    
                //5. R2 realiza una “rotación circular a la derecha”
                R2 = rotarCDerecha(R2);            
//mostrar numeros ingresados
            /*
            System.out.println("Multiplicacion de binarios sin signo ocupando metodo de suma de desplazamientos.");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.print("Ingrese un numero binario de máx 4 bits: " + R1);
            System.out.println();
            System.out.print("Ingrese un segundo numero binario de máx 4 bits: " + R2);
            System.out.println();
            System.out.print("Resultado en decimal: " + (aux-1));    
            System.out.println();
            System.out.print("Resultado en binario: " + ej2.DecimalABinario(aux-1));   
            System.out.println();
            System.out.println("--------------------------------------------------------------------------------");
            */
            
            }while(CONT != 0);
            
//mostrar numeros ingresados
            System.out.println("--------------------------------------------------------------------------------");            
            System.out.println("Multiplicacion de binarios sin signo ocupando metodo de suma de desplazamientos.");
            System.out.println("--------------------------------------------------------------------------------");
            System.out.print("Ingrese un numero binario de máx 4 bits: " + R1);
            System.out.println();
            System.out.print("Ingrese un segundo numero binario de máx 4 bits: " + R2);
            System.out.println();
            /*
            7. Si se finalizaron los 4 ciclos del bucle, la respuesta se encuentra en la
            concatenación de la variable R3 Y R4.
            */
            System.out.print("Resultado en decimal: " + aux);    
            System.out.println();
            System.out.print("Resultado en binario: " + ej2.DecimalABinario(aux));   
            System.out.println();
            System.out.println("--------------------------------------------------------------------------------");            

        } catch (NumberFormatException e){
            System.out.println("Ha ingresado un numero invalido");
        }            
    }
//Metodo que rota Circularmente a la Derecha un String binario
    public static String rotarCDerecha(String binario) {
        String binarioRotado = binario.charAt(3) + binario.substring(0, 3);
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
        do {
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
         exponente = 0;
         decimal = 0; //será el equivalente en base decimal
         while (numero != 0) {
                   digito = numero % 10;
                   //se multiplica por la potencia de 2 correspondiente y se suma al número                          
                   decimal = decimal + digito * (int) Math.pow(2, exponente);
                   exponente++;
                   numero = numero / 10;
         }
         return decimal;
        }
}
