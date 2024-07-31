package org.olu.katas.sumofpositives;

public class MainSumOfPositives {
    public static int sumOfPositives(int[] inputNumbers) {
        int result = 0;
        for (int i: inputNumbers) {
            if (i > 0){
                result += i;
            }
        }
        return result;
    }
}
