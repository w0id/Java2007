package course1.lesson7;

import java.util.Arrays;
import java.util.Locale;

public class StringApp {

    public static void main(String[] args) {
        String str = "String";
        System.out.println(Arrays.toString(str.toCharArray()));

        String str2 = new String(str.toCharArray());

        System.out.println(str2);

        str = str.toUpperCase(Locale.ROOT);


        System.out.println(str);

//        String str3 = 1 + " " + 2 + " smth else " + 3; //так лучше никогда не делать!

        StringBuilder stringBuilder = new StringBuilder(str2);
        stringBuilder.append(" ").append(1).append(" ").append(2).append(" smth else ").append(3);
        String str3 = stringBuilder.toString();

        System.out.println(str3);


        StringBuffer stringBuffer = new StringBuffer(str2);
        stringBuffer.append(" ").append(1).append(" ").append(2).append(" smth else ").append(3);
        String str4 = stringBuffer.toString();

        System.out.println(str4);
    }
}
