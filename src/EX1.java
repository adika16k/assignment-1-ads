
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
