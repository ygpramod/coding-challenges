package challenge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StackTest {
    Stack testSubject;

    @Test
    @DisplayName("push 1 element and peek")
    void test1() {
        testSubject = new Stack();
        testSubject.push(1);
        assertThat(testSubject.peek()).isEqualTo(1);
    }

    @Test
    @DisplayName("push 2 elements and peek")
    void test2() {
        testSubject = new Stack();
        testSubject.push(1);
        testSubject.push(2);
        assertThat(testSubject.peek()).isEqualTo(2);
    }

    @Test
    @DisplayName("push n elements and peek")
    void test3() {
        testSubject = new Stack();
        testSubject.push(1);
        testSubject.push(2);
        testSubject.push(4);
        testSubject.push(6);
        testSubject.push(9);
        assertThat(testSubject.peek()).isEqualTo(9);
        assertThat(testSubject.peek()).isEqualTo(9);
    }

    @Test
    @DisplayName("push n elements and pop")
    void test4() {
        testSubject = new Stack();
        testSubject.push(1);
        testSubject.push(2);
        testSubject.push(4);
        testSubject.push(6);
        testSubject.push(9);
        assertThat(testSubject.pop()).isEqualTo(9);
        assertThat(testSubject.pop()).isEqualTo(6);
        assertThat(testSubject.pop()).isEqualTo(4);
        assertThat(testSubject.peek()).isEqualTo(2);
        assertThat(testSubject.pop()).isEqualTo(2);
        assertThat(testSubject.pop()).isEqualTo(1);
        Assertions.assertThrows(IllegalArgumentException.class, () -> testSubject.pop());
    }
}
