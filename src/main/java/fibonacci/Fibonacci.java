package fibonacci;

public class Fibonacci {

    // 반복문
    public int fibonacci(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        }

        int result = 0;
        int number1 = 0;
        int number2 = 1;

        for (int i = 2; i <= number; i++) {
            result = number1 + number2;
            number1 = number2;
            number2 = result;

        }
        return result;
    }

    // 재귀
    public int recursiveFibonacci(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        }
        return recursiveFibonacci(number - 1) + recursiveFibonacci(number - 2);
    }
}
