import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		
		int j = in.nextInt();
		if (j <= 0 && j >= 100) {
			System.out.println("Input Not Accepted");
			System.exit(0);
		}
		
		LinkedQueue l = new LinkedQueue(j);
		int i;
		int val;
		while (true) {
			i = in.nextInt();
			if (i == 1) {
				val= in.nextInt();
				l.enqueue(val);
			} 
			else if (i == 2) {
				int m = l.dequeue(l);
				if (m == 0) {
					System.out.println("EMPTY");
				} 
				else {
					System.out.println(m);
				}
			} 
			else if (i == 3) {
				int m = l.peek(l);
				if (m == 0) {
					System.out.println("EMPTY");
				} 
				else {
					System.out.println(m);
				}
			}
			else if (i == 4) {
				l.show(l);
				System.out.println("");
			} 
			else if (i == 0) {
				break;
			}
		}
	}
}
