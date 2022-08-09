import java.util.*;
import java.lang.String;

class Node{
	Node next;
	int data;
	Node(int u)
	{
		data=u;
		next=null;
	}
}

class LinkedStack {
    int n;
    Node head;
    Node next;
    Node temp;
    int top;

    LinkedStack(int z)
    {
        head=null;
	n=z;
	top=-1;
    }

    public void show(LinkedStack stk)
    {
        if(head==null)
        {
                System.out.print(" It is EMPTY");
        }
        else
        {       temp=head;
		while(temp!=null)
                {
                        System.out.print(temp.data+" ");
			temp=temp.next;
                }
        }
        System.out.println("");
    }

    public void push(int item)
    {	
	Node z;
	Node o=new Node(item);
        if (top==n-1)
        {
            System.out.println("OVERFLOW");
        }
        else
        {
            top++;
	    z=head;
            head=o;
	    head.next=z;
        }
    }

    public void pop()
    {
        Node z;
	if (top==-1)
        {
            System.out.println("EMPTY");
        }
        else
        {   
            top--;
	    z=head;
	    head=head.next;
            System.out.println(z.data);
        }
    }

    public void peek()
    {
        int p;
        if(top==-1)
        {
                        System.out.println("EMPTY");
        }
        else
        {
                System.out.println(head.data);
        }
    }
}

class main
{
        public static void main(String[] args)
        {
                Scanner in=new Scanner(System.in);
                int z=in.nextInt();
                if(z<=0&&z>=100)
		{
			System.out.println("Please check Input");
			System.exit(0);
		}
		LinkedStack stk=new LinkedStack(z);
                int n;
                int item;
                while(true)
                {
                        n=in.nextInt();
                        if(n==1)
                        {
                                item=in.nextInt();
                                stk.push(item);
                        }
                        else if(n==2)
                        {
                                stk.pop();
                        }
                        else if(n==3)
                        {
                                stk.peek();
                        }
                        else if(n==4)
                        {
                                stk.show(stk);
                        }
                        else if(n==0)
                        {
                                break;
                        }
                }
        }
}