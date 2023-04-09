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
