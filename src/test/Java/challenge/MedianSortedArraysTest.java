package challenge;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class MedianSortedArraysTest {
    MedianSortedArrays testSubject = new MedianSortedArrays();
    @Test
    void name() {
        Assertions.assertThat(testSubject.findMedianSortedArrays(new int[]{1, 3}, new int[]{2})).isEqualTo(2);
    }
    @Test
    void name2() {
        Assertions.assertThat(testSubject.findMedianSortedArrays(new int[]{1, 2}, new int[]{3,4})).isEqualTo(2.5);
    }
    @Test
    void name3() {
        Assertions.assertThat(testSubject.findMedianSortedArrays(new int[]{}, new int[]{2,3})).isEqualTo(2.5);
    }
    @Test
    void name4() {
        Assertions.assertThat(testSubject.findMedianSortedArrays(new int[]{3,4}, new int[]{})).isEqualTo(3.5);
    }
    @Test
    void name5() {
        Assertions.assertThat(testSubject.findMedianSortedArrays(new int[]{}, new int[]{2})).isEqualTo(2);
    }
    @Test
    void name6() {
        Assertions.assertThat(testSubject.findMedianSortedArrays(new int[]{}, new int[]{1,2,3,4,5,6})).isEqualTo(3.5);
    }
}