public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {1,2,6,5,4,7,8,4};
        int find =7;
        for(int i=0;i<a.length;i++){
            if(find==a[i]){
                System.out.println("The element was found in " +i +"th position");
                break;
            }
        }

    }
}
