package epam.training.homework1.task10;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class Solution_10Test {

    @org.junit.jupiter.api.Test
    void createTable() {
        Solution_10 solution_10 = new Solution_10();

        Map<Integer, Double> expected = new HashMap<>();
        expected.put(10, 0.6483608274590866);
        expected.put(15, -0.8559934009085187);
        expected.put(20, 2.237160944224742);
        expected.put(25, -0.13352640702153587);
        Map<Integer, Double> actual = solution_10.createTable(10, 25, 5);
        assertEquals(actual, expected);
        assertEquals(4, actual.size());
    }
}