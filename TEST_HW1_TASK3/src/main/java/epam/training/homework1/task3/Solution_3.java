package epam.training.homework1.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_3 {

    protected static int readInt(String comment) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(comment);
        String inputVal = reader.readLine();
        return Integer.parseInt(inputVal);
    }

    protected static int calculateSmallSquere(int bigSquere){
        double diametr = Math.sqrt(bigSquere);
        double smallSquereDouble = Math.pow(diametr, 2) / 2;
        int smallSquere = (int) smallSquereDouble;
        return smallSquere;

    }

    protected static int calculateRatio(int bigSquere, int smallSquere) {
        int ratio = bigSquere / smallSquere;
        return ratio;
    }

    protected static void printResult(int ratio){
        System.out.println(ratio);
    }
}