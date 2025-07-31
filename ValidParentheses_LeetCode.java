import java.util.Stack;

public class ValidParentheses_LeetCode {
    public static boolean validPara(String str){
        Stack<Character> stk = new Stack<>();
        for(char c : str.toCharArray() ){
            if(c == '(' || c == '{' || c == '[' ){
                stk.push(c);
            } else if (c==')' && !stk.isEmpty() && stk.peek()=='(') {
                stk.pop();
            }else if (c=='}' && !stk.isEmpty() && stk.peek()=='{') {
                stk.pop();
            }else if (c==']' && !stk.isEmpty() && stk.peek()=='[') {
                stk.pop();
            }
        }return stk.empty();
    }

    public static void main(String[] args) {
        String str = "()";
        Boolean result = validPara(str);
        if(result){
            System.out.println("Valid paranthesis");
        }else System.out.println("Not a Valid paranthesis");
    }
}
