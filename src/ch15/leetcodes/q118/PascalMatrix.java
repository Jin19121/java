package ch15.leetcodes.q118;

import java.util.ArrayList;
import java.util.List;

public class PascalMatrix {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        pascal.add(new ArrayList<>());
        pascal.get(0).add(1);

        if (numRows == 1) {
            return pascal;
        }

        pascal.add(new ArrayList<>());
        pascal.get(1).add(1);
        pascal.get(1).add(1);

        for (int row = 3; row <= numRows; row++) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);

            for (int i = 0; i < row - 1; i++) {
                newRow.add(pascal.get(row - 2).get(i - 1) + pascal.get(row - 2).get(i));
            }

            newRow.add(1);
            pascal.add(newRow);
        }

        return pascal;
    }
}
