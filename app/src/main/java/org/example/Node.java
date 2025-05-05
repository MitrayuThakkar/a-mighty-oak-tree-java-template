package org.example;

public class Node {
    private Squirrel data;
    private Node left;
    private Node right;

    public Node(Squirrel data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Squirrel getData() {
        return data;
    }

    public Node left() {
        return left;
    }

    public Node right() {
        return right;
    }

    public void set_left(Node node) {
        this.left = node;
    }

    public void set_right(Node node) {
        this.right = node;
    }
}

