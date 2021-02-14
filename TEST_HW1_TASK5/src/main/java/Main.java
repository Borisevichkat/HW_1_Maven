package epam.training.test.task5;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int inputInt = Solution_5.readInt("Введите число:");
        System.out.println(Solution_5.isPerfectNum(inputInt));
    }
}