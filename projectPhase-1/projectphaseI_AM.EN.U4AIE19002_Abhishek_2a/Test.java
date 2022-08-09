import java.util.Scanner;
public class Test {
	 
    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        
        int a = in.nextInt();
        if (a <= 0 && a >= 100) {
        	
            System.out.println("Input not Accepted");
            System.exit(0);
        }
        
        ArrayQueue q = new ArrayQueue(a);
        
        int n;
        int val;
        
        while (true) {
            n = in.nextInt();
            if (n == 1) {
                val = in.nextInt();
                q.enqueue(val);
            } 
            else if (n == 2) {
                int m = q.dequeue(q);
                if (m == 0) {
                    System.out.println("EMPTY");
                } 
                else {
                    System.out.println(m);
                }
            } 
            else if (n == 3) {
                int m = q.peek(q);
                if (m == 0) {
                    System.out.println("EMPTY");
                } 
                else {
                    System.out.println(m);
                }
            } 
            else if (n == 4) {
                q.show(q);
                System.out.println("");
            } 
            else if (n == 0) {
                break;
            }
        }
    }
}
