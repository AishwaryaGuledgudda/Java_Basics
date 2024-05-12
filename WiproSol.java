import java.util.Arrays;

public class WiproSol {
    public static void main(String[] args) {
        char[] a = {'c','a','f'};
        char[] b = {'b','e','d'};
        System.out.println(a);
        System.out.println(b);
        char[] c= new char[a.length+b.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[i+a.length]=b[i];
        }
        Arrays.sort(c);
        System.out.println(c);
    }
}
