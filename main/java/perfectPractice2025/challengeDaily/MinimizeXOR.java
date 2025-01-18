package perfectPractice2025.challengeDaily;
//Input: num1 = 3, num2 = 5
//Output: 3
//Explanation:
//The binary representations of num1 and num2 are 0011 and 0101, respectively.
//The integer 3 has the same number of set bits as num2, and the value 3 XOR 3 = 0 is minimal.
public class MinimizeXOR {
    public int minimizeXor(int num1, int num2) {
        int result = 0;

        int targetSetBitsCount = Integer.bitCount(num2);
        int setBitsCount = 0;
        int currentBit = 31; // Start from the most significant bit.

        // While x has fewer set bits than num2
        while (setBitsCount < targetSetBitsCount) {
            // If the current bit of num1 is set or we must set all remaining bits in result
            if (isSet(num1, currentBit) ||
                    (targetSetBitsCount - setBitsCount > currentBit)) {
                result = setBit(result, currentBit);
                setBitsCount++;
            }
            currentBit--; // Move to the next bit.
        }

        return result;
    }

    // Helper function to check if the given bit position in x is set (1).
    private boolean isSet(int x, int bit) {
        return (x & (1 << bit)) != 0;
    }

    // Helper function to set the given bit position in x to 1.
    private int setBit(int x, int bit) {
        return x | (1 << bit);
    }
}
