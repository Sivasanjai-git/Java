import java.util.Scanner;

public class KItemsWithTheMaximumSum {

    public static int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {

        if (k <= numOnes) {
            return k;
        }

        k -= numOnes;
        int sum = numOnes;

        if (k <= numZeros) {
            return sum;
        }

        k -= numZeros;
        sum -= k;

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of 1's: ");
        int numOnes = sc.nextInt();

        System.out.print("Enter number of 0's: ");
        int numZeros = sc.nextInt();

        System.out.print("Enter number of -1's: ");
        int numNegOnes = sc.nextInt();

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        int result = kItemsWithMaximumSum(numOnes, numZeros, numNegOnes, k);

        System.out.println("Maximum Sum = " + result);

        sc.close();
    }
}