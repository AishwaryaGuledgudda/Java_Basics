public class RS_Question1 {
    //Create a method that accepts array and returns sum off all the elements in the array
    public int sumOfArray(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = {1,3,2,5,3};
        RS_Question1 rs = new RS_Question1();
        System.out.println(rs.sumOfArray(a));
    }
}

