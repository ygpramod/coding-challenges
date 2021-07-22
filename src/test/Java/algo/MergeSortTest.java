package algo;

import algo.MergeSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class MergeSortTest {
    @Test
    @DisplayName("sort 1")
    void test0() {
        int[] testSubject = new MergeSort().splitAndMerge(new int[]{1});
        assertThat(testSubject).isEqualTo(new int[]{1});
    }

    @Test
    @DisplayName("sort 1, 2")
    void test1() {
        int[] testSubject = new MergeSort().splitAndMerge(new int[]{1, 2});
        assertThat(testSubject).isEqualTo(new int[]{1, 2});
    }

    @Test
    @DisplayName("sort 2, 1")
    void test2() {

        int[] testSubject = new MergeSort().splitAndMerge(new int[]{2, 1});
        assertThat(testSubject).isEqualTo(new int[]{1, 2});
    }

    @Test
    @DisplayName("sort 3, 1")
    void test3() {

        int[] testSubject = new MergeSort().splitAndMerge(new int[]{3, 1});
        assertThat(testSubject).isEqualTo(new int[]{1, 3});
    }

    @Test
    @DisplayName("sort 3, 1, 2")
    void test4() {

        int[] testSubject = new MergeSort().splitAndMerge(new int[]{3, 1, 2});
        assertThat(testSubject).isEqualTo(new int[]{1, 2, 3});
    }

    @Test
    @DisplayName("sort 3, 2, 1")
    void test5() {

        int[] testSubject = new MergeSort().splitAndMerge(new int[]{3, 2, 1});
        assertThat(testSubject).isEqualTo(new int[]{1, 2, 3});
    }

    @Test
    @DisplayName("sort 1, 3, 2")
    void test6() {

        int[] testSubject = new MergeSort().splitAndMerge(new int[]{1, 3, 2});
        assertThat(testSubject).isEqualTo(new int[]{1, 2, 3});
    }

    @Test
    @DisplayName("sort 1, 2, 2")
    void test7() {

        int[] testSubject = new MergeSort().splitAndMerge(new int[]{1, 2, 2});
        assertThat(testSubject).isEqualTo(new int[]{1, 2, 2});
    }

    @Test
    @DisplayName("sort 1, 2, 2, 3")
    void test8() {

        int[] testSubject = new MergeSort().splitAndMerge(new int[]{1, 2, 2, 3});
        assertThat(testSubject).isEqualTo(new int[]{1, 2, 2, 3});
    }

    @Test
    @DisplayName("sort 2, 2, 2, 3")
    void test9() {

        int[] testSubject = new MergeSort().splitAndMerge(new int[]{2, 2, 2, 3});
        assertThat(testSubject).isEqualTo(new int[]{2, 2, 2, 3});
    }

    @Test
    @DisplayName("sort 2, 2, 2, 2")
    void test10() {

        int[] testSubject = new MergeSort().splitAndMerge(new int[]{2, 2, 2, 2});
        assertThat(testSubject).isEqualTo(new int[]{2, 2, 2, 2});
    }

    @Test
    @DisplayName("sort 1, 1, 4, 6, 8, 5, 15, 7, 25, 2, 15")
    void test11() {

        int[] testSubject = new MergeSort().splitAndMerge(new int[]{1, 1, 4, 6, 8, 5, 15, 7, 25, 2, 15});
        assertThat(testSubject).isEqualTo(new int[]{1, 1, 2, 4, 5, 6, 7, 8, 15, 15, 25});
    }
}
