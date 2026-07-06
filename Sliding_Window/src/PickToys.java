    import java.util.HashMap;

    public class PickToys {

        public static void main(String[] args) {

            String s = "abaccbbbcab";
            int i = 0;
            int j = 0;
            int max = 0;
            HashMap<Character, Integer> map =  new HashMap<>();
            while(j<s.length()){

                char ele = s.charAt(j);
                if(map.containsKey(ele)){
                    map.put(ele,map.get(ele)+1);
                }
                else {
                    map.put(ele,1);
                }
                    if(map.size() < 2){

                    }
                    else if (map.size() == 2) {
                        max = Math.max(max,j-i+1);

                    }
                    else {

                        while (map.size()>2){

                            char ch = s.charAt(i);
                            map.put(ch, map.get(ch)-1);
                            if(map.get(ch) == 0){
                                map.remove(ch);
                            }
                            i++;
                        }
                    }
                    if(map.size() == 2){
                        max = Math.max(max,j-i+1);
                    }
                            j++;
            }

            System.out.println(max);

        }

    }
