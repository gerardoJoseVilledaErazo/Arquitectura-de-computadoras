
package calculadora;

import javax.swing.JOptionPane;

public class Binario {
    static int temp;
    static int sum;
    
    public static void main(String[] args)
    {
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
    int ans = product(x , y);
    System.out.println(ans);
    }
    /*
    public static int multiply(int x, int y)
    {
    if(x==1)
    {
    System.out.println(x+" : "+y);
    return y;
    }


    temp = multiply(x/2, y*2);

    if(x%2==0)
    {
    System.out.println(x+" : "+y);
    return temp;
    }
    else
    {
    System.out.println(x+" : "+y);
    sum = sum+temp;
    return sum;
    }
    }*/
    
    public static int product(int a, int b) {
    int p = 0;
    // If a is odd number.
    if ((a & 1) > 0) {
    p = b;
    } //else use the default value in the p.

    // If "a" contains any number larger than one
    // than continue recursion.
    if (a > 1)
    p = p + product(a >> 1, b << 1);
    return p;
    }
}
