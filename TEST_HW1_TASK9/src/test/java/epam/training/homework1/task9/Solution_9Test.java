package epam.training.homework1.task9;
import java.text.DecimalFormat;
import static org.junit.jupiter.api.Assertions.*;

class Solution_9Test {

    @org.junit.jupiter.api.Test
    void calculateCircumference() {
        Solution_9 solution_9 = new Solution_9();
        DecimalFormat decimalFormat = new DecimalFormat("###.##");
        double actualDouble = solution_9.calculateCircumference(10);
        String actual = decimalFormat.format(actualDouble);
        String expected = "62,83";
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void calculateArea() {
        Solution_9 solution_9 = new Solution_9();
        DecimalFormat decimalFormat = new DecimalFormat("###.##");
        double actualDouble = solution_9.calculateArea(10);
        String actual = decimalFormat.format(actualDouble);
        String expected = "314,16";
        assertEquals(expected, actual);
    }
}