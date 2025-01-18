package perfectPractice2025.challengeDaily;
//Input: derived = [1,1,0]
//Output: true
//Explanation: A valid original array that gives derived is [0,1,0].
//derived[0] = original[0] ⊕ original[1] = 0 ⊕ 1 = 1
//derived[1] = original[1] ⊕ original[2] = 1 ⊕ 0 = 1
//derived[2] = original[2] ⊕ original[0] = 0 ⊕ 0 = 0
public class NeighbourXOR {
    public boolean doesValidArrayExist(int[] derived) {
        int XOR = 0;
        for (int element : derived)
            XOR = XOR ^ element;

        return XOR == 0;
    }
}
