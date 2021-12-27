package course1.homework2;

public class MethodApp {

    public static void main(String[] args) {
        System.out.println(checkMultiplication(5,4));
        checkPositive(-2);
        System.out.println(checkNegative(45));
        printString("Пишем текст %d-й раз", 12);
        System.out.println(checkLeapYear(404));
    }

    public static boolean checkMultiplication(int n1, int n2) {
        int result = n1 * n2;
        return result > 10 && result <= 20;
    }

    public static void checkPositive(int number) {
        if (number<0) {
            System.out.println("Число отрицательное");
        }else{
            System.out.println("Число положительное");
        }
    }

    public static boolean checkNegative(int number) {
        return number < 0;
    }

    public static void printString(String string, int iteration) {
        for (int i = 0; i < iteration; i++) {
            System.out.printf(string, i + 1);
            System.out.println();
        }
    }

    public static boolean checkLeapYear(int year) {
        if (year % 100 == 0) {
            return (year % 400) == 0;
        } else {
            return (year % 4) == 0;
        }
    }
}
