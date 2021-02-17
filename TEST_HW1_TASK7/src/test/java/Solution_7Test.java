package epam.training.homework1.task7;
import java.text.DecimalFormat;
import static org.junit.jupiter.api.Assertions.*;

class Solution_7Test {

    @org.junit.jupiter.api.Test
    void findInterval() {
        Solution_7 solution_7 = new Solution_7();
        DecimalFormat decimalFormat = new DecimalFormat("###.##");
        double actualDouble = solution_7.findInterval(6, 7);
        String actual = decimalFormat.format(actualDouble);
        String expected = "9,22";
        assertEquals(expected, actual);
    }
}
