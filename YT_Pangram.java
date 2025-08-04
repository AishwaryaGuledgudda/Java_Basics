public class YT_Pangram {
    // "The quick brown fox jumps over the lazy dog"
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        str =str.toLowerCase();
        boolean result =  isPangram(str);
        if(result){
            System.out.println("Its a Pangram");
        }else System.out.println("Its not a pangram");
    }

    private static boolean isPangram(String str) {
        if(str.length()<26){
            return false;
        }
        for(char i = 'a'; i<='z';i++){
            if(str.indexOf(i)<0){
                return false;
            }
        }return true;
    }
}
