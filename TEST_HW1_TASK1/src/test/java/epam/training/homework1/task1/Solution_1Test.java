package epam.training.homework1.task1;

import static org.junit.jupiter.api.Assertions.*;

class Solution_1Test {

    @org.junit.jupiter.api.Test
    void findSquere() {
        Solution_1 solution_1 = new Solution_1();
        int actual = solution_1.findSquere("22");
        int expected = 4;
        assertEquals(expected,  actual);
    }

    @org.junit.jupiter.api.Test
    void cutLastNumber() {
        Solution_1 solution_1 = new Solution_1();
        String expected = "4";
        String actual = solution_1.cutLastNumber(44);
        assertEquals(expected,  actual);
    }
}