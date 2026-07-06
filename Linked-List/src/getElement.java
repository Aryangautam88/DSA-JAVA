
    class Search{
        Node head;
        Node tail;
        int size;

        void display() {

            Node temp = head;
            while (temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }

        void insert(int idx,int val){

            if(idx == 0) {
                insertAtHead(val);
                return;
            }
            if(idx== size){
                insertAtEnd(val);
                return;
            }
            if(idx>size || idx >0){
                System.out.println("invalid index");
                return;
            }

            Node temp = new Node(val);
            Node x = head;
            for(int i = 0 ;i < idx-1 ; i++){
                x = x.next;
            }
            temp.next =x.next;
            x.next = temp;
            size++;
        }

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null) head = tail = temp;
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head == null) head = tail = temp;
            else{
                temp.next = head;
                head = temp ;
            }
            size++;
        }

        int get(int idx){

            if(idx>size){
                System.out.print("invalid index"+" ");
                return -1;
            }

            Node x = head;
            for (int i = 0;i<idx;i++){
                x = x.next;
            }
            return x.val;
        }

        void set(int idx,int val){

            if(idx>size){
                System.out.print("invalid index");
            }

            Node x = head;
            for (int i = 0;i<idx;i++){
                x = x.next;
            }
            x.val = val;
        }

        void deleteAtHead (){

            if(head == null) System.out.println("no element");
            Node temp = head;
            head = head.next;
            size--;
        }

        void delete (int idx){
            if(head == null) System.out.println("no element");
            Node x = head;
            for(int i = 0;i<idx-1;i++){
                x = x.next;
            }
            if(x.next == tail ) tail=x;
            x.next = x.next.next;
            size--;
        }



    }
    public class getElement {

        public static void main(String[] args) {

            Search list = new Search();

            list.insertAtEnd(20);
            list.insertAtEnd(30);
            list.insertAtEnd(40);
            list.insertAtEnd(50);
            list.insertAtHead(10);
            list.display();
//            list.insert(0   ,49);
//            list.display();

//            System.out.println(list.get(5));
//            list.set(2,5);
//            list.display();

            list.deleteAtHead();
            list.display();
            list.delete(3);
            list.display();
            System.out.println(list.tail.val);

        }

    }
