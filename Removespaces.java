public class Removespaces {
    public static void main(String[] args) {
        String stringWithSpace = "    Hello    World   ";
        String afterString ="";
        System.out.println(stringWithSpace);
        for (int i=0; i<stringWithSpace.length();i++){
            if(stringWithSpace.charAt(i) != ' ' && stringWithSpace.charAt(i)!='\t'){
                afterString= afterString + stringWithSpace.charAt(i);
            }
        }
        System.out.println(afterString);
    }
}
