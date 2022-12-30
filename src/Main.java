

public class Main {

    public static void main(String[] args) {

    // Example of traversing a tree
        Order root = new Order("F");
        // left internal tree after root
        root.setLeft(new Node("B"));
        root.getLeft().setLeft(new Node("A"));
        root.getLeft().setRight(new Node("D"));
        root.getLeft().getRight().setRight(new Node("E"));
        root.getLeft().getRight().setLeft(new Node("C"));
        // right internal tree after root
        root.setRight(new Node("G"));
        root.getRight().setRight(new Node("I"));
        root.getRight().getRight().setLeft(new Node("H"));


        System.out.print("Inorder : ");
        root.traverseInorder(root.getNode());
        System.out.println();
        System.out.print("Preorder : ");
        root.traversePreorder(root.getNode());
        System.out.println();
        System.out.print("Postorder : ");
        root.traversePostorder(root.getNode());


    }
}