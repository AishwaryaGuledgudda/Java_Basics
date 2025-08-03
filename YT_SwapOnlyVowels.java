public class YT_SwapOnlyVowels {
    //Swap only the vowels in the string
    public static void main(String[] args) {
        String str = "hello";
        char[] car = str.toCharArray();
        int left=0;
        int right= (car.length-1);
        while(left < right){
            if(car[left] != 'a' && car[left] != 'e' && car[left] != 'i' && car[left] != 'o' && car[left] != 'u' ){
                left++;
            } else if(car[right] != 'a' && car[right] != 'e' && car[right] != 'i' && car[right] != 'o' && car[right] != 'u' ){
                right--;
            }else {
                char temp;
                temp=car[left];
                car[left]=car[right];
                car[right]=temp;
                left++;
                right--;
            }

        }
        System.out.println(new String(car));
    }

}
