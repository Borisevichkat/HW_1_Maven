package epam.training.homework1.task6;
import static org.junit.jupiter.api.Assertions.*;

class Solution_6Test {

    @org.junit.jupiter.api.Test
    void calculateHours() {
        Solution_6 solution_6 = new Solution_6();
        int expected = 1;
        int actual = solution_6.calculateHours(3600);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calculateMinutes() {
        Solution_6 solution_6 = new Solution_6();
        int expected = 1;
        int actual = solution_6.calculateMinutes(3660, 1);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calculateSeconds() {
        Solution_6 solution_6 = new Solution_6();
        int expected = 1;
        int actual = solution_6.calculateSeconds(3661, 1, 1);
        assertEquals(expected, actual);
    }
}
