package factorial;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FactorialTest {

    @DisplayName("팩토리얼 반복")
    @ParameterizedTest
    @CsvSource(value = {"1:1", "2:2", "3:6", "4:24", "5:120"}, delimiter = ':')
    void factorial_반복문_Test(int number, int expected) {
        Factorial factorial = new Factorial();
        assertThat(factorial.factorial(number)).isEqualTo(expected);
    }

    @DisplayName("팩토리얼 재귀")
    @ParameterizedTest
    @CsvSource(value = {"1:1", "2:2", "3:6", "4:24", "5:120"}, delimiter = ':')
    void factorial_재귀함수_Test(int number, int expected) {
        Factorial factorial = new Factorial();
        assertThat(factorial.recursiveFactorial(number)).isEqualTo(expected);
    }
}
