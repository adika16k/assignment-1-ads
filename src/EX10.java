//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class EX10 {
    public EX10() {
    }

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
