
 public class LinkedQueue {
	
	Node head;
	Node tail;
	Node next;
	Node temp;
	
	int i;
	int tailct;

	LinkedQueue(int j) {
		head = tail = null;
		i = j;
		tailct = -1;
	}

	public boolean isempty() {
		if (head == null) {
			return true;
		}
		else {
			return false;
		}
	}

	public void show(LinkedQueue l) {
		if (isempty()) {
			System.out.println("EMPTY");
		} 
		else {
			temp = l.head;
			while (true) {
				System.out.print(temp.data + " ");
				if (temp == l.tail) {
					break;
				}
				temp = temp.next;
			}
		}
	}

	public void enqueue(int val) {
		Node l = new Node(val);
		if (tailct == i) {
			System.out.println("overflow");
		} 
		else if (isempty()) {
			head = l;
			tail = l;
		} 
		else {
			tail.next = l;
			tail= l;
			tailct++;
		}
	}

	public int peek(LinkedQueue l) {
		if (isempty()) {
			return 0;
		} 
		else {
			return l.head.data;
		}
	}

	public int dequeue(LinkedQueue l) {
		int j = 0;
		if (isempty()) {
			return 0;
		}
		else if (tail == head) {
			j = head.data;
			head = null;
			tail = null;
			tailct = -1;
			return j;
		}
		else {
			j = head.data;
			head = head.next;
			tailct--;
			return j;
		}
	}
}
