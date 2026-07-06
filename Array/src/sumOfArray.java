import java.util.Scanner;
public class sumOfArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter element");

        int sum = 0;
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
            sum =sum+arr[i];

        }

        System.out.println(" Sum of array is :" + sum);
    }
}
