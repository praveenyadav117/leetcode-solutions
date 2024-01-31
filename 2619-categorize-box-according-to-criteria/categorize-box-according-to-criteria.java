public class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean bulky = false;

        // In Java, use long instead of long long
        long product = (long)length * width * height;

        if (length >= 10000 || width >= 10000 || height >= 10000 || product >= 1000000000) {
            bulky = true;
        }

        boolean heavy = false;

        if (mass >= 100) {
            heavy = true;
        }

        if (bulky && heavy) {
            return "Both";
        } else if (!bulky && !heavy) {
            return "Neither";
        } else if (bulky) {
            return "Bulky";
        } else {
            return "Heavy";
        }
    }
}