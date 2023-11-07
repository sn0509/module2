public class Test {
    public static void main(String[] args) {
        int[] numbers = { 55, 64, 75, 80, 65 };

        // declare new array of the same size
        int size = numbers.length;
        int[] newNumbers = new int[size - 1];
        System.arraycopy(numbers, 1, newNumbers, 0, size - 1 );
        for (int newNumber : newNumbers) {
            System.out.println(newNumber);
        }
    }
}
