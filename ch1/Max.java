import java.lang.Math;

public class Max {

    public static int conMax(int i1, int i2, int i3) {
        if (i1 > i2 && i1 > i3) {
            return i1;
        } else if (i2 > i3) {
            return i2;
        }
        return i3;
    }

    public static int mathMax(int i1, int i2, int i3) {
        return Math.max(i1, Math.max(i2, i3));
    }

    private static void test(int i1, int i2, int i3) {
        System.out.println(conMax(i1, i2, i3));
        System.out.println(mathMax(i1, i2, i3));
    }

    public static void main(String args[]) {
        for (String s : args) {
            String[] a = s.split(" ");
            try {
                test(Integer.parseInt(a[0]), Integer.parseInt(a[1]), Integer.parseInt(a[2]));
            } catch (NumberFormatException e) {
                System.out.println("Only enter strings of 3 numbers with spaces separating them.");
            }
        }
    }
}
