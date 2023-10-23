import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

         String message= "Able was I ere I saw Elba";

        Character[] text1 = new Character[message.length()];

//         for (int i=0; i<text1.length; i++) {
//             text1[i]=message.charAt(i);
//             System.out.print(text1[i] + " ");
//         }

        Queue<Character> convert= new PriorityQueue<>();
        for (int i=message.length()-1; i>0;i--) {
            convert.add(message.charAt(i));
        }
        System.out.println("\n"+convert);

        for (int i=0; i<message.length(); i++) {
            text1[i]=convert.poll();
            System.out.print(text1[i] + " ");
        }


    }
}