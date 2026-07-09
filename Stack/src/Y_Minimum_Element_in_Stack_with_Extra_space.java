import java.util.Stack;

public class Y_Minimum_Element_in_Stack_with_Extra_space {

    Stack<Integer> s = new Stack<>();
    Stack<Integer> supportingStack = new Stack<>();

    // Push
    public void push(int a) {

        s.push(a);

        if (supportingStack.size() == 0 || supportingStack.peek() >= a) {
            supportingStack.push(a);
        }
    }

    // Pop
    public int pop() {

        if (s.size() == 0) {
            return -1;
        }

        int ans = s.peek();
        s.pop();

        if (supportingStack.size() > 0 && supportingStack.peek() == ans) {
            supportingStack.pop();
        }

        return ans;
    }

    // Get Minimum
    public int getmin() {

        if (supportingStack.size() == 0) {
            return -1;
        }

        return supportingStack.peek();
    }

    public static void main(String[] args) {

        Y_Minimum_Element_in_Stack_with_Extra_space obj =
                new Y_Minimum_Element_in_Stack_with_Extra_space();

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