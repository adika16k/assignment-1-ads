

import java.util.Scanner;

public class EX3 {
    /*
     * @ IsNumberPrime - checks if the given number is prime
     * @ n - given number
     * @ i - number by which we check prime or not, it equals 2
     * @ if number % for 2 without remainder it can be prime
     * @ recursion will be used while i*i > n
     * @ after every recursion i+1 , and if number divided by i it's not prime
     *  */

    public static boolean IsNumberPrime(int n, int i) {
        if (n % i == 0) {
            return false;
        } else {
            return i * i > n ? true : IsNumberPrime(n, i + 1);
        }
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a number:");
        int n = sc.nextInt();
        if (IsNumberPrime(n, 2)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }

    }
}

