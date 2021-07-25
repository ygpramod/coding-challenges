package algo;

import java.util.List;
import java.util.Stack;
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
        TreeNode root = new TreeNode(preOrder.get(preOrderIndex.get()));

        List<Integer> slicedInOrderLeft = inOrder.subList(0, inOrderIndex);
        List<Integer> slicedInOrderRight = inOrder.subList(inOrderIndex + 1, inOrder.size());

        if (slicedInOrderLeft.size() == 0 && slicedInOrderRight.size() == 0) {
            return root;
        }

        if (slicedInOrderLeft.size() != 0) {
            int nextInOrderIndex = slicedInOrderLeft.indexOf(preOrder.get(preOrderIndex.incrementAndGet()));
            root.setLeft(buildTree(preOrderIndex, nextInOrderIndex, preOrder, slicedInOrderLeft));
        }
        if (slicedInOrderRight.size() != 0) {
            int nextInOrderIndex = slicedInOrderRight.indexOf(preOrder.get(preOrderIndex.incrementAndGet()));
            root.setRight(buildTree(preOrderIndex, nextInOrderIndex, preOrder, slicedInOrderRight));
        }
        return root;
    }

    public TreeNode binarySearchTreeFromPreOrderList(List<Integer> preOrder) {
        TreeNode root = new TreeNode(preOrder.get(0));
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        for (int i = 1; i < preOrder.size(); i++) {
            Integer element = preOrder.get(i);
            if (element < stack.peek().getValue()) {
                TreeNode left = new TreeNode(element);
                stack.peek().setLeft(left);
                stack.push(left);
                continue;
            }
            TreeNode rightNode = stack.peek();
            while (!stack.isEmpty() && element > stack.peek().getValue()) {
                rightNode = stack.pop();
            }
            TreeNode right = new TreeNode(element);
            rightNode.setRight(right);
            stack.push(right);
        }
        return root;
    }
}
