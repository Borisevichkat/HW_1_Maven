package epam.training.homework1.task3;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int bigSquare = Solution_3.readInt("Введите площадь первого квадрата: ");
        int smallSquere = Solution_3.calculateSmallSquere(bigSquare);
        int ratio = Solution_3.calculateRatio(bigSquare, smallSquere);
        Solution_3.printResult(ratio);
    }
}
