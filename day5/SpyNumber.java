import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0, product = 1;

        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }

        if (sum == product)
            System.out.println("Spy Number");
        else
            System.out.println("Not Spy Number");

        sc.close();
    }
}