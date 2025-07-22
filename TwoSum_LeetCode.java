import java.util.HashMap;

public class TwoSum_LeetCode {
    public static int[] twoSum(int[] a, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<a.length;i++){
            int value = k-a[i];
            if(map.containsKey(value)){
                return new int[] {map.get(value),i};
            }else  map.put(a[i],i);

        }return new int[] {};
    }


    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        int k = 18;
        int[] result = twoSum(a,k);
        System.out.print(result[0]+ "," +result[1]);


    }
}
