import java.util.Scanner;
import java.util.Arrays;
public class Sort_An_array_using_Recursion_YT {

    static void sort(int[] arr, int n) {

        // Base Case
        if (n == 0) {
            return;
        }

        // Hypothesis
        sort(arr, n - 1);

        // Current element ko insert karo
        insert(arr, n);
    }
    static void insert(int[] arr, int n) {

        // Base Case
        if (n == 0 || arr[n - 1] <= arr[n]) {
            return;
        }

        // Bade element ko right shift karo
        int temp = arr[n];
        arr[n] = arr[n - 1];
        arr[n - 1] = temp;

        // Element ko aur left le jao
        insert(arr, n - 1);
    }

    public static void main(String[] args) {

        int[] arr = {2,3,7,6,4,5,9};
        int n = arr.length-1;

        sort(arr,n);

        System.out.println(Arrays.toString(arr));

    }

}
