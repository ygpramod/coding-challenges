package challenge;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ZigZagConversionTest {
    ZigZagConversion testSubject = new ZigZagConversion();
    @Test
    void test1() {
        Assertions.assertThat(testSubject.convert("a", 1)).isEqualTo("a");
    }

    @Test
    void test2() {
        Assertions.assertThat(testSubject.convert("ab", 1)).isEqualTo("ab");
    }

    @Test
    void test3() {
        Assertions.assertThat(testSubject.convert("abc", 2)).isEqualTo("acb");
    }

    @Test
    void test4() {
        Assertions.assertThat(testSubject.convert("abcde", 3)).isEqualTo("aebdc");
    }

    @Test
    void test5() {
        Assertions.assertThat(testSubject.convert("PAYPALISHIRING", 3)).isEqualTo("PAHNAPLSIIGYIR");
    }

    @Test
    void test6() {
        Assertions.assertThat(testSubject.convert("A", 3)).isEqualTo("A");
    }

    @Test
    void test7() {
        Assertions.assertThat(testSubject.convert("ZIGZAGCONVERSIONTEST", 2)).isEqualTo("ZGACNESOTSIZGOVRINET");
    }

    @Test
    void test8() {
        Assertions.assertThat(testSubject.convert("ZIGZAGCONVERSIONTEST", 3)).isEqualTo("ZANSTIZGOVRINETGCEOS");
    }

    @Test
    void test9() {
        Assertions.assertThat(testSubject.convert("ZIGZAGCONVERSIONTEST", 4)).isEqualTo("ZCSSIGORIETGANEOTZVN");
    }

}
