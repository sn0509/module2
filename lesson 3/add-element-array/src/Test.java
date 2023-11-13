public class Test {
    public static void main(String[] args) {
        int number = 27;
        System.out.println(Math.pow(number, (double) 1 /3));
    }

    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min)) + min;
    }
}
