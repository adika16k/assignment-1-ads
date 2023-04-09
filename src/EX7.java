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
