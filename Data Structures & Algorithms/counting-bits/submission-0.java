
class Solution {
    public int[] countBits(int n) {
        int[] a = new int[n + 1];

        while (n >= 0) {
            int count = 0;
            int num = n;

            while (num != 0) {
                if ((num & 1) == 1) {
                    count++;
                }
                num >>= 1;
            }

            a[n] = count;
            n--;
        }

        return a;
    }
}
