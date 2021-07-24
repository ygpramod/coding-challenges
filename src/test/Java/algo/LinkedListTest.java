package algo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LinkedListTest {

    LinkedList testSubject = new LinkedList();

    @Test
    @DisplayName("Add first Element")
    void add1() {
        testSubject.addAtHead(5);
        assertThat(testSubject.get(0)).isEqualTo(5);
        assertThat(testSubject.getHead()).isEqualTo(5);
        assertThat(testSubject.getTail()).isEqualTo(5);
    }

    @Test
    @DisplayName("Get from non Existent Index")
    void get1() {
        testSubject.addAtHead(5);
        assertThrows(IndexOutOfBoundsException.class,
                () -> testSubject.get(1),
                "Please provide a valid index to get the element");
    }

    @Test
    @DisplayName("Add second Element at head")
    void add2() {
        testSubject.addAtHead(5);
        testSubject.addAtHead(6);
        assertThat(testSubject.get(1)).isEqualTo(5);
        assertThat(testSubject.getHead()).isEqualTo(6);
        assertThat(testSubject.getTail()).isEqualTo(5);
    }

    @Test
    @DisplayName("Add third Element at head")
    void add3() {
        testSubject.addAtHead(5);
        testSubject.addAtHead(6);
        testSubject.addAtHead(7);
        assertThat(testSubject.get(0)).isEqualTo(7);
        assertThat(testSubject.get(1)).isEqualTo(6);
        assertThat(testSubject.get(2)).isEqualTo(5);
        assertThat(testSubject.getHead()).isEqualTo(7);
        assertThat(testSubject.getTail()).isEqualTo(5);
    }

    @Test
    @DisplayName("Add first Element at tail")
    void add4() {
        testSubject.add(5);
        assertThat(testSubject.get(0)).isEqualTo(5);
        assertThat(testSubject.getHead()).isEqualTo(5);
        assertThat(testSubject.getTail()).isEqualTo(5);
    }

    @Test
    @DisplayName("Add second Element at tail")
    void add5() {
        testSubject.add(5);
        testSubject.add(6);
        assertThat(testSubject.get(1)).isEqualTo(6);
        assertThat(testSubject.getHead()).isEqualTo(5);
        assertThat(testSubject.getTail()).isEqualTo(6);
    }

    @Test
    @DisplayName("Add third Element at tail")
    void add6() {
        testSubject.add(5);
        testSubject.add(6);
        testSubject.add(7);
        assertThat(testSubject.get(0)).isEqualTo(5);
        assertThat(testSubject.get(1)).isEqualTo(6);
        assertThat(testSubject.get(2)).isEqualTo(7);
        assertThat(testSubject.getHead()).isEqualTo(5);
        assertThat(testSubject.getTail()).isEqualTo(7);
    }

    @Test
    @DisplayName("Add third Element at in the middle")
    void add7() {
        testSubject.add(5);
        testSubject.add(7);
        testSubject.add(6, 1);
        assertThat(testSubject.get(0)).isEqualTo(5);
        assertThat(testSubject.get(1)).isEqualTo(6);
        assertThat(testSubject.get(2)).isEqualTo(7);
        assertThat(testSubject.getHead()).isEqualTo(5);
        assertThat(testSubject.getTail()).isEqualTo(7);
    }

    @Test
    @DisplayName("Add Element in index 2 and 3")
    void add8() {
        testSubject.add(5);
        testSubject.add(6);
        testSubject.add(7);
        testSubject.add(8, 2);
        testSubject.add(9, 3);
        assertThat(testSubject.get(0)).isEqualTo(5);
        assertThat(testSubject.get(1)).isEqualTo(6);
        assertThat(testSubject.get(2)).isEqualTo(8);
        assertThat(testSubject.get(3)).isEqualTo(9);
        assertThat(testSubject.get(4)).isEqualTo(7);
        assertThat(testSubject.getHead()).isEqualTo(5);
        assertThat(testSubject.getTail()).isEqualTo(7);
    }

    @Test
    @DisplayName("add to non reachable Index")
    void add9() {
        testSubject.addAtHead(5);
        assertThrows(IndexOutOfBoundsException.class,
                () -> testSubject.add(8, 2),
                "Please provide a valid index to insert the element");
    }

    @Test
    @DisplayName("Delete head")
    void delete1(){
        testSubject.addAtHead(5);
        assertThat(testSubject.remove(0)).isEqualTo(5);
    }

    @Test
    @DisplayName("Delete tail")
    void delete2(){
        testSubject.add(5);
        testSubject.add(6);
        testSubject.add(7);
        assertThat(testSubject.remove(2)).isEqualTo(7);
    }

    @Test
    @DisplayName("Delete Element in index 2 and 3")
    void delete3() {
        testSubject.add(5);
        testSubject.add(6);
        testSubject.add(7);
        testSubject.add(8, 2);
        testSubject.add(9, 3);
        assertThat(testSubject.get(0)).isEqualTo(5);
        assertThat(testSubject.get(1)).isEqualTo(6);
        assertThat(testSubject.get(2)).isEqualTo(8);
        assertThat(testSubject.get(3)).isEqualTo(9);
        assertThat(testSubject.get(4)).isEqualTo(7);
        assertThat(testSubject.getHead()).isEqualTo(5);
        assertThat(testSubject.getTail()).isEqualTo(7);
        assertThat(testSubject.remove(3)).isEqualTo(9);
        assertThat(testSubject.remove(2)).isEqualTo(8);
    }

    @Test
    @DisplayName("delete from non existent index")
    void delete4() {
        testSubject.addAtHead(5);
        assertThrows(IndexOutOfBoundsException.class,
                () -> testSubject.remove(2),
                "Please provide a valid index to remove the element");
    }
}
