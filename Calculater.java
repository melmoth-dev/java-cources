/**
 * Класс реализует калькулятор.
 */
public class Calculater {

    private int result;

    public int getResult() {
        return this.result;
    }

    public void clearResult() {
        this.result = 0;
    }

    /**
     * Волняет сложение.
     * @args Входящие аргументы
     */
    public void add(int ... args) {
        for (Integer arg : args) {
            this.result += arg;
        }
    }

    /**
     * Волняет вычитание.
     * @args Входящие аргументы
     */
    public void sub(int ... args) {
        for (Integer arg : args) {
            this.result -= arg;
        }
    }

    /**
     * Волняет умножение.
     * @args Входящие аргументы
     */
    public void mult(int ... args) {
        for (Integer arg : args) {
            this.result *= arg;
        }
    }

    /**
     * Волняет деление.
     * @args Входящие аргументы
     */
    public void div(int ... args) throws Exception {
        if (args.length > 0) {
            for (Integer arg : args) {
                if (arg != 0) {
                    this.result /= arg;
                } else {
                    throw new Exception("Error, You try to div on zero");
                }
            }
        } else {
            throw new Exception("Error, You should enter minimum one argument");
        }
    }

}