
import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                char ch = board[i][j];

                if (ch == '.') {
                    continue;
                }

                String row = ch + " row " + i;
                String col = ch + " col " + j;
                String box = ch + " box " + (i / 3) + "-" + (j / 3);

                if (!set.add(row) ||
                    !set.add(col) ||
                    !set.add(box)) {
                    return false;
                }
            }
        }

        return true;
    }
}
