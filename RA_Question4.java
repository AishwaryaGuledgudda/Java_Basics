import java.util.ArrayList;

public class RA_Question4 {

    //compare two arrays and create a new array when elements matches
    public static void main(String[] args) {
        int[] a ={1,3,4,5,6};
        int[] b ={0,3,6,5,3};
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(a[i]==b[i]){
                al.add(a[i]);
            }
        }
         Object[] c = al.toArray();
        for(Object d : c) {
            System.out.println(d);
        }
    }
}
