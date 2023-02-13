package HW_for_sem3;
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

public class Task01 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(3, 5, 4, 7, 6, 15, 1, 8, 9, 14));
        System.out.println(array);
        System.out.println(removeEvenValue(array));
        getMin(array);
        getMax(array);
        getAverage(array);
    }

    public static List<Integer> removeEvenValue(List<Integer>array){
        ArrayList<Integer> listNew = new ArrayList<>(array);
        for (int i = 0; i < listNew.size(); i++) {
            if (listNew.get(i) % 2 == 0) {
                listNew.remove(i);
            }
        }
        return listNew;
    }

    public static Integer getMin(List<Integer> array){
        ArrayList<Integer> listMin = new ArrayList<>(array);
        int znachMin = listMin.get(0);
        for (int i = 1; i < listMin.size(); i++) {
            if (listMin.get(i) < znachMin) {
                znachMin = listMin.get(i);
            }
        }
        System.out.printf("Min = ");
        System.out.println(znachMin);
        return 0;
    }
    public static Integer getMax(List<Integer> array) {
        ArrayList<Integer> listMax = new ArrayList<>(array);
        int znachMax = listMax.get(0);
        for (int i = 1; i < listMax.size(); i++) {
            if (listMax.get(i) > znachMax) {
                znachMax = listMax.get(i);
            }
        }
        System.out.printf("Max = ");
        System.out.println(znachMax);
        return 0;
    }

    public static Integer getAverage(List<Integer> array) {
        ArrayList<Integer> listMidl = new ArrayList<>(array);
        double znachMidl = 0;
        for (int i = 0; i < listMidl.size(); i++) {
            znachMidl += listMidl.get(i);
        }
        System.out.printf("Middle = ");
        System.out.println(znachMidl / listMidl.size());
        return 0;
    }
}