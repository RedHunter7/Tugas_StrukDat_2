package tugas;

import tugas.Node;

public class Stack {
	protected Node top;
    protected int number;
    
    public Stack() {
        top = null;
        number = 0;
    }
    
    public boolean isEmpty() {
        return top == null;
    }
    
    public void push(Integer d) {
        top = new Node(d, top);
        number++;
    }
    
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
        } else {
            Node tmp = top;
            top = tmp.getPtr();
            number--;
        }
    }
    
    public Object getTop() {
        if (isEmpty()) {
            return null;
        } else {
            return top.getData();
        }
    }
    
    public void printNode() {
        Node tmp = top;
        int i;
        for(i=0;i<number;i++) {
            System.out.println(tmp.getData());
            tmp = tmp.getPtr();
        }
    }
}
