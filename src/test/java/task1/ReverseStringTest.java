package task1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class ReverseStringTest {

    @ParameterizedTest
    @MethodSource("provideTestCasesForReverseText")
    void reverseText_useCases(String expected, String input, boolean reverseOnlyOddNumbers) {
        assertEquals(expected, ReverseString.reverse(input, reverseOnlyOddNumbers));
    }

    @Test
    void reverseText_exceptionCase() {
        assertThrows(RuntimeException.class, () -> ReverseString.reverse(null, false));
    }

    @Test
    void reverseText_onlyOddNumbers() {
        assertEquals("gbedcfa", ReverseString.reverse("abcdefg", true));
    }

    static Stream<Arguments> provideTestCasesForReverseText() {
        return Stream.of(
                arguments("abc2132", "2312cba", false),
                arguments("ba", "ab", false),
                arguments("c a1", "1a c", false)
        );
    }
}
