public class FirstApp {

    public static void main(String[] args) {
        System.out.println("Hello, java!");

        int name = 10;

        float val = 10;
        double doubleVal = 10.0f;

        int b = 100 + name;

        System.out.println("b = " + b + " ");

        int c = name + b * 2;

        System.out.println("c = " + c);


        int a = 42;

        a++;
        a--;

        a += 10;
        a -=10;
        a *= 10;
        a /= 10;

        boolean boolValue = true;
        System.out.println(boolValue);

        int v1 = 15;
        int v2 = 15;

        if (v1 > v2) {
            System.out.println("v1 > v2");
        }else if (v1 < v2) {
            System.out.println("v1 < v2");
        }else{
            System.out.println("v1 = v2");
        }

        drawCat();

    }

    public static void drawCat() {
        System.out.println(" _..---...,\"\"-._ ,/}/)\n" +
                " .'' , ``..'(/-<\n" +
                " / _ { ) \\\n" +
                " ; _ `. `. < a(\n" +
                " ,' ( \\ ) `. \\ __.._ .: y\n" +
                " ( <\\_-) )'-.____...\\ `._ //-'\n" +
                " `. `-' /-._))) `-._)))\n" +
                " `...' ");
    }
}
