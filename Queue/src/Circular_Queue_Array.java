public class Circular_Queue_Array {

    public static class CQ_Array{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[8];
        public void add(int x) throws Exception{

            if(size == 0){
                front = rear = 0;
                arr[0] = x;
            }
            else if(size == arr.length){
                throw new Exception("Queue is full");
            }
            else if(rear<arr.length){

                arr[++rear] = x;
            }
            else if(rear == arr.length-1){
                rear = 0;
                arr[0] = x ;
            }

            size++;

        }
        public int remove() throws Exception{

            if(size == 0){
                throw new Exception("Queue is Empty");
            }
            else if(front == arr.length-1){
                int x = arr[front];
                front = 0;
                return x;

            }
            else{
                int x = arr[front];
                if(front == arr.length -1) front = 0;
                else front++;
                size--;
                return x;
            }


        }
        public int peek() throws Exception{
            if(size == 0){
                throw new Exception("Queue is Empty");
            }
            else {
                return arr[front];
            }

        }

        public boolean isEmpty() {
            if(size == 0) return true;
            else return false;
        }
        public void  display(){
            if(size == 0){
                System.out.println("Queue is Empty");
            }
            else if (front<=rear) {

                for(int i = front ; i <= rear ; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            else {
                for (int i = front ; i< arr.length ; i++){
                    System.out.println(arr[i]+" ");
                }
                for (int i = 0 ; i<= rear; i++){
                    System.out.print(arr[i]+" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception{

        CQ_Array cq = new CQ_Array();
        cq.display();
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.display();
        cq.remove();
        cq.display();
        cq.add(5);
        cq.display();
        cq.add(6);
        cq.display();

    }
}
