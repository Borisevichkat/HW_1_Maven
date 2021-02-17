package epam.training.homework1.test4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_4{

    protected static int[] readInts(String comment) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(comment);
        int[] array = new int[4];
        for(int i = 0; i < 4; i++){
            String inputInt = reader.readLine();
            int a = Integer.parseInt(inputInt);
            array[i] = a;
        }
        return array;
    }

    protected static boolean isEven(int a){
        return a%2 == 0;
    }

    protected static int countEvens(int[] arr){
        int count = 0;
        for(int i : arr){
            if(isEven(i)){
                count++;
            }
        }
        return count;
    }

    protected static boolean isTwoEvens(int count){
        return count >= 2;
    }

}
