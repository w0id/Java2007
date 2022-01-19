package course1.lesson6;

//Всегда a + b = total
public class Example {
    private int a;
    private int b;
    private int total;

    public Example(int a, int b) {
        this.a = a;
        this.b = b;
        this.total = a + b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
        this.total = this.a + this.b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
        this.total = this.a + this.b;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void totalInfo() {
        System.out.println(a + " + " + b + " = " + total);
    }
}
