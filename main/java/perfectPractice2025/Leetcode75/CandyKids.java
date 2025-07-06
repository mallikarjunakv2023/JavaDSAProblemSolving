package perfectPractice2025.Leetcode75;

import java.util.ArrayList;
import java.util.List;

public class CandyKids {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> kids = new ArrayList<>();
        int greatest = 0;
        for (int candi : candies)
            greatest = Math.max(greatest, candi);

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= greatest)
                kids.add(true);
            else
                kids.add(false);
        }
        return kids;
    }
}
