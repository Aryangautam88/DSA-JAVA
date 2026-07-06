
class SinglyLL{
Node head;
Node tail;
int size;

void insertAtEnd(int val){
    Node temp = new Node(val);
    if(head == null) head = tail = temp;
    else{
        tail.next = temp;
        tail = temp;
    }
    size++;
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
void insertAtHead(int val){
    Node temp = new Node(val);
    if(head == null) head = tail = temp;
    else{
        temp.next = head;
        head = temp ;
    }
    size++;
}

void display() {

    Node temp = head;
    while (temp != null){
        System.out.print(temp.val+" ");
        temp = temp.next;
    }
    System.out.println();
}


}

public class Insert_element {

    public static void main(String[] args) {

        SinglyLL list = new SinglyLL();
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.insertAtHead(10);
        list.display();
        list.insert(0   ,49);
        list.display();
    }

}
