package challenge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinStackTest {

    Stack testSubject;

    @Test
    @DisplayName("get min of stack with 1 element")
    void test1() {
        testSubject = new Stack();
        testSubject.push(1);
        assertThat(testSubject.getMin()).isEqualTo(1);
    }

    @Test
    @DisplayName("get min of stack with 2 elements")
    void test2() {
        testSubject = new Stack();
        testSubject.push(1);
        testSubject.push(2);
        assertThat(testSubject.getMin()).isEqualTo(1);
    }

    @Test
    @DisplayName("get min of stack with 3 elements with push and pop")
    void test3() {
        testSubject = new Stack();
        testSubject.push(1);
        testSubject.push(2);
        testSubject.push(0);
        assertThat(testSubject.getMin()).isEqualTo(0);
        assertThat(testSubject.pop()).isEqualTo(0);
        assertThat(testSubject.getMin()).isEqualTo(1);
    }

    @Test
    @DisplayName("get min of stack with n elements with push and pop and duplicate minimums")
    void test4() {
        testSubject = new Stack();
        testSubject.push(1);
        assertThat(testSubject.getMin()).isEqualTo(1);
        testSubject.push(2);
        assertThat(testSubject.getMin()).isEqualTo(1);
        testSubject.push(1);
        assertThat(testSubject.getMin()).isEqualTo(1);
        testSubject.push(0);
        assertThat(testSubject.getMin()).isEqualTo(0);
        testSubject.push(0);
        assertThat(testSubject.getMin()).isEqualTo(0);
        assertThat(testSubject.pop()).isEqualTo(0);
        assertThat(testSubject.getMin()).isEqualTo(0);
        assertThat(testSubject.pop()).isEqualTo(0);
        assertThat(testSubject.getMin()).isEqualTo(1);
        assertThat(testSubject.pop()).isEqualTo(1);
        assertThat(testSubject.getMin()).isEqualTo(1);
    }
}
