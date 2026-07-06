import java.util.HashMap;

public class Longest_Substring_With_Without_Repeating_Characters {

    public static void main(String[] args) {

        String s = "pwwkew";
        int i = 0;
        int j = 0;
        int max = 0;
        HashMap<Character,Integer> map = new HashMap<>();

        while(j < s.length()){

            char ele = s.charAt(j);
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            }
            else {
                map.put(ele,1);
            }

            if (map.size() == j-i+1) {
                max = Math.max(max ,j-i+1);

            }
            else if (map.size() < j-i+1) {

                while (map.size() < j-i+1) {

                    char ch = s.charAt(i);
                    map.put(ch, map.get(ch) - 1);
                    if (map.get(ch) == 0) {
                        map.remove(ch);
                    }
                    i++;
                }
            }

            j++;
        }

        System.out.println(max);

    }

}
