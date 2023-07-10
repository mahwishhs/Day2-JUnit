public class calculator {
        public static int addition(int x, int y) {
            return x + y;
        }

        public static int subtraction(int x, int y) {
            return x - y;
        }

        public static int multiplication(int x, int y) {
            return x * y;
        }

        public static int division(int x, int y) {
            if (y == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return x / y;
        }
    }