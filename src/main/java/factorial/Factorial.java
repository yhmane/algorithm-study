package factorial;

public class Factorial {

    // 반복문
    public int factorial(int number) {
        int result = 1;
        for (int i =1; i <= number; i++) {
            result = result * i;
        }

        return result;
    }

    // 재귀
    public int recursiveFactorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * recursiveFactorial(number - 1);
    }
}
