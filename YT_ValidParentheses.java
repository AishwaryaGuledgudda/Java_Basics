import java.util.Stack;

public class YT_ValidParentheses {
    public static boolean isValidPara(String str) {
        Stack<Character> stk = new Stack<>();
        char[] car = str.toCharArray();
        for(char c: car){
            if(c=='('){
                stk.push(c);
            } else{
                if(c==')'){
                    if(stk.isEmpty()){
                        return false;
                    }else {
                        char topchar = stk.pop();
                        if(topchar!=')'){
                            return false;
                        }
                    }
                }
            }
        }return stk.isEmpty();

    }

    public static void main(String[] args) {
        String str = "())";
        boolean results = isValidPara(str);
        if(results){
            System.out.println("valid");
        }else System.out.println("invalid");
    }
}
