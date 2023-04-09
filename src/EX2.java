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
