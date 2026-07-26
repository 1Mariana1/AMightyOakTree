package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {
    @Test
    public void testRootAssignment() {

        Node root = new Node(new Squirrel("Root"));

        BinaryTree tree = new BinaryTree(root);

        assertEquals(root, tree.getRoot());
    }

    @Test
    public void testBuildSimpleTree() {

        Node root = new Node(new Squirrel("Root"));
        Node left = new Node(new Squirrel("Left"));
        Node right = new Node(new Squirrel("Right"));

        root.setLeft(left);
        root.setRight(right);

        BinaryTree tree = new BinaryTree(root);

        assertEquals("Left",
                tree.getRoot().left().getSquirrel().getName());

        assertEquals("Right",
                tree.getRoot().right().getSquirrel().getName());
    }

    @Test
    public void testMultipleLevels() {

        Node root = new Node(new Squirrel("Root"));
        Node left = new Node(new Squirrel("Left"));
        Node leftLeft = new Node(new Squirrel("LeftLeft"));

        root.setLeft(left);
        left.setLeft(leftLeft);

        BinaryTree tree = new BinaryTree(root);

        assertEquals(
                "LeftLeft",
                tree.getRoot()
                        .left()
                        .left()
                        .getSquirrel()
                        .getName());
    }
}
