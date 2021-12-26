package course1.lesson2;

public class CycleApp {

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {

            if (i % 2 == 0){
                continue;
            }
            if (i > 6) {
                break;
            }
            PrintUtil.printFormatted("string " + i);
        }
        System.out.println(getDevidedByThree());

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i=" + i + " j = " + j);
        }

        for (int i = 0; i < 5; i++ ) {
            for (int j =0; j < 5; j++) {
                System.out.println("i = " + i + " j = " + j);
            }
        }
    }

    public static int getDevidedByThree() {

        for (int i = 2; i < 10; i = i + 2) {
            if (i % 3 == 0 ) {
                return i;
            }
        }
        return 0;
    }
}
