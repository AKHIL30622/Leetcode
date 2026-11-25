
class Solution {
    public int maxLength(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            long prod = 1;
            int g = 0;
            int l = 1;

            for (int j = i; j < nums.length; j++) {
                prod *= nums[j];

                g = gcd(g, nums[j]);
                l = lcm(l, nums[j]);

                if (prod == (long) g * l) {
                    max = Math.max(max, j - i + 1);
                }

                if (prod > 25200) {
                    break;
                }
            }
        }

        return max;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}
