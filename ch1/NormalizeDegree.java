public class NormalizeDegree {

    public static int normalizeDegreeMod(int degree) {
        if (degree >= 0) {
            return degree % 360;
        } else {
            return degree % 360 + 360;
        }
    }

    public static int normalizeDegreeFloor(int degree) {
        return Math.floorMod(degree, 360);
    }

    public static void test(int i) {
        System.out.println("i: " + i + " Mod: " + normalizeDegreeMod(i));
        System.out.println("i: " + i + " Mod: " + normalizeDegreeFloor(i));
    }

    public static void main(String args[]) {
        for (String s : args) {
            try {
                test(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                throw new RuntimeException();
            }
        }
    }
}
