// Пусть дан произвольный список целых чисел
// Нужно удалить из него четные числа
// public List<Integer> removeEvenValue(List<Integer> list){

//     return new ArrayList<>();
// }

// // Найти минимальное значение
// public Integer getMin(List<Integer> list){

//     return 0;
// }

// // Найти максимальное значение
// public Integer getMax(List<Integer> list){

//     return 0;
// }

// // Найти среднее значение
// public Integer getAverage(List<Integer> list){

//     return 0;
// }
// }



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Task01 {
    public static void main(String[] args) {
        int[] array = new int[] { 3, 5, 24, 8, 6, 20, 15, 38, 41, 73 };
        System.out.print(array);
        removeEvenValue(array);
        // System.out.print(array);
    }

    public static void removeEvenValue(array){
        ArrayList<Integer> listNew = new ArrayList<>(array);
        int j = 0;
        for (int i:listNew) {
            if(listNew[i]/2==0) {
                listNew.remove(listNew[i]);
            }
            System.out.print(listNew[i] + " ");
            return listNew;
        }
    }
}