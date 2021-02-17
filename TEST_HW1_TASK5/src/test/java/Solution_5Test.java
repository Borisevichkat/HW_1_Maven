package epam.training.homework1.task5;

import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

class Solution_5Test {

    @org.junit.jupiter.api.Test
    void isPerfectNum() throws IOException {
        Solution_5 solution_5 = new Solution_5();
        boolean actual = solution_5.isPerfectNum(28);
        assertTrue(actual);
    }
}
