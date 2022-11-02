package tugas;

import tugas.Node;

public class Queue {
	protected Node front;
	protected Node rear;
    protected int number;
    
    public Queue() {
        front = null;
        rear = null;
        number = 0;
    }
    
    public boolean isEmpty() {
        return front == null;
    }
    
    public void enqueue(Integer d) {
    	rear = new Node(d, rear);
    	if (isEmpty()) front = rear;
    	number++;
    }
    
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong");
            return;
        }
        
        Node tmp = null;
        // mendapatkan nilai node pada index ke number-1 
        // (index sebelum node front)
        for(int i=0;i<number-1;i++)
        {
        	if (i == 0) {
        		tmp = rear;
        		continue;
        	}
        	tmp = tmp.getPtr();
        }
        
        Integer newFrontValue = null;
        if (tmp != null) newFrontValue = (int) tmp.getData();
        
        front = (newFrontValue == null) ? null : new Node(newFrontValue, null);
        if (front == null) rear = front;
        
        number--;
    }
    
    public void insertElmAt(Integer index, Integer value) {
    	if ((index > number) || (index < 0)) {
    		System.out.println("Tidak bisa melakukan insert");
    		return;
    	}
    	
    	// jika memasukkan nilai node pada index 0
    	// eksekusi function enqueue
    	if (index == 0) {
    		enqueue(value);
    		return;
    	}
    	
    	Node newNode = new Node(value, null);
    	
    	// jika index yang ingin dimasukkan merupakan index terakhir dari queue
    	if (index == (number - 1)) newNode.setPtr(front);
    	else {
    		Node tmp1 = rear;
    		
        	// Mendapatkan nilai node pada index ke-x
    		for(int i=0;i<index;i++) {
    			tmp1 = tmp1.getPtr();
            }
    		
    		newNode.setPtr(tmp1);
    	}
		
		Node tmp2 = rear;
		
    	// Mendapatkan nilai node pada index ke x-1
		for(int i=0;i<index-1;i++) {
			tmp2 = tmp2.getPtr();
        }
		
		tmp2.setPtr(newNode);
		
		number++;
    }
    
    public Object getFront() {
        if (isEmpty()) {
            return null;
        } else {
            return front.getData();
        }
    }
    
    public Object getRear() {
        if (isEmpty()) {
            return null;
        } else {
            return rear.getData();
        }
    }
    
    public void printNode() {
    	if (isEmpty()) {
            System.out.println("Queue kosong");
        } else {
        	Node tmp = rear;
            for(int i=0;i<number;i++) {
                System.out.println(tmp.getData());
                tmp = tmp.getPtr();
            }
        }
    }
}
