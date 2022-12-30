public class Order {

    private Node node;

    public Order(Object rootKey)
    {
        node = new Node(rootKey);
    }

    public void traversePreorder(Node root)
    {
        if(root == null){
            return;
        }

        System.out.print(root.getData() + " ");

        // Traverse through the left subtree
        traversePreorder(root.getLeft());

        // Traverse through the right subtree
        traversePreorder(root.getRight());
    }

    public void traverseInorder(Node root)
    {
        // check if the root is empty and return
        if(root == null){
            return;
        }
        // Traverse the left subtree
        traverseInorder(root.getLeft());

        System.out.print(root.getData() + " ");

        // Traverse the right subtree
        traverseInorder(root.getRight());
    }

    public void traversePostorder(Node root)
    {
        // check if the root is empty and return
        if(root == null){
            return;
        }
        // Traverse the left subtree
        traversePostorder(root.getLeft());


        // Traverse the right subtree
        traversePostorder(root.getRight());

        System.out.print(root.getData() + " ");

    }
    public Node getNode()
    {
        return node;
    }

    public Node getLeft() {
        return node.getLeft();
    }

    public Node getRight()
    {
        return node.getRight();
    }

    public void setRight(Node newNode)
    {
        node.setRight(newNode);
    }

    public void setLeft(Node newNode)
    {
        node.setLeft(newNode);
    }
}

