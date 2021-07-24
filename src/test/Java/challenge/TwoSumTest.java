package challenge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTest {
    TwoSum testSubject = new TwoSum();

    @Test
    @DisplayName("{1,2}")
    void test1() {
        assertThat(testSubject.findPair(List.of(1, 2), 3)).isEqualTo(new int[]{0, 1});
    }

    @Test
    @DisplayName("{1, 2, 3}")
    void test2() {
        assertThat(testSubject.findPair(List.of(1, 2, 3), 3)).isEqualTo(new int[]{0, 1});
        assertThat(testSubject.findPair(List.of(1, 2, 3), 5)).isEqualTo(new int[]{1, 2});
        assertThat(testSubject.findPair(List.of(1, 2, 3), 4)).isEqualTo(new int[]{0, 2});
    }

    @Test
    @DisplayName("{1, 2, 5, 6, 7, 7}")
    void test3() {
        assertThat(testSubject.findPair(List.of(1, 2, 5, 6, 7, 7), 14)).isEqualTo(new int[]{4, 5});
        assertThat(testSubject.findPair(List.of(1, 2, 5, 6, 7, 7), 13)).isEqualTo(new int[]{3, 4});
        assertThat(testSubject.findPair(List.of(1, 2, 5, 6, 7, 7), 4)).isEqualTo(new int[]{-1, -1});
        assertThat(testSubject.findPair(List.of(1, 2, 5, 6, 7, 7), 12)).isEqualTo(new int[]{2, 4});
    }
}