import java.util.HashMap;

public class YT_FrequencyOfChar {
    //frequency of chars
    public static void main(String[] args) {
        String str = "madam";
        char[] sar= str.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for(char s:sar){
            if(map.containsKey(s)){
                map.put(s,(map.get(s)+1));
            }else map.put(s,1);
        }
        System.out.println(map);
    }
}
