import java.util.Scanner;

public class EX4 {
    /*
     * @ Factorial - function that finds factorial of given number
     * @ n - given number
     * @ Factorial is when we multiply one by one
     * @ So return - returning the biggest number multiplied by less than one while number == 1
     *  */
    public static int Factorial(int n){
        if (n == 0)
            return 0;
        if (n==1)
            return 1;
        if (n==2)
            return 2;
        else
            return n * Factorial(n-1);
    }
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write number: ");
        int n = sc.nextInt();
        System.out.println(Factorial(n));
    }
}
