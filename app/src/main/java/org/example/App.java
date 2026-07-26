package org.example;

public class App {
    public static void main(String[] args) {

        Squirrel cheeks = new Squirrel("Cheeks");
        Squirrel squeaks = new Squirrel("Squeaks");
        Squirrel fluffy = new Squirrel("Mr. Fluffy Butt");
        Squirrel acorn = new Squirrel("Acorn");
        Squirrel nutmeg = new Squirrel("Nutmeg");

        Node root = new Node(cheeks);
        Node left = new Node(squeaks);
        Node right = new Node(fluffy);
        Node leftLeft = new Node(acorn);
        Node rightRight = new Node(nutmeg);

        root.setLeft(left);
        root.setRight(right);

        left.setLeft(leftLeft);
        right.setRight(rightRight);

        BinaryTree tree = new BinaryTree(root);

        System.out.println("Tree Traversal:");

        tree.traverse();

        System.out.println();

        System.out.println("Testing left/right retrieval:");

        System.out.println(root.left().getSquirrel().getName());
        System.out.println(root.right().getSquirrel().getName());
    }
}
