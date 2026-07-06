
class minHeap{

    private int[] arr;
    private int size;
    minHeap(int capacity){
        arr = new int[capacity];
        size = 0;
    }
    public void add( int num){

        arr[size++] = num;
         upHeapify(size-1);
    }

    public void upHeapify(int idx ) {

            if(idx == 0 ) return;
        int parent = (idx - 1) / 2;
           if(arr[idx]<arr[parent] ){
               swap( idx, parent);
               upHeapify(parent);
           }

    }
    public int remove(){

        if(size == 0) return -1;
        int peek = arr[0];
        swap(0,size-1);
        size--;
        downHeapify(0);
        return peek;
    }

    public void downHeapify(int i) {

        if(i>=size) return;;
        int lc = 2*i+1;
        int rc = 2*i+2;

        int minIdx = i;

        if (lc<size && arr[lc]<arr[minIdx]) minIdx = lc;

        if (rc<size && arr[rc]<arr[minIdx]) minIdx = rc;
        if(i == minIdx) return;
        swap(i,minIdx);
        downHeapify(minIdx);

    }

    public void swap(int idx, int parent){

        int temp = arr[idx];
        arr[idx] = arr[parent];
        arr[parent] = temp;

    }
    public int size(){
        return size;
    }
    public int peek(){
        if(size == 0){
            System.out.println("heap is empty");
            return -1;
        }
        return arr[0];
    }


}
public class min_Heap_Implementation_by_array {

    public static void main(String[] args) {
        minHeap pq = new minHeap(10);
        pq.add(1);
        pq.add(2);
        pq.add(6);

        System.out.println(pq.peek());
        pq.add(-1);
        System.out.println(pq.peek());
        pq.remove();
        System.out.println(pq.peek());


    }

}
