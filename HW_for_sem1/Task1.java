//Заполните массив случайными числами и выведите максимальное, минимальное и среднее значение.
//Для генерации случайного числа используйте метод Math.random(), который возвращает значение
// в промежутке [0, 300].


public class Task1 {

    public static void main(String[] args) {
        //       System.out.print(array[i] + " ");
        int[] array = new int[11];
        int i;
        for (i = 0; i < array.length - 1; i++) {
            array[i] = (int) (Math.random() * 300);
            System.out.print(array[i] + " ");
        }

        int max = array[0];
        int min = array[0];
        int midl;
        for (i = 1; i < array.length - 1; i++) {
            if (array[i] > max) max = array[i];
                else if (array[i] < min) min = array[i];
        }
        midl = (max + min)/2;
        System.out.print("\n max = " + max + " min = " + min + " midl = " + midl);
    }
}