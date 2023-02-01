// Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
// Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.List;
import java.util.ArrayList;


public class Task3 {
    public static void main(String[] args) {
        int[] array = IntStream.rangeClosed(2, 100).toArray();
        //List<Integer> finalArray = new ArrayList<>(Arrays.asList())
        int[] finalArray = new int[array.length];
        finalArray[0] = array[0];
        finalArray[1] = array[1];
        finalArray[2] = array[3];
        finalArray[3] = array[5];
        int i = 7;
        int j = 4;
        while(j < i) {
            for(i = 7; i < array.length-8; i+=2) {
                if(array[i] % 3 != 0 || array[i] % 5 != 0 ||
                        array[i] % 7 != 0 && array[i] % (i+2) == 0) {
                finalArray[j] = array[i];
                j += 1;
                }
           }
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(finalArray));
    }
}