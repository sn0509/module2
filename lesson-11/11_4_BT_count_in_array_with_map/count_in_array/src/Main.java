import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int count=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some thing you want to check here: ");

        String string= scanner.nextLine();
        String newString= string.toLowerCase();

        Map<Character,Integer>list=new HashMap<>();

        for(int i =0; i<newString.length();i++){
            for(int j=0;j < newString.length();j++){
                if(list.isEmpty()){
                    list.put(newString.charAt(j),count);
                } else if(newString.charAt(j)==list.keySet(i)){

                }
            }
        }

    }
}