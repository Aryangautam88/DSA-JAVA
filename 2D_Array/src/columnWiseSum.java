import java.util.Scanner;

public class columnWiseSum {

        public static void printColSum(int[][] arr,int row ,int col) {

            for(int j = 0; j < arr[0].length ; j++){
                int sum = 0;
                for( int i = 0; i <arr.length ; i++){
                   sum += arr[i][j] ;
                }
                System.out.print(sum +" ");
            }

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
                for( int j = 0; j <arr[i].length ; j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }

            System.out.println("column wise sum : ");
            printColSum( arr, 3 ,4);

        }

}
