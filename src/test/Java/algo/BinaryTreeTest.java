package algo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryTreeTest {

    BinaryTree binaryTree = new BinaryTree();

    @Test
    @DisplayName("Construct using PreOrder and InOrder List with 3 elements")
    void preAndInOrderList1() {
        TreeNode tree = binaryTree.fromPreAndInOrderList(List.of(1, 2, 3), List.of(2, 1, 3));
        assertThat(tree.getRight().getValue()).isEqualTo(3);
    }

    @Test
    @DisplayName("Construct using PreOrder and InOrder List with 5 elements")
    void preAndInOrderList2() {
        TreeNode tree = binaryTree.fromPreAndInOrderList(List.of(1, 2, 3, 4, 5), List.of(2, 1, 3, 4, 5));
        assertThat(tree.getValue()).isEqualTo(1);
        assertThat(tree.getRight().getValue()).isEqualTo(3);
        assertThat(tree.getLeft().getValue()).isEqualTo(2);
        assertThat(tree.getRight().getRight().getValue()).isEqualTo(4);
        assertThat(tree.getRight().getLeft()).isNull();
        assertThat(tree.getRight().getRight().getRight().getValue()).isEqualTo(5);
    }

    @Test
    @DisplayName("Construct using PreOrder and InOrder List with 11 elements")
    void preAndInOrderList3() {
        TreeNode tree = binaryTree.fromPreAndInOrderList(List.of(1,2,4,8,9,5,10,11,3,6,7), List.of(8,4,9,2,10,5,11,1,6,3,7));
        assertThat(tree.getValue()).isEqualTo(1);
        assertThat(tree.getLeft().getValue()).isEqualTo(2);
        assertThat(tree.getRight().getValue()).isEqualTo(3);
        assertThat(tree.getLeft().getLeft().getValue()).isEqualTo(4);
        assertThat(tree.getLeft().getRight().getValue()).isEqualTo(5);
        assertThat(tree.getLeft().getLeft().getLeft().getValue()).isEqualTo(8);
        assertThat(tree.getLeft().getLeft().getRight().getValue()).isEqualTo(9);
        assertThat(tree.getLeft().getRight().getLeft().getValue()).isEqualTo(10);
        assertThat(tree.getLeft().getRight().getRight().getValue()).isEqualTo(11);
        assertThat(tree.getRight().getLeft().getValue()).isEqualTo(6);
        assertThat(tree.getRight().getRight().getValue()).isEqualTo(7);
    }

    @Test
    @DisplayName("Invert Binary tree with 2 nodes")
    void invert1() {
        TreeNode tree = binaryTree.fromPreAndInOrderList(List.of(1, 2, 3), List.of(2, 1, 3));
        TreeNode invertedTree = tree.invert();
        assertThat(invertedTree.getRight().getValue()).isEqualTo(2);
    }

    @Test
    @DisplayName("Invert Binary tree with 5 nodes")
    void invert2() {
        TreeNode tree = binaryTree.fromPreAndInOrderList(List.of(1, 2, 3, 4, 5), List.of(2, 1, 3, 4, 5)).invert();
        assertThat(tree.getValue()).isEqualTo(1);
        assertThat(tree.getLeft().getValue()).isEqualTo(3);
        assertThat(tree.getRight().getValue()).isEqualTo(2);
        assertThat(tree.getLeft().getLeft().getValue()).isEqualTo(4);
        assertThat(tree.getLeft().getRight()).isNull();
        assertThat(tree.getLeft().getLeft().getLeft().getValue()).isEqualTo(5);
    }

    @Test
    @DisplayName("Invert Binary tree with 11 nodes")
    void invert3() {
        TreeNode tree = binaryTree.fromPreAndInOrderList(List.of(1,2,4,8,9,5,10,11,3,6,7), List.of(8,4,9,2,10,5,11,1,6,3,7)).invert();
        assertThat(tree.getValue()).isEqualTo(1);
        assertThat(tree.getRight().getValue()).isEqualTo(2);
        assertThat(tree.getLeft().getValue()).isEqualTo(3);
        assertThat(tree.getRight().getRight().getValue()).isEqualTo(4);
        assertThat(tree.getRight().getLeft().getValue()).isEqualTo(5);
        assertThat(tree.getRight().getRight().getRight().getValue()).isEqualTo(8);
        assertThat(tree.getRight().getRight().getLeft().getValue()).isEqualTo(9);
        assertThat(tree.getRight().getLeft().getRight().getValue()).isEqualTo(10);
        assertThat(tree.getRight().getLeft().getLeft().getValue()).isEqualTo(11);
        assertThat(tree.getLeft().getRight().getValue()).isEqualTo(6);
        assertThat(tree.getLeft().getLeft().getValue()).isEqualTo(7);
    }
}