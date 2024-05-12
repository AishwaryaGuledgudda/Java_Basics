import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] a={12,75,34,89,89,89,66};
        int largest= 0;
        int slargest = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]>largest){
                slargest=largest;
                largest=a[i];
            } else if (a[i]==largest) { //when there are two large numbers
                largest=a[i];
            } else if (a[i]> slargest) {
                slargest=a[i];
            }
        }
        System.out.println(largest);
        System.out.println(slargest);

    }

}
