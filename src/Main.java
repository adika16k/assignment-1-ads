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