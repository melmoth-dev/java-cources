/**
 * ����� ��������� �����������.
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
     * ������� ��������.
     * @args �������� ���������
     */
    public void add(int ... args) {
        for (Integer arg : args) {
            this.result += arg;
        }
    }

    /**
     * ������� ���������.
     * @args �������� ���������
     */
    public void sub(int ... args) {
        for (Integer arg : args) {
            this.result -= arg;
        }
    }

    /**
     * ������� ���������.
     * @args �������� ���������
     */
    public void mult(int ... args) {
        for (Integer arg : args) {
            this.result *= arg;
        }
    }

    /**
     * ������� �������.
     * @args �������� ���������
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