package epam.training.homework1.task1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Solution_1{

    protected static String readValue(String comment) throws IOException {
        System.out.println(comment);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputNumber;
        return inputNumber = reader.readLine();
    }

    protected static int findSquere(String a){
        String lastInputNumber = a.substring(a.length()-1);
        double lastInputNumSquere = Math.pow(Integer.parseInt(lastInputNumber), 2);
        int squaredNumber = (int) lastInputNumSquere;
        return squaredNumber;
    }

    protected static String cutLastNumber(int squaredNumber){
        String squaredNumberStr = Integer.toString(squaredNumber);
        String lastNumber = squaredNumberStr.substring(squaredNumberStr.length()-1);
        return lastNumber;
    }

    protected static void printResult(String result){
        System.out.println(result);
    }
}
