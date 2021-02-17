package epam.training.homework1.task1;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String inputNumber = Solution_1.readValue("Введите число: ");
        int inputSquare = Solution_1.findSquere(inputNumber);
        String lastNumber = Solution_1.cutLastNumber(inputSquare);
        Solution_1.printResult(lastNumber);
    }
}