package course1.homework4;

import java.util.*;
import java.lang.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrossesZeroesApp {

    //Поле
    public static char[][] map;

    //Размер поля
    public static final int SIZE = 5;

    //Точек для победы
    public static final int DOTS_TO_WIN = 4;

    //Описание точек
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    //Сканер
    public static final Scanner SCANNER = new Scanner(System.in);

    //рандом
    public static final Random RANDOM = new Random();

    /**
     * Проинициализировать поле
     */
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (char[] cells : map) {
            Arrays.fill(cells, DOT_EMPTY);
        }
    }

    /**
     * вывод игрового поля на экран
     */
    public static void printMap() {
        //Нумеруем верхний ряд
        for (int i = 0; i <= map.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        //пишем строим мапы
        for (int i = 0; i < map.length; i++) {
            //выводим номер строки
            System.out.print((i + 1) + " ");
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Ход человека
     */
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    /**
     * Ход робота
     */
    public static void aiTurn() {
        int x, y;
        do {
            x = RANDOM.nextInt(SIZE);
            y = RANDOM.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Робот делает ход в " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    /**
     * Проверка валидны ли значения поля
     * @param x координата X
     * @param y координата Y
     * @return да/нет
     */
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        return map[y][x] == DOT_EMPTY;
    }

    /**
     * Проверка победы
     * @param symbol Символ для которого проверяем. Крестик или нолик.
     * @return true, если выиграл
     */
    public static boolean checkWin(char symbol) {
        String line;
        String column;
        String diagonalLeftRight = "";
        String diagonalRightLeft = "";
        //Проверяем строки и столбцы
        for (int i = 0; i < SIZE; i++) {
            line = "";
            column = "";
            for (int j = 0; j < SIZE; j++) {
                line += map[i][j];
                column += map[j][i];
            }
            if (checkMatch(line, symbol)) return true;
            if (checkMatch(column, symbol)) return true;
        }
        //Проверяем диагонали
        for (int i = 0; i < SIZE; i++) {
            diagonalLeftRight += map[i][i];
            diagonalRightLeft += map[i][SIZE - 1 - i];
        }
        if (checkMatch(diagonalLeftRight, symbol)) return true;
        return checkMatch(diagonalRightLeft, symbol);
    }

    /**
     *Проверка на соответствие выигрышному числу количества одинаковых символов (фишек) в строке/столбце/диагонали, идущих подряд
     * @param concat строка/столбех/диагональ
     * @param symbol Фишка игрока
     * @return true, если фишек больше или равно количеству, необходимому для победы.
     */
    public static boolean checkMatch(String concat, char symbol) {
        Matcher pattern = Pattern.compile("(.)\\1+").matcher(concat);
        while (pattern.find()) {
            if (pattern.group().chars().filter(x -> x == symbol).count() >= DOTS_TO_WIN) {
                return true;
            }
        }
        return false;
    }

    /**
     * Проверка, что в поле не  осталось ни одной свободной ячейки.
     *
     * @return true, если нет ни одной свободной
     */
    public static boolean isMapFull() {
        for (char[] line : map) {
            for (char cell : line) {
                if (cell == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initMap();
        printMap();
        while(true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Побеждает человек!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Робот выиграл!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Game over!");
    }

}
