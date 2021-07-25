package algo;

public class TreeNode {
    private final int value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode invert() {
        TreeNode temp = left;
        left = right;
        right = temp;

        if(left != null)
            left.invert();
        if(right != null)
            right.invert();

        return this;
    }
}
