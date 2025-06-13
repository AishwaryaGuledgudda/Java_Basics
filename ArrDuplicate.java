import java.util.HashSet;

public class ArrDuplicate {

    static HashSet<Integer> duplicate(int[] a) {
        HashSet<Integer> dup = new HashSet<>();
        boolean flag=false;
        for(int i=0;i<a.length;i++){
            if(dup.add(a[i])==false){
                System.out.println("The duplicate entry is "+a[i]);
                flag=true;
            }
           // else System.out.println("No duplicate entry");
        }if(flag==false){
            System.out.println("There were no duplicate entry");
        }
        return dup;
    }
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println("The entry is "+duplicate(a));
    }
}
