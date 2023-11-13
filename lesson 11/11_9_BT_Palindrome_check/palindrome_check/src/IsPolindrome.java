public class IsPolindrome {


    static boolean polindromeCheck(String message) {
        String message2= message.toLowerCase();


        int tail=message2.length()-1;
        for (int i=0; i<message2.length()/2; i++) {
            if(message2.charAt(i) != message2.charAt(tail-i)){
                return false;
            }
        }
        return true;
    }
}

