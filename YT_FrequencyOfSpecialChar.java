import java.util.HashMap;

public class YT_FrequencyOfSpecialChar {
    // count the special chars in a string
    public static void main(String[] args) {
        String str = "Aabs#@#9 ";
        HashMap<Character,Integer> map = new HashMap<>();
        char[] car = str.toCharArray();
        for(char c:car){
            if(!(Character.isLetterOrDigit(c) || c==' ')){
                if(map.containsKey(c)){
                    map.put(c,(map.get(c)+1));
                }else map.put(c,1);
            }
        }
        System.out.println(map);
    }
}
