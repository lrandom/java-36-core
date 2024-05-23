public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public float div(int a, int b) throws Exception, ArithmeticException {
        if (b == 0) {
            throw new Exception("Please input agrument two != 0");
        }

        if (b == -1) {
            throw new ArithmeticException("Please input agrument two != -1");
        }
        return a / b;
    }

    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        try {
            calculator.div(1, 0);
        } catch (Exception e) {
            throw e;
        }finally {
            System.out.println("Finally block");
        }
    }
}
