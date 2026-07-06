    import java.util.Scanner;

    public class rotate90matrix {

        public static void Transpose(int[][] arr) {

            for(int i = 0; i < arr.length;i++){

                for (int j = i+1 ; j<arr[i].length ; j++){

                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i] ;
                    arr[j][i] = temp;
                }
            }

        }

        public static void reverse(int[][] arr) {

            for(int i = 0 ; i < arr.length ; i++){
                int a = 0; int b = arr.length-1;
                while (a<b){
                    int temp = arr[i][a];
                    arr[i][a] = arr[i][b];
                    arr[i][b] = temp;

                    a++;
                    b--;
                }
            }
        }


        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int[][] arr = new int[3][3];

            for (int i = 0 ; i<arr.length;i++){

                for (int j = 0 ; j<arr[i].length ; j++){

                    arr[i][j] = sc.nextInt();

                }

            }

            Transpose(arr);
            reverse(arr);

            for (int i = 0 ; i<arr.length;i++){

                for (int j = 0 ; j<arr[i].length ; j++){

                    System.out.print(arr[i][j]+" ");

                }
                System.out.println();
            }



        }

    }
