import java.util.Arrays;

public class practice {
    public static void main(String[] args) {
       //factorial();
       //fibonacci();
        //reverseString();
        //isPalindrome();
        //primeNumber();
        //armstrongNumber();
        //countNumOfDigits();
        //sumOfDigits();
        //swapNumbers();
        //HCF();
        //LCM();
        //leapYear();
        //reverseArray();
        //sortArray();//bubble sort
        //arrayVovles();
        sortArrayChar();
    }
    public static void factorial(){
        int n=4;
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial=factorial * i;
        }
        System.out.println(factorial);
    }

    public static void fibonacci(){
        int n=4,a=0,b=1, fib=0;
        System.out.print(a+ " " +b+ " ");

        for(int i=1;i<=n;i++){
            fib=a+b;
            a=b;
            b=fib;
            System.out.print(fib+ " ");
        }

    }

    public static void reverseString(){
        String s1= "game", s2="";
        int slen = s1.length();
        for(int i=slen-1;i>=0;i--){
            s2=s2+s1.charAt(i);
        }
        System.out.println(s2);

    }

    public static void isPalindrome(){
        String s1= "Mum", s2="";

        int slen = s1.length();
        for(int i=slen-1;i>=0;i--){
            s2=s2+s1.charAt(i);
        }
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("palindrome");
        }else System.out.println("not palindrome");

    }

    public static void primeNumber(){
        int n=97;
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("prime");
        }else System.out.println("not prime");
    }

    public static void armstrongNumber() {
        int n=153;
        double arm=0;
        int length = String.valueOf(n).length();
        while (n>0){
            int a=n%10;
            arm=arm+Math.pow(a,length);
            n=n/10;
        }
        System.out.println(arm);
    }

    public static void countNumOfDigits(){
        int n =15456;
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }

    public static void sumOfDigits(){
        int n =15456,temp=0;
        int sum=0;
        while(n!=0){
            temp=n%10;
            sum=sum+temp;
            n=n/10;
        }
        System.out.println(sum);
    }

    public static void swapNumbers(){
        int a=10,b=9,temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("value of a is "+a);
        System.out.println("value of b is "+b);
    }

    public static void HCF(){
        int a=8,b=3,temp;
        while(b!=0){
            temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("The hcf of number are " +a);
    }

    public static void LCM(){
        int a=12,b=18,temp,lcm;
        int al=a,bl=b;
        while (b!=0){
            temp=b;
            b=a%b;
            a=temp;
        }
        lcm= ((al*bl)/a);
        System.out.println("lcm of two numbers are " +lcm);
    }

    public static void leapYear(){
        int year=2021;
        if((year%4==0) && (year%100!=0) || (year%400==0)){
            System.out.println("Leap year");
        }else System.out.println("Not leap year");
    }

    public static void reverseArray(){
        int[] a = {2,3,9,1};
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]);
        }
    }

    public static void  sortArray(){
        int[] a = {5,7,1,0,3};
        //int[] b = new int[a.length];
        int n = a.length;
        //Arrays.sort(a);
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int arr:a){
            System.out.println(arr);
        }
    }

    public static void arrayVovles(){
        String str = "Aishwarya";
        String s=str.toLowerCase();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void sortArrayChar(){
        String s1="keep";
        String s2="peek";
        char[] sa1=s1.toCharArray();
        char[] sa2=s2.toCharArray();
        Arrays.sort(sa1);
        Arrays.sort(sa2);
        boolean result = Arrays.equals(sa1,sa2);
        System.out.println(sa1);
        System.out.println(sa2);
        System.out.println(result);

    }

}
