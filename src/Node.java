public class Node {
    private Object data;
    private Node left;
    private Node right;

    public Node(Object key)
    {
        data = key;
        left = null;
        right = null;
    }

    public void setLeft(Node node)
    {
        left = node;
    }

    public void setRight(Node node)
    {
        right = node;
    }
    public Node getLeft()
    {
        return left;
    }

    public Node getRight()
    {
        return right;
    }

    public Object getData()
    {
        return data;
    }
}
