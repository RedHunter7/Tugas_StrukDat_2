package tugas;
//import tugas.Stack;
//import tugas.SpecialStack;
import java.util.Scanner;

public class main {
	public static void main (String[] args) {
		/*
		SpecialStack x = new SpecialStack();
		x.push(3);
		x.push(8);
		x.push(6);
		x.push(1);
		x.pop(true);
		//System.out.println(x.getTop(false));
		x.printNode(true); */
		
		Queue y = new Queue();
		y.enqueue(2);
		//y.dequeue();
		y.enqueue(5);
		y.enqueue(9);
		//y.enqueue(24);
		//y.dequeue();
		//y.dequeue();
		//y.enqueue(4);
		y.insertElmAt(1, 3);
		y.enqueue(45);
		//y.dequeue();
		//y.insertElmAt(1, 25);
		//System.out.println(y.getFront());
		//System.out.println(y.getRear());
		y.printNode();
	}
}
