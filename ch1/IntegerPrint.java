public class IntegerPrint {

    public static void integerPrint(int i) {
        System.out.println("as binary: " + Integer.toBinaryString(i));
        System.out.println("as octal: " + Integer.toOctalString(i));
        System.out.println("as hexadecimal: " + Integer.toHexString(i));
        System.out.println("reciprocal as hexadecimal: " + Double.toHexString(1/((double) i)));
    }

    public static void main(String args[]) {
        for (String i : args) {
            try {
                integerPrint(Integer.parseInt(i));
            } catch (NumberFormatException e) {
                System.out.println("Please enter only integers.");
            }
        }
    }
}
