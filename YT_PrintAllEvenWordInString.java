public class YT_PrintAllEvenWordInString {

    public static void main(String[] args) {
        String str = "Sky is blue and vast";
        String[] arr = str.split(" ");

        for(int i=0;i<arr.length;i++){
            int length = arr[i].length();
            if(length%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}
