    import java.util.Scanner;

    public class prime {
        public static <bool> void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int x;

            boolean isPrime = true ;

            for(int i=2; i<n-1; i++){

                if(n%i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }
    }
