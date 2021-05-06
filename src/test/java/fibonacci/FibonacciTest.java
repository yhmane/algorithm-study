package fibonacci;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FibonacciTest {

    @DisplayName("피보나치 반복")
    @ParameterizedTest
    @CsvSource(value = {"1:1", "2:1", "3:2", "4:3", "5:5"}, delimiter = ':')
    void fibonacci_반복문_Test(int number, int expected) {
        Fibonacci fibonacci = new Fibonacci();
        assertThat(fibonacci.fibonacci(number)).isEqualTo(expected);
    }

    @DisplayName("피보나치 재귀")
    @ParameterizedTest
    @CsvSource(value = {"1:1", "2:1", "3:2", "4:3", "5:5"}, delimiter = ':')
    void fibonacci_재귀함수_Test(int number, int expected) {
        Fibonacci fibonacci = new Fibonacci();
        assertThat(fibonacci.recursiveFibonacci(number)).isEqualTo(expected);
    }
}
