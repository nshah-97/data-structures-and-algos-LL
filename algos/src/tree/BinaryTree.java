package tree;


public class BinaryTree {
    private TreeNode root;

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    public TreeNode find(Integer number) {
        if (root != null) {
            return root.find(number);
        }
        return null;
    }

    public void insert(Integer number) {
        if (root != null) {
            root.insert(number);
        } else {
            root = new TreeNode(number);
        }
    }

    public void delete(Integer data) {
        TreeNode current = this.root;
        TreeNode parent = this.root;
        boolean isLeftChild = false;


        if (current == null) {
            return;
        }

        while (current != null && current.getData() != data) {
            parent = current;

            if (data < current.getData()) {
                current = current.getLeftChild();
                isLeftChild = true;
            } else {
                current = current.getRightChild();
                isLeftChild = false;
            }
        }

        if (current == null) {
            return;
        }

        if (current.isLeaf()) {
            if (current == root) {
                root = null;
            } else {
                if (isLeftChild) parent.setLeftChild(null);
                else parent.setRightChild(null);
            }
        } else if (!current.hasRightChild()) {
            if (current == root) {
                root = current.getLeftChild();
            } else if (isLeftChild) {
                parent.setLeftChild(current.getLeftChild());
            } else {
                parent.setRightChild(current.getLeftChild());
            }
        } else if (!current.hasLeftChild()) {
            if (current == root) {
                root = current.getRightChild();
            } else if (isLeftChild) {
                parent.setLeftChild(current.getRightChild());
            } else {
                parent.setRightChild(current.getRightChild());
            }
        } else {
            TreeNode successor = current.findSuccessor();
            if (successor.hasRightChild()) {

            }
        }
    }

}
