package tugas;
import tugas.Stack;
import tugas.SpecialStack;

public class main {
	public static void main (String[] args) {
		SpecialStack x = new SpecialStack();
		x.push(3);
		x.push(8);
		x.push(6);
		x.push(1);
		x.pop(true);
		//System.out.println(x.getTop(false));
		x.printNode(true);
	}
}
