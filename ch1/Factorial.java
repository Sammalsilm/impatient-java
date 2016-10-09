import java.math.BigInteger;

public class Factorial {

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        for (String s : args) {
            try {
                System.out.println(factorial(Integer.parseInt(s)));
            } catch (NumberFormatException e) {
                System.out.println("Enter integers only.");
            }
        }
    }
}
