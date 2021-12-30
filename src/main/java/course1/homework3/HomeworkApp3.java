package course1.homework3;
import java.util.Arrays;
import java.util.Random;


public class HomeworkApp3 {

    public static void main(String[] args) {
        /*
          1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
          С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */
        reverseArrayItems();
        System.out.println();
        /*
          2. Задать пустой целочисленный массив длиной 100.
          С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
         */
        hundredItemsArray();
        System.out.println();
        /*
          3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
         */
        multiplicateArrayItems();
        System.out.println();
        /*
         * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
         * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
         * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
         * то есть [0][0], [1][1], [2][2], …, [n][n];
         */
        drawCross();
        System.out.println();
        /*
         * 5. Написать метод, принимающий на вход два аргумента: len и initialValue,
         * и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
         */
        fillArray(10, 7);
        System.out.println();
        /*
         * 6. * Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
         */
        maxnminArrayItems();
        System.out.println();
        /*
         * 7. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
         * метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
         */
        Random random = new Random();
        int[] summArray = random.ints(10,0, 15).toArray();
        System.out.println(Arrays.toString(summArray));
        System.out.println(arrayItemsSymmetrySumm(summArray));
    }

    public static void reverseArrayItems() {
        Random random = new Random();
        int[] array = random.ints(5, 0,2).toArray();
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length; i++) {
            array[i] = array[i] ^ 1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void hundredItemsArray() {
        int[] array = new int[100];
        for(int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void multiplicateArrayItems(){
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < array.length; i++) {
//            array[i] = array[i] < 6 ? array[i] * 2 : array[i];
            if(array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void drawCross() {
        int[][] array = new int[5][5];
        for(int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][array[i].length-1-i] = 1;
            System.out.println(Arrays.toString(array[i]));
        }
    }

    public static void fillArray(int len, int initialValue) {
        int[] array = new int[len];
        Arrays.fill(array,initialValue);
        System.out.println(Arrays.toString(array));
    }

    public  static void maxnminArrayItems() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Минимальный элемент: " + Arrays.stream(array).min().getAsInt());
        System.out.println("Максимальный элемент: " + Arrays.stream(array).max().getAsInt());
    }

    public static boolean arrayItemsSymmetrySumm(int[] array) {
        int leftIndex = 0;
        int rightIndex = 0;
        int left = array[leftIndex];
        int right = array[array.length - 1 - rightIndex];
        for (int item:array) {
            if (left > right) {
                rightIndex++;
                right += array[array.length - 1 - rightIndex];
            } else if (left < right){
                leftIndex++;
                left += array[leftIndex];
            } else {
                return true;
            }
            if(leftIndex == array.length - 1 - rightIndex){
                break;
            }
        }
        return false;
    }
}
