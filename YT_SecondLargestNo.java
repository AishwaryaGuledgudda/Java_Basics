public class YT_SecondLargestNo {
    //Find the second largest number in an array
    public static void main(String[] args) {
        int[] a = {1,2,4,7,8,8,2};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i : a){
            if(i>largest){
                secondLargest=largest;
                largest=i;
            }else if(i>secondLargest && i!=largest){
                secondLargest=i;
            }
        }
        System.out.println("Largest num is " +largest);
        System.out.println("second largest num is " +secondLargest);
    }
}
