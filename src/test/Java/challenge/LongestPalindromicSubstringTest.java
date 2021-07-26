package challenge;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LongestPalindromicSubstringTest {
    LongestPalindromicSubstring testSubject = new LongestPalindromicSubstring();
    @Test
    void test1() {
        assertThat(testSubject.find("a")).isEqualTo("a");
    }

    @Test
    void test2() {
        assertThat(testSubject.find("ab")).isEqualTo("a");
    }

    @Test
    void test3() {
        assertThat(testSubject.find("aba")).isEqualTo("aba");
    }

    @Test
    void test4() {
        assertThat(testSubject.find("abab")).isEqualTo("aba");
    }

    @Test
    void test5() {
        assertThat(testSubject.find("abbd")).isEqualTo("bb");
    }

    @Test
    void test6() {
        assertThat(testSubject.find("abaab")).isEqualTo("baab");
    }

    @Test
    void test7() {
        assertThat(testSubject.find("baababa")).isEqualTo("ababa");
    }
}
