import java.util.HashMap;

public class CountDuplicateChar {

    HashMap<Character,Integer> frequencyCounter(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        Character actual;
        Integer count;
        for(int i=0;i<str.length();i++){
            actual = str.charAt(i);
            if(map.containsKey(actual)){
                count=map.get(actual);
                map.put(actual,count+1);
            }
           else map.put(str.charAt(i),1);
        } return map;
    }

    public static void main(String[] args) {
        CountDuplicateChar c = new CountDuplicateChar();
        System.out.println(" The frequescy of the string are"+ c.frequencyCounter("Seller"));
    }
}
