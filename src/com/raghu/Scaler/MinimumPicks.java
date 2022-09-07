package com.raghu.Scaler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumPicks {

    public static void main ( String[] args ) {

        System.out.println(solve(Arrays.asList(5, 17, 100, 1)));
    }

    public static int solve ( List<Integer> A ) {
        int max_Int=Integer.MIN_VALUE;
        int min_Odd=Integer.MAX_VALUE;
        for (int i=0;i<A.size();i++) {
            if (A.get(i) % 2 == 0) {
                if (max_Int < A.get(i))
                    max_Int = A.get(i);
            }
            else {
                if (min_Odd > A.get(i))
                    min_Odd = A.get(i);
            }
        }
        return (max_Int - min_Odd);

    }
}
