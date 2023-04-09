

import java.util.Scanner;

public class EX6 {
    /*
     * @ findPowOfTwoNumber - function to find the pow
     * @ a - number to pow
     * @ n - degree of this number
     * @ return - number is multiplied while degree is decreased to 0
     *  */

    public static int findPowOfTwoNumber(int a, int n) {
        return n == 0 ? 1 : a * findPowOfTwoNumber(a, n - 1);
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write first number: ");
        int a = sc.nextInt();
        System.out.println("Write second number: ");
        int n = sc.nextInt();
        System.out.println(findPowOfTwoNumber(a, n));
    }
}
