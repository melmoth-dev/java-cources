public class Calculater {

    private int result;

    public void add(int ... params) {
        for (Integer param : params) {
            this.result += param;
        }
    }

    public int getResult() {
        return this.result;
    }

    public void clearResult() {
        this.result = 0;
    }

    public static void main(String[] arg) {
        System.out.println("Calculating ...");
        int first = Integer.valueOf(arg[0]);
        int second = Integer.valueOf(arg[1]);
        System.out.println("Summ " + summ(first, second));
        System.out.println("diff " + diff(first, second));
        System.out.println("mult " + mult(first, second));
        System.out.println("div " + div(first, second));
    }

    static public int summ(int x, int y) {
        return x + y;
    }

    static public int diff(int x, int y) {
        return x - y;
    }

    static public int mult(int x, int y) {
        return x * y;
    }

    static public int div(int x, int y) {
        return x / y;
    }

    /*static public float pow(float x, float y) {
        return Math.pow(x, y);
    }*/


}