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
