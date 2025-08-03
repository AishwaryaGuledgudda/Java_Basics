import java.util.HashMap;

public class YT_CountFreqOfCharInString {
    //Count the frequency of the char in a string
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        String str = "madam";
        char[] arr = str.toCharArray();
        for(char i:arr) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
    }
}
