import java.util.HashSet;

public class basic_set {


    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        // Insert TC : O(1)
        set.add(20);
        set.add(200);
        System.out.println(set.size());
        set.add(-8);
        set.add(10);
        // Search TC : O(1)
        System.out.println(set.contains(10));
        // remove TC : O(1)
        System.out.println(set);
        set.remove(10);
        System.out.println(set);

    }
}
