// Реализуйте алгоритм сортировки пузырьком для сортировки массива.

import java.util.Arrays;


public class Task2 {

    public static void main(String[] args) {
        int[] array = new int[10];
        int i;
        for (i = 0; i < array.length; i++)
            array[i] = (int) (Math.random() * 300);

        System.out.print("Первоначальный массив:\n" + Arrays.toString(array));

        int temp;
        boolean isFlag = false;
        while(!isFlag) {
            isFlag = true;
            for (i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i+1]) {
                    isFlag = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println("\nФинальный массив:\n" + Arrays.toString(array));
    }
}
