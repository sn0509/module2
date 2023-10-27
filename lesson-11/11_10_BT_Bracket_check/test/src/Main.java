import java.util.Stack;
public class Main {
    public static void main(String[] args) {


        boolean result = false;
        Stack<Character> lstack = new Stack<>();
        Stack<Character> rstack = new Stack<>();

        String text = "(– b + (b2 – 4*a*c)^0.5) / 2*a";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '(') {
                lstack.add(text.charAt(i));
            } else if (text.charAt(i) == ')') {
                rstack.add(text.charAt(i));
                if (isBracket(lstack, rstack)) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }

        }
        if (result) {
            System.out.println("Well");
        } else {
            System.out.println("???");
        }
    }
        public static boolean isBracket(Stack<Character> lstack,Stack<Character> rstack) {
            return lstack.size() == rstack.size();
        }
}
