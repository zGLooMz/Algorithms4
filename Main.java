package Seminar4;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();

        for (int i = 3; i <= 10; i++) {
            tree.add(i);
        }

        tree.print();
    }
}
