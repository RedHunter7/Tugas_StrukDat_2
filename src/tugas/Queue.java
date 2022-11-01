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
        return front == null && rear == null;
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
    	if ((index <= number) && (index >= 0)) {
    		Node tmp = rear;
    		// Mendapatkan nilai node pada index ke-x
    		for(int i=0;i<index;i++) {
    			tmp = tmp.getPtr();
            }
    		
    		// memberikan nilai baru pada index ke-x
    		tmp.setData(value);
    		
    		// jika nilai index yang ingin diubah sama dengan nilai dari total jumlah queue,
    		// ubah nilai data pada node front
    		if (index == number-1) front.setData(value);
    	} else {
    		System.out.println("Tidak bisa melakukan insert");
    	}
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
