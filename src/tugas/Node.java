package tugas;

public class Node {
	protected Integer dataNode;
    protected Node ptr;
    
    public Node() {
        dataNode = null;
        ptr = null;
    }
    
    public Node(Integer d, Node e) {
        dataNode = d;
        ptr = e;
    }
    
    public void setData(Integer d) {
        dataNode = d;
    }
    
    public void setPtr (Node e) {
        ptr = e;
    }
    
    public Object getData() {
        return dataNode;
    }
    
    public Node getPtr() {
        return ptr;
    }
}
