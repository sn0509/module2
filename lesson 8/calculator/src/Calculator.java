public class Calculator {
    public static int calculate(int firstnumber, int secondNumber, char o) {
        final char Add='+';
        final char Sub = '-';
        final char Multi = '*';
        final char Div='/';
        switch (o) {
            case Add:
                return firstnumber + secondNumber;
            case Sub:
                return firstnumber - secondNumber;
            case Multi:
                return firstnumber * secondNumber;
            case Div:
                if (secondNumber != 0)
                    return firstnumber / secondNumber;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
