class Solution {
    public int maxProduct(int n) {
        int max1 = -1;
        int max2 = -1;

        // Extract each digit and find the two largest values
        while (n > 0) {
            int digit = n % 10;

            if (digit > max1) {
                max2 = max1; // Current max becomes the second max
                max1 = digit; // Update the highest max
            } else if (digit > max2) {
                max2 = digit; // Update the second highest max
            }
            
            n /= 10; // Move to the next digit
        }

        return max1 * max2;
    }
}