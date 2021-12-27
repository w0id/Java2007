package course1.homework2;

public class MethodApp {

    public static void main(String[] args) {
        System.out.println(checkMultiplication(5,4));
        checkPositive(-2);
        System.out.println(checkNegative(45));
        printString("Пишем текст %d-й раз", 12);
        System.out.println(checkLeapYear(2021));

    }

    public static boolean checkMultiplication(int n1, int n2) {
        int result = n1 * n2;

        if (result > 10 && result <=20) {
            return true;
        }else{
            return false;
        }
    }

    public static void checkPositive(int number) {
        if (number<0) {
            System.out.println("Число отрицательное");
        }else{
            System.out.println("Число положительное");
        }
    }

    public static boolean checkNegative(int number) {
        if (number < 0) {
            return true;
        }else{
            return false;
        }
    }

    public static void printString(String string, int iteration) {
        for (int i = 0; i < iteration; i++) {
            System.out.printf(string, i + 1);
            System.out.println();
        }
    }

    public static boolean checkLeapYear(int year) {
        switch (year % 100) {
            case 0: {
                if ((year % 400) == 0 ) {
                    return true;
                }
                break;
            }
            default: {
                if ((year % 4) == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
