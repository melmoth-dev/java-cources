public class Calculate {
    public static void main(String[] arg) {
        System.out.println("Calculating ...");
        int first = Integer.valueOf(arg[0]);
        int second = Integer.valueOf(arg[1]);
        int result = first + second;
        System.out.println("Summ " + result);
    }
}