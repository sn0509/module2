import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        int[] numbers=new int[5];

        System.out.println("Before reverse: ");

        for(int i=0; i<numbers.length; i++){
            numbers[i] = (int)(Math.random()*100);
            stack.push(numbers[i]);
            System.out.println(numbers[i]);
        }

        System.out.println("After reverse: ");
        for(int i=numbers.length-1; i>=0; i--){
            numbers[i] = stack.pop();
            System.out.println(numbers[i]);
        }


    }
}