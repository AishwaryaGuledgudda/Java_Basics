import java.util.HashMap;

public class DuplicateArray {
    HashMap<Integer,Integer> arrayFrequescyCounter(int[] a){
        HashMap<Integer,Integer> map = new HashMap<>();
        Integer count;
        Integer currentint;
        for(int i=0;i<a.length;i++){
            currentint = a[i];
            if(map.containsKey(currentint)){
                count= map.get(currentint);
                map.put(currentint,count+1);
            } else map.put(currentint,1);
        }return map;
    }

    public static void main(String[] args) {
        DuplicateArray du = new DuplicateArray();
        int[] array={1,2,4,3,4,5,2};
        System.out.println(du.arrayFrequescyCounter(array));
    }

}
