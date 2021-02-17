package epam.training.homework1.task3;

import static org.junit.jupiter.api.Assertions.*;

class Solution_3Test {

    @org.junit.jupiter.api.Test
    void calculateSmallSquere() {
        Solution_3 solution_3 = new Solution_3();
        int expected = 10;
        int actual = solution_3.calculateSmallSquere(20);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calculateRatio() {
        Solution_3 solution_3 = new Solution_3();
        int expected = 2;
        int actual = solution_3.calculateRatio(20, 10);
        assertEquals(expected, actual);
    }
}