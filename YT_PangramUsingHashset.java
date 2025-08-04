import java.util.HashSet;

public class YT_PangramUsingHashset {
    // "The quick brown fox jumps over the lazy dog"
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy ^^^";
        boolean result = isPangramSet(str);
        System.out.println(result);
    }

    private static boolean isPangramSet(String str) {
        HashSet<Character> charset = new HashSet<>();
        char[] car = str.toLowerCase().toCharArray();
        for(char c:car){
            if(Character.isLetter(c)){
                charset.add(c);
            }
        }
        System.out.println(charset);
        System.out.println(charset.size());
        return charset.size() == 26;
    }
}
