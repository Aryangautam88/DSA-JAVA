

public class Array_Implementation {

    public static class QueueA{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[100];
        public  void add(int val) {

            if(r == arr.length-1) {
                System.out.println("Queue is full");
            }
            if(f == -1){
                f = r = 0;
                arr[0] = val;
            }
            else {
                arr[++r] = val;
            }

            size++;

        }
        public int remove(){

            if(size == 0){
                System.out.println("queue is empty");
                return -1;
            }

            f++;
            return arr[f-1];
        }
        public int peek(){
            f++;
            size--;
            return arr[f];
        }

        public void display(){
            if(size == 0){

                System.out.println("queue is empty");
            }
            else {
                for(int i = f ; i<r ; i++ ){
                    System.out.print(  arr[i]+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        QueueA Q = new QueueA();
        Q.add(10);
        Q.add(20);
        Q.add(30);
        Q.add(40);
        Q.add(50);
        Q.display();

    }

}
