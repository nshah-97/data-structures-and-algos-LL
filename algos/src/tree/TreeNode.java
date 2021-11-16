package tree;

import com.sun.source.tree.Tree;

import java.util.Objects;

public class TreeNode {
    private Integer data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(Integer data) {
        this.data = data;
    }

    public TreeNode find(Integer data) {
        if (Objects.equals(this.data, data)) return this;
        if (data < this.data && leftChild != null) {
            return this.leftChild.find(data);
        }
        if (data > this.data && rightChild != null) {
            return this.rightChild.find(data);
        }
        return null;
    }

    public void insert(Integer data) {
        if (data >= this.data) {
            if (this.rightChild == null) {
                this.rightChild = new TreeNode(data);
            } else {
                this.rightChild.insert(data);
            }
        } else {
            if (this.leftChild == null) {
                this.leftChild = new TreeNode(data);
            } else {
                this.leftChild.insert(data);
            }

        }
    }

    public void delete(Integer data) {
        TreeNode node = this.find(data);
        if (node == null) {
            System.out.println("Could not find matching node to delete");
        } else {

        }


    }

    public boolean isLeaf() {
        return (rightChild == null && leftChild == null);
    }

    public boolean hasLeftChild() {
        return leftChild != null;
    }

    public boolean hasRightChild() {
        return rightChild != null;
    }


    public Integer getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public TreeNode findSuccessor() {
        TreeNode current = this;
        while (current.getLeftChild() != null) {
            current = current.getLeftChild();
        }
        return current;
    }
}
