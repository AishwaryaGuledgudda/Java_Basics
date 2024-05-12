import java.util.Arrays;

public class Anagram {
    void isAnagram(String S1, String S2) {
        //Clean input by removing spaces
        //change the case to lowercase
        //convert them to char array
        //sort them
        // compare the sorted array
        Boolean anagram=true;
        String dupS1 = S1.replaceAll("\\s","");
        String dupS2 = S2.replaceAll("\\s","");
        if(dupS1.length()!=dupS2.length()){
            anagram=false;
        }
        else {
            char[] c1 = dupS1.toLowerCase().toCharArray();
            char[] c2 = dupS2.toLowerCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            anagram= Arrays.equals(c1,c2);
        }
        System.out.println(anagram);

    }

    public static void main(String[] args) {
        Anagram an = new Anagram();
        an.isAnagram("keep","peek");
    }
}
