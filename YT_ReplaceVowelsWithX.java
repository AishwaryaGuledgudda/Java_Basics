public class YT_ReplaceVowelsWithX {
    //Replace all the vowels in a string with x
    public static void main(String[] args) {
        String str = "Name";
        String lowerstr = str.toLowerCase();
        char[] car = lowerstr.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c :car){
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                sb.append('x');
            }else sb.append(c);
        }System.out.println(sb);

    }
}
