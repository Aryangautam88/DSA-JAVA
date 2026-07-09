import java.util.Stack;

public class Y_Minimum_Element_in_Stack_in_Oone_Space {
    Stack<Integer> s = new Stack<>();
    int minele;

    public void push(int a){
        if( s.size()== 0 ){
            s.push(a);
            minele = a;
        }
        else if(a>=minele){
                s.push(a);
            }
        else {
                s.push(2*a-minele);
                minele = a;

        }

    }
    public int pop(){
        if(s.size() == 0){
            return -1;
        }

        if(s.peek() >= minele){

            int ans = s.peek();
            s.pop();

            return ans;
        }
        else {
            int ans = minele;
                minele = 2*minele - s.peek();
                s.pop();
                return ans;
            }


    }

    public int getmin(){

        if(s.size() == 0){
            return -1;
        }
        return minele;
    }

    public static void main(String[] args) {

        Y_Minimum_Element_in_Stack_in_Oone_Space obj = new Y_Minimum_Element_in_Stack_in_Oone_Space();

        obj.push(18);
        obj.push(19);
        obj.push(29);
        obj.push(15);
        obj.push(16);

        System.out.println("Minimum : " + obj.getmin());

        System.out.println("Popped : " + obj.pop());
        System.out.println("Minimum : " + obj.getmin());

        System.out.println("Popped : " + obj.pop());
        System.out.println("Minimum : " + obj.getmin());

        System.out.println("Popped : " + obj.pop());
        System.out.println("Minimum : " + obj.getmin());
    }

}
