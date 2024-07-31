package org.olu.katas.persistentbugger;

public class MainPersistentBugger {
    public static int persistentBugger(int num){
        if (num < 10){
            return 0;
        }

        int result = 0;

        while (num > 9) {
            int product = 1;

            char[] intAsCharArray = String.valueOf(num).toCharArray();

            for (char i : intAsCharArray) {
                product *= Character.getNumericValue(i);
            }

            result++;
            num = product;
        }

        return result;
    }
}
