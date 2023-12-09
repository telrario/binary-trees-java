package org.example;

public class BinaryTree {
    /**
     * the root node of the binary tree
     */
    private final Node root;

    public BinaryTree(int value){
        this.root = new Node(value);
    }

    public Node getRoot() {
        return this.root;
    }

    public void insert(int value) {
        this.insert(value, this.root);
    }

    public void insert(int value, Node node) {
        if(node.greatThan(value)){
            if(node.hasLeft()){
                this.insert(value, node.getLeft());
            }
            else {
                node.setLeft(new Node(value));
            }
        } else if (node.lessThan(value)) {
            if(node.hasRight()){
                this.insert(value, node.getRight());
            }
            else{
                node.setRight(new Node(value));
            }
        }
    }

    public Node search(int value){
        return this.search(value, this.root);
    }

    public Node search(int value, Node node) {
        if(node == null){
            return null;
        }

        if(node.getValue() == value){
            return node;
        }

        if(node.greatThan(value)){
            return this.search(value, node.getLeft());
        }

        if(node.lessThan(value)){
            return this.search(value, node.getRight());
        }

        return null;
    }

    public void print() {
        this.print(this.root, "", true);
    }

    private void print(Node node, String prefix, boolean isLeft) {
        if (node != null) {
            System.out.println(prefix + (isLeft ? "├──" : "└──") + node.getValue());

            print(node.getLeft(), prefix + (isLeft ? "│   " : "    "), true);
            print(node.getRight(), prefix + (isLeft ? "│   " : "    "), false);
        }
    }
}
