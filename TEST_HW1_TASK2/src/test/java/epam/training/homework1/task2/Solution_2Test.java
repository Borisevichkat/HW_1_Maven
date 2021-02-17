package epam.training.homework1.task2;

import static org.junit.jupiter.api.Assertions.*;

class Solution_2Test {

    @org.junit.jupiter.api.Test
    void calculateDays() {
        
        Solution_2 solution_2 = new Solution_2();
        int expectedLeapYear = 29;
        int actualLeapYear = solution_2.calculateDays(2020, 2);
        int expected = 28;
        int actual = solution_2.calculateDays(2019, 2);
        assertEquals(expectedLeapYear, actualLeapYear);
        assertEquals(expected, actual);
    }
}