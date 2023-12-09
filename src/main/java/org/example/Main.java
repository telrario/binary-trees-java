package org.example;

import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final int AMOUNT_OF_NODES = 14;

    public static Random rand = new Random();

    public static void main(String[] args) {
        int[] values = new int[AMOUNT_OF_NODES + 1];
        BinaryTree tree = new BinaryTree(values[0] = getValue());

        for(int i=1; i<=AMOUNT_OF_NODES; i++){
            tree.insert(values[i] = getValue());
        }

        System.out.println("values: " + Arrays.toString(values));
        tree.print();

        for(int value : values){
            search(tree, value);
        }

        search(tree, 1001);
    }

    public static void search(BinaryTree tree, int value) {
        Node node = tree.search(value);

        if(node != null){
            System.out.println("node found for value: " + node.getValue());
        }
        else {
            System.out.println("node not found for value: " + value);
        }
    }

    public static int getValue() {
        return rand.nextInt(1000);
    }
}
