package avdeyev.vik;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @BeforeAll
    public static void start() {
        System.out.println("beforeALL");
    }

    @AfterAll
    public static void end() {
        System.out.println("afterALL");
    }

    @BeforeEach
    public void startEach() {
        System.out.println("beforeEach");
    }

    @AfterEach
    public void endEach() {
        System.out.println("afterEach");
    }


    @Nested
    @DisplayName("test of calculator")
    class calcMethodTest {
        @Test
        public void should_add_correct() {
            double x = 5;
            double y = 3;
            double actual = calculator.add(x, y);
            double expected = 8;
            Assertions.assertEquals(expected, actual);
        }

        @Test
        public void should_add_incorrect() {
            double x = 5;
            double y = 3;
            double actual = calculator.add(x, y);
            double expected = 9;
            Assertions.assertNotEquals(expected, actual);
        }
    }

    @Nested
    @DisplayName("test of otherTests")
    class otherTest {

        @ParameterizedTest
        @DisplayName("test of fruits")
        @ValueSource(strings = {"apple", "pineapple", "banana"})
        public void test_string_length(String fruit) {
            Assertions.assertEquals(5, fruit.length());
        }


//        @Test
//        public void should_return_false_isAdult() {
//            int age = 17;
//            boolean actual = calculator.isAdult(age);
//            Assertions.assertFalse(actual);
//        }
//
//        @Test
//        public void should_return_true_isAdult_age_less_18() {
//            int age = 17;
//            boolean actual = calculator.isAdult(age);
//            Assertions.assertTrue(actual);
//        }
    }
}

