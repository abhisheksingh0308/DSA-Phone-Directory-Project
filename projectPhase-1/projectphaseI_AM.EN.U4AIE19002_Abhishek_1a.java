import java.util.*;
import java.lang.String;
class arrayStack 
{

    int s;
    int top = -1;   
    int[] a;
    arrayStack(int t)
    {
        a=new int[t];
        top=-1;
	s=t;
 
	}
	
    public void show(arrayStack stk)
    {	
        if(top==-1)
	{
		System.out.print("EMPTY");
	}
	else
	{	for (int i=top;i>=0;i--)
        	{
            		System.out.print(stk.a[i]+" ");
       		}
	}
	System.out.println("");
	}
	
    public void push(int thing)
    {
        if (top==s-1)
        {
            System.out.println("OVERFLOW");
        }
        else
        {
            top++;
            a[top]=thing;
        }
	}
	
    public void pop()
    {
        if (top==-1)
        {
            System.out.println(" It is EMPTY");
        }
        else
        {    int ret1=a[top];
            top--;
            System.out.println(ret1);
        }
	}
	
    public void peek()
    {
	int l;
	if(top==-1)
	{
		        System.out.println(" It is EMPTY");
	}
	else
	{
		System.out.println(a[top]);
	}
    }
}

class main
{
	public static void main(String[] args)
	{	
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		if(t<=0 && t>=100)
		{
			System.out.println("Please check Input");
			System.exit(0);
		}

		arrayStack stk=new arrayStack(t);
		int s;
		int thing;

		while(true)
		{	
			s=in.nextInt();
			if(s==1)
			{
				thing=in.nextInt();
				stk.push(thing);
			}
			else if(s==2)	
			{
				stk.pop();
			}
			else if(s==3)
			{
				stk.peek();
			}
			else if(s==4)
			{
				stk.show(stk);
			}
			else if(s==0)
			{
				break;
			}
		}
	}
}

				