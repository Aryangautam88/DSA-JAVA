    import java.util.Scanner;
    public class Maxmin {

        public static int getMin(int[] array){

            int min =Integer.MAX_VALUE  ;

            for(int i = 0; i<array.length;i++){

                if(array[i]<min){
                    min =array[i];
                }
            }

            return min;

        }
        public static int getMax(int[] array){

            int max =Integer.MIN_VALUE  ;

            for(int i = 0; i<array.length;i++){

                if(array[i]>max){
                    max =array[i];
                }
            }

            return max;

        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of array");
            int n = sc.nextInt()    ;
            int[] array = new int[n];

            System.out.println("Enter element");
            for(int i = 0;i<n; i++){

                array[i] = sc.nextInt();
            }

            // function calls
            int minAns = getMin(array);
            int maxAns = getMax(array);

            // outputs
            System.out.println("Smallest number is: " + minAns);
            System.out.println("Largest number is: " + maxAns);


        }
    }
