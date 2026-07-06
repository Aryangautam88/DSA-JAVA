import java.util.Scanner;

public class rowWiseSum {

    public static void toPrintSum(int arr[][] , int row , int col) {

        System.out.println("Printing the sum of row ");
        for(int i= 0; i < arr.length; i++){
            int sum = 0;
            for (int j = 0 ; j < arr[i].length; j++){
               sum += arr[i][j];
            }
            System.out.println(sum+" ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4] ;

        System.out.println("Enter the element: ");

        for(int i= 0; i < arr.length; i++){
            for (int j = 0 ; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("printing the element");

        for(int i= 0; i< arr.length; i++){
            for (int j = 0 ; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        toPrintSum(arr, 3,4);

    }
}
