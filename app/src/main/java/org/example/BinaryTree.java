package org.example;

public class BinaryTree {
    private Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    /**
     * Pre-order traversal
     */
    public void traverse() {
        traverse(root);
    }

    private void traverse(Node current) {

        if (current == null) {
            return;
        }

        System.out.println(current.getSquirrel().getName());

        traverse(current.left());
        traverse(current.right());
    }
}
