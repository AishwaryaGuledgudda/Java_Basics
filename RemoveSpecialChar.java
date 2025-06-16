public class RemoveSpecialChar {
    public static void main(String[] args) {
        String s = "%&^%#% hel&^%&oo *(&*0088727";
        String s1 = s.replaceAll("[^a-zA-Z0-9 ]","");
        System.out.println(s1);
    }
}
