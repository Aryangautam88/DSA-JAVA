import java.util.HashMap;

public class Count_Occurrences_Of_Anagrams {

    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        String s = "forxodorfyzrofor";
        String ptr = "for";
        int k = ptr.length();
        int i = 0;
        int j = 0;
        int n = s.length();
        int ans = 0;


        for(char ele : ptr.toCharArray()){

            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele , freq+1);
            }
            else{
                map.put(ele,1);
            }
        }
        int count = map.size();
        while (j<n){

            char ch = s.charAt(j);

            if(map.containsKey(ch)){
                int freq = map.get(ch);
                map.put(ch, freq-1);

                if(map.get(ch) == 0){
                    count--;
                }
            }

            if(j-i+1<k){
                j++;
            }
            else if(j-i+1 == k) {
                if (count == 0) {
                    ans++;
                }

                char left = s.charAt(i);

                if (map.containsKey(left)) {

                    map.put(left, map.get(left) + 1);

                    if (map.get(left) == 1) {
                        count++;
                    }
                }

                i++;
                j++;

            }
        }

        System.out.println(ans);

    }
}
