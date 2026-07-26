package org.example;

public class Node {
    private Squirrel squirrel;
    private Node left;
    private Node right;

    public Node(Squirrel squirrel) {
        this.squirrel = squirrel;
    }

    public Squirrel getSquirrel() {
        return squirrel;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node left() {
        return left;
    }

    public Node right() {
        return right;
    }
}
