import java.util.Scanner;

public class largestSumOfRowAndCol {

    public static void printColSum(int[][] arr,int row ,int col) {

        for(int j = 0; j < arr[0].length ; j++){
            int sum = 0;
            for( int i = 0; i <arr.length ; i++){
                sum += arr[i][j] ;
            }
            System.out.print(sum +" ");
        }

    }

    public static int largestSum(int[][] arr) {

        int max = Integer.MIN_VALUE;
        int rowIndex  = -1;

        for(int j = 0; j < arr[0].length ; j++){
            int sum = 0;
            for( int i = 0; i <arr.length ; i++){
                sum += arr[i][j] ;
            }
            if(max < sum ){
                max = sum;
                rowIndex = j;
            }
        }

        System.out.println();
        System.out.println("maximum sum is : "+ max);

        return rowIndex;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][4];

        for(int j = 0; j < arr[0].length ; j++){
            for( int i = 0; i <arr.length ; i++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < arr.length ; i++){
            for( int j = 0; j <arr[0].length ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Printing sum : ");

        printColSum( arr, 3 ,4);

         int ans  = largestSum( arr);
        System.out.println("max row is at index "+ans);

    }
}
