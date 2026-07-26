package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    @Test
    public void testConstructorStoresSquirrel() {

        Squirrel squirrel = new Squirrel("Cheeks");
        Node node = new Node(squirrel);

        assertEquals("Cheeks", node.getSquirrel().getName());
    }

    @Test
    public void testSetLeft() {

        Node parent = new Node(new Squirrel("Parent"));
        Node child = new Node(new Squirrel("Left"));

        parent.setLeft(child);

        assertEquals(child, parent.left());
    }

    @Test
    public void testSetRight() {

        Node parent = new Node(new Squirrel("Parent"));
        Node child = new Node(new Squirrel("Right"));

        parent.setRight(child);

        assertEquals(child, parent.right());
    }

    @Test
    public void testLeftInitiallyNull() {

        Node node = new Node(new Squirrel("A"));

        assertNull(node.left());
    }

    @Test
    public void testRightInitiallyNull() {

        Node node = new Node(new Squirrel("A"));

        assertNull(node.right());
    }
}
