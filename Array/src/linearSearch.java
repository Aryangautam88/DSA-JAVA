import java.util.Scanner;

public class linearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter element");

        int sum = 0;
        int i;
        int x= -3;
        for ( i = 0; i < n; i++) {

            arr[i] = sc.nextInt();


        }
        if(arr[i] == x){
            System.out.println("present");
        }
        else {
            System.out.println("absent");
        }
    }
    }
