
import java.util.HashMap;

public class CharacterOccurance {
    static HashMap<Character,Integer> charOcc(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        Character value;
        Integer count;
        for (int i = 0; i < str.length(); i++){ // open a hashmap,||actual,count|| actual is where u store string, count is where u r storing frequency
            value =str.charAt(i);               // First check if the value is already if yes then extract key from count and increase count by 1
            if(map.containsKey(value)){         // Put the value to map
                count=map.get(value);
                map.put(value,count+1);
            }else map.put(value,1);
        }return map;
    }
    public static void main(String[] args) {
        String str="Hello ggoo";
        System.out.println(charOcc(str));
    }
}
