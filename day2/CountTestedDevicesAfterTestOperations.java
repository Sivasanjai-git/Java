import java.util.Scanner;

public class CountTestedDevicesAfterTestOperations {

    public static int countTestedDevices(int[] batteryPercentages) {
        int tested = 0;

        for (int battery : batteryPercentages) {
            if (battery - tested > 0) {
                tested++;
            }
        }

        return tested;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of devices: ");
        int n = sc.nextInt();

        int[] batteryPercentages = new int[n];

        System.out.println("Enter battery percentages:");
        for (int i = 0; i < n; i++) {
            batteryPercentages[i] = sc.nextInt();
        }

        int result = countTestedDevices(batteryPercentages);

        System.out.println("Number of Tested Devices = " + result);

        sc.close();
    }
}