/* Main.c file generated by New Project wizard
 *
 * Created:   dom. sep. 16 2018
 * Processor: PIC16F84A
 * Compiler:  MPLAB XC8
 */
 #include <xc.h>

 //Frecuencia del Cristal de cuarzo
#define FRECUENCIA 4000000L
//Funcion para delay
#define delay_us(x){ unsigned int us; \
				    us= (x) / (12000000 / FRECUENCIA) | 1; \
				    while(--us !=0) continue; }

 void contador(unsigned int valor);

//Metodo de pausa con milisegundos definidos
void delay_ms(unsigned int ms){
      unsigned int i;
      do{
	     i=4;
	     do{
		  delay_us(164);
		}while(--i);
	 }while(--ms);
 }

  
void main(void)
 {
   // Write your code here
    TRISB=0;
   while (1){
	 for (int i=0; i<=10; i++){
	       contador(i);
	  };
	 
      };
 }
 
 void contador(unsigned int valor){
      delay_ms(100);
      switch(valor){
	 case 1:
	    PORTB= 0b00000110;
	    break;
	 case 2:
	    PORTB= 0b01011011;
	    break;
	 case 3:
	    PORTB= 0b01001111;
	    break;
	 case 4:
	    PORTB= 0b01100110;
	    break;
	 case 5:
	    PORTB= 0b01101101;
	    break;
	 case 6:
	    PORTB= 0b01111101;
	    break;
	 case 7:
	    PORTB= 0b00000111;
	    break;
	 case 8:
	    PORTB= 0b01111111;
	    break;
	 case 9:
	    PORTB= 0b01100111;
	    break;
	 case 0:
	    PORTB= 0b00111111;
	    break;
	 default:
	    PORTB= 0b00000000;
	    break;
      }
 };