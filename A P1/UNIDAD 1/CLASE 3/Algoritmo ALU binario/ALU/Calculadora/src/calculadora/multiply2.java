
package calculadora;

public class multiply2 {
    public static void main(String[] args) {
    int x = 11;
    int y = 13;
    int ans = multiply(x, y);
    System.out.println(ans);
    }
    
    public static int multiply(int x, int y) {
    if (x == 1) {
    return y;
    }

    int temp = multiply(x / 2, y * 2);
    if (x % 2 != 0) {
    temp += y;
    }

    return temp;
    }
}
