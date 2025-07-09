import java.util.Arrays;

public class BinarySearch {
    //element should be sorted else we need to first sort it
    public static void main(String[] args) {
        int[] a = {53, 31, 1, 47, 03, 21, 9};
        int key = 31;
        boolean flag = false;
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        //System.out.println(Arrays.binarySearch(a,47)); //The out put here is the index at which the number is located, if it returns "negative" value then the element is not present
        int l=0,h=a.length-1;

        while(l<=h){
            int mid=(l+h)/2;
            if(a[mid]==key){
                System.out.println("The element " +key+ " is found at " +mid);
                flag=true;
                break;
            }
            if(key>a[mid]){
                l=mid+1;
            }

            if(key<a[mid]){
                h=mid-1;
            }

        } if(flag==false){
            System.out.println("The element is not found");
        }
    }

    }
