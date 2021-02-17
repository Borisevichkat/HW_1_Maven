package epam.training.homework1.test4;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int [] array = Solution_4.readInts("Введите числа: ");
        System.out.println(Solution_4.isTwoEvens(Solution_4.countEvens(array)));
    }
}
