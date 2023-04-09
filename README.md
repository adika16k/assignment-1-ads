# assignment-1-ads


main

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EX1 pr1 = new EX1();
        EX2 pr2 = new EX2();
        EX3 pr3 = new EX3();
        EX4 pr4 = new EX4();
        EX5 pr5 = new EX5();
        EX6 pr6 = new EX6();
        EX7 pr7 = new EX7();
        EX8 pr8 = new EX8();
        EX9 pr9 = new EX9();
        EX10 pr10 = new EX10();
        Scanner ex = new Scanner(System.in);
        System.out.println("Which problem?: ");
        Scanner a = new Scanner(System.in);
        int number = a.nextInt();
        switch(number) {
            case 1:
                pr1.main();
                break;
            case 2:
                pr2.main();
                break;
            case 3:
                pr3.main();
                break;
            case 4:
                pr4.main();
                break;
            case 5:
                pr5.main();
                break;
            case 6:
                pr6.main();
                break;
            case 7:
                pr7.main();
                break;
            case 8:
                pr8.main();
                break;
            case 9:
                pr9.main();
                break;
            case 10:
                pr10.main();
                break;
        }
    }
}

#We take all classes to the main by new. After ask user to write which problem to calculate. And choose it by switch case method.





Problem 1


import java.util.Scanner;

public class EX1 {
    /*
     * @ findMinFromArr - function to find minimum value from array
     * @ arr - array
     * @ n - length of array
     * @ return - returning minimum of function
     * */

    public static int findMinFromArr(int[] arr, int n) {
        return n == 1 ? arr[0] : Math.min(arr[n - 1], findMinFromArr(arr, n - 1));
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the length of array: ");
        int n = sc.nextInt();
        System.out.println("Write a " + n + " elements: ");
        int[] arr = new int[n];

        for(int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMinFromArr(arr, n));
    }
}


# In problem 1 we should find minimum value from array. We make it with method Math.min. It check 2 numbers and take the minimum of them. Then recursion
findMinFromArr take next number. When n == 1 it takes first number in array and recursion ends.

Problem 2

import java.util.Scanner;

public class EX2 {
    /*
     * @ AverageNum - function to find average from array
     * @ arr - array
     * @ n - length of array
     * @ sum,avg - formula to find average
     * @ return - returns average of array
     * */
    public static float AverageNum(int[] arr, int n) {
        float avg, sum;
        if (n == 1)
            return arr[0];
        else
            sum= arr[n - 1] + (n - 1) * AverageNum(arr, n - 1); // arr[n-1] - gets the value of the n-1th element of an array
        avg = sum/n;
        return avg;
    }
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a lengh of array:");
        int n = sc.nextInt();
        System.out.println("Write a" + n + " elements:");
        int[]arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Average of this array is:" + AverageNum(arr, n));
    }
}


#In problem 2 we should find average of all numbers in array. We find average by adding all elements and dividing to number of all this numbers. So in sum the last
element added by previoues one with recursion (n-1) * AverageNum(arr, n-1). after all this we divide this all added value and divide it by n, it's lentgh of array.

Problem 3

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


# In problem 3 we should know is this given number prime or not. Prime number - it is the number that divides only for 1 and itself. I make recursion like number i 
increases by 1 after every division. If number can't divide to i without remainder than it's prime number.


Problem 4

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


# In problem 4 we should calculate factorial of given number. Factorial is when we multiple all numbers from range 1 to this number. I make recursion where 
biggest number multiplied eby less than one while number be 1.

Problem 5

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

#In problem 5 we should calculate fibonacci of given number. Fibonacci is sequence of numbers where each number after the first two is the sum of this two. So the 
recursion returns the sum of two number thah begins with given number.


Problem 6

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


# In problem 6 we should find pow of given 2 numbers. So I make recursion that multiple number to itself while degree not equal to 0.


Problem 7

import java.util.Scanner;

public class EX7 {
    /*
     * @ arrayReverse - reverses given array
     * @ arr - array
     * @ n - length of this array
     * @ return - returns last element of an array
     *  */
    public static int arrayReverse(int[] arr, int n){
        System.out.print(arr[n-1] + " "); // Print firstly last element of an array
        if (n==2)
            return arr[0];
        else
            return arrayReverse(arr, n-1);
    }
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write number if elements: ");
        int n = sc.nextInt();
        System.out.println("Write a " + n + " elements: ");
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(arrayReverse(arr,n));
    }
}

#In problem 7 we should reverse given array. I make it like firslty it writes the last element of an array. After it writes previus element and like that while n == 2.

Problem 8

import java.util.Scanner;

public class EX8 {
    /*
     * @ isAllDigits - function to check if given string contain only digits
     * @ s - given string
     * @ we check it one by one letter
     * @ !Character.isDigit checks and if there is another letter return will be false
     *  */
    public static boolean isAllDigits(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)))
                return false;
        }
        return true;
    }
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write string: ");
        String s = sc.next();
        boolean isAllDigits = isAllDigits(s);
        if (isAllDigits) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

#In problem 8 we should know if string contain only digits or not. I divide string one by one and check it with method !Character.isDigit . 
If there is another letter return will be false

Problem 9

import java.util.Scanner;

public class EX9 {
    /*
     * @ binomialCoefficent - function to find binomial coefficent of given two number by formula
     * @ n , k - given numbers
     * @ return - it returns formula with recursion
     *  */
    public static int binomialCoefficent(int n, int k){
        if (k==0 || k ==n)
            return 1;
        else
            return binomialCoefficent(n-1, k-1) + binomialCoefficent(n-1, k);
    }
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the first number: ");
        int n = sc.nextInt();
        System.out.println("Write the second number: ");
        int k = sc.nextInt();
        System.out.println(binomialCoefficent(n, k));
    }
}

# In problem 9 we calculate binomial coefficent of two numbers. It has formula and we make recursion by this formula.

Problem 10

import java.util.Scanner;

public class EX10 {
    /*
     * @ findGDC - function to find euclidean algorithm
     * @ a - first number , b - second number
     * @ gcd - is to find the biggest division of two numbers
     * @ return - returns division of second number by first and first number stand to second
     *  */

    public static int findGDC(int a, int b) {
        return a == 0 ? b : findGDC(b % a, a);
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the first number: ");
        int a = sc.nextInt();
        System.out.println("Write the second number: ");
        int b = sc.nextInt();
        System.out.println(findGDC(a, b));
    }
}

#In problem 10 we should calculate GCD(euclidean algorithm) of two numbers. GCD - is to find the biggest division of two numbers. I make recursion where 
second element divides by first and take first numbers place and first number take seconds place. This circulation works while a == 0 . After this GCD 
will be number b.

