package org.example;

public class Node {
    /**
     * Child nodes
     */
    private Node left, right;

    private int value;

    public Node(int value) {
        this.setValue(value);
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public boolean hasLeft() {
        return this.getLeft() != null;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public boolean hasRight() {
        return this.getRight() != null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean greatThan(int value) {
        return this.getValue() > value;
    }

    public boolean lessThan(int value) {
        return this.getValue() < value;
    }
}
