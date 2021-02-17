package epam.training.homework1.task4;

import static org.junit.Assert.*;

public class Solution_4Test {

    @org.junit.Test
    public void isEven() {
        Solution_4 solution_4 = new Solution_4();
        boolean actual = solution_4.isEven(2);
        assertTrue(actual);
    }

    @org.junit.Test
    public void countEvens() {
        Solution_4 solution_4 = new Solution_4();
        long expected = 2;
        int[] array = new int[4];
        array[0] = 2;
        array[1] = 2;
        array[2] = 5;
        array[3] = 7;
        long actual = solution_4.countEvens(array);
        assertEquals(2, actual);
    }

    @org.junit.Test
    public void isTwoEvens() {
        Solution_4 solution_4 = new Solution_4();
        boolean actual = solution_4.isTwoEvens(2);
        assertTrue(actual);
    }
}
