package tugas;

import tugas.Node;

public class SpecialStack {
	// Buat ganjil
	Node oddTop;
	
	int oddNumber;
	
	// Buat Genap
	Node evenTop;
	
    int evenNumber;
    
    
    public SpecialStack() {
        oddTop = null;
        evenTop = null;
        
        oddNumber = 0;
        evenNumber = 0;
    }
    
    public boolean isEmpty(Boolean isEven) {
    	if (isEven) return evenTop == null;
        return oddTop == null;
    }
    
    // jika angka ganjil maka akan ditambahkan ke stack ganjil
    public void push(Integer d) {
    	if (d % 2 == 0) {
    		 evenTop = new Node(d, evenTop);
    		 evenNumber++;
    	} else {
    		oddTop = new Node(d, oddTop);
    		oddNumber++;
    	}
    }
    
    // menghapus bagian akhir stack genap/ganjil
    public void pop(Boolean isEven) {
        if (isEmpty(isEven)) {
        	String x = (isEven) ? "Genap" : "Ganjil";
            System.out.println("Stack " + x + " kosong");
        } else {
            Node tmp = (isEven) ? evenTop : oddTop;
            if (isEven) {
            	evenTop = tmp.getPtr();
                evenNumber--;
            } else {
            	oddTop = tmp.getPtr();
                oddNumber--;
            }
        }
    }
    
    public Object getTop(Boolean isEven) {
        if (isEmpty(isEven)) {
            return null;
        } else if (isEven){
            return evenTop.getData();
        }
        
        return oddTop.getData();
    }
    
    public void printNode(Boolean isEven) {
        Node tmp = (isEven) ? evenTop : oddTop;
        int n = (isEven) ? evenNumber : oddNumber;
        for(int i=0;i<n;i++) {
            System.out.println(tmp.getData());
            tmp = tmp.getPtr();
        }
    }
}
