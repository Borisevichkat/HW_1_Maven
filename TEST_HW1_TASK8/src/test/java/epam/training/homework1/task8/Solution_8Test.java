package epam.training.homework1.task8;

import static org.junit.jupiter.api.Assertions.*;

class Solution_8Test {

    @org.junit.jupiter.api.Test
    void calculateFunc() {
        Solution_8 solution_8 = new Solution_8();
        double expected =  - 19.0;
        double actual = solution_8.calculateFunc(7);
        assertEquals(expected, actual);
    }
}
