

 public class ArrayQueue {
    int[] arr;
    int head,tail;
    int i;

    ArrayQueue(int a) {
        arr = new int[a];
        head = -1;
        tail = -1;
        i = a;
    }

    public boolean isempty() {
        if (head == -1 && tail == -1) {
            return true;
        } 
        else {
            return false;
        }
    }

    public void show(ArrayQueue aq) {
        if (isempty()) {
            System.out.println("EMPTY");
        } 
        else {
            int i = head;
            while (true) {
                System.out.print(aq.arr[i] + " ");
                if (i == tail) {
                    break;
                }
                i = (i + 1) % i;
            }
        }
    }

    public void enqueue(int val) {
        if ((tail + 1) % i == head) {
            System.out.println("overflow");
        } 
        else if (isempty()) {
            head = 0;
            tail = 0;
            arr[tail] = val;
        } 
        else {
            tail = (tail + 1) % i;
            arr[tail] = val;
        }
    }

    public int peek(ArrayQueue aq) {
        if (isempty()) {
            return 0;
        } 
        else {
            return aq.arr[head];
        }
    }

    public int dequeue(ArrayQueue aq) {
        int a = 0;
        if (isempty()) {
            return 0;
        } 
        else if (tail == head) {
            a = aq.arr[head];
            head = -1;
            tail = -1;
            return a;
        } 
        else {
            a = aq.arr[head];
            head = (head + 1) % i;
        }
        return a;
    }
}
 
 


			