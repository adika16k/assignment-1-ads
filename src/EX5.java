import java.util.Scanner;

public class EX5 {
    /*
     * @ Fibonacci - function to calculate fibonacci of the number
     * @ n - is a number
     * @ Fibonacci sequence of numbers where each number after the first two is the sum of this two
     * @ return - returns the sum of two number given the biggest one
     *  */
    public static int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return Fibonacci(n - 2) + Fibonacci(n - 1);
    }
    public static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Fibonacci(n));
    }
}
