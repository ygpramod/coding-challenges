package algo;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class BinaryTree {

    public TreeNode fromPreAndInOrderList(List<Integer> preOrder, List<Integer> inOrder) {
        if (preOrder.size() == 0) {
            throw new IllegalArgumentException("List should contain at least one value");
        }
        if (preOrder.size() == 1) {
            return new TreeNode(preOrder.get(0));
        }
        AtomicInteger preOrderIndex = new AtomicInteger(0);
        int inOrderIndex = inOrder.indexOf(preOrder.get(preOrderIndex.get()));
        return buildTree(preOrderIndex, inOrderIndex, preOrder, inOrder);
    }

    private TreeNode buildTree(AtomicInteger preOrderIndex, int inOrderIndex, List<Integer> preOrder, List<Integer> inOrder) {
        TreeNode tree = new TreeNode(preOrder.get(preOrderIndex.get()));

        List<Integer> slicedInOrderLeft = inOrder.subList(0, inOrderIndex);
        List<Integer> slicedInOrderRight = inOrder.subList(inOrderIndex + 1, inOrder.size());

        if (slicedInOrderLeft.size() == 0 && slicedInOrderRight.size() == 0) {
            return tree;
        }

        if (slicedInOrderLeft.size() != 0) {
            int nextInOrderIndex = slicedInOrderLeft.indexOf(preOrder.get(preOrderIndex.incrementAndGet()));
            tree.setLeft(buildTree(preOrderIndex, nextInOrderIndex, preOrder, slicedInOrderLeft));
        }
        if (slicedInOrderRight.size() != 0) {
            int nextInOrderIndex = slicedInOrderRight.indexOf(preOrder.get(preOrderIndex.incrementAndGet()));
            tree.setRight(buildTree(preOrderIndex, nextInOrderIndex, preOrder, slicedInOrderRight));
        }
        return tree;
    }
}
