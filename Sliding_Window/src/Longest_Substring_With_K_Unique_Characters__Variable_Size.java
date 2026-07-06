import java.util.HashMap;

public class Longest_Substring_With_K_Unique_Characters__Variable_Size {

    public static void main(String[] args) {

        String s = "aabacbebebe";
        int k = 3;
        int i = 0;
        int j = 0;
        int max = 0;
        HashMap <Character,Integer> map = new HashMap<>();

        while(j<s.length()){

                char ele = s.charAt(j);
                if(map.containsKey(ele)){
                    map.put(ele,map.get(ele)+1);
                }
                else {
                    map.put(ele,1);
                }

            if(map.size() < k){
                j++;
            }
            else if(map.size() == k){
                max = Math.max(max,j-i+1);
                j++;
            }
            else if(map.size() > k ){

                while(map.size()>k){

                    char ch = s.charAt(i);
                    map.put(ch , map.get(ch)-1);
                    if(map.get(ch) == 0){
                        map.remove(ch);
                    }
                    i++;
                }

                    j++;
            }
        }
        System.out.println(max);
    }

}
