import java.util.*;
import java.io.*;

class BSTNode
{
    String contactname;
    String email;
    String phonenumber;
    BSTNode left;
    BSTNode right;
    BSTNode() {}

    BSTNode(String contactname,String email,String phonenumber)
    {
        this.contactname=contactname;
        this.email=email;
        this.phonenumber=phonenumber;
    }


    public void insert(String contactname,String email,String phonenumber)
    {
        if((contactname.compareToIgnoreCase(this.contactname)<0))
        {
            if(left==null)
            {
                left=new BSTNode(contactname,email,phonenumber);
            }
            else
            {
                left.insert(contactname,email,phonenumber);
            }
        }
        if(contactname.compareToIgnoreCase(this.contactname)>0)
        {
            if(right==null)
            {
                right=new BSTNode(contactname,email,phonenumber);
            }
            else
            {
                right.insert(contactname, email, phonenumber);
            }
        }
	}

    public String search(String contactname)
    {
		if(contactname.equals(this.contactname))
        {
            String s=this.contactname+","+this.email+","+this.phonenumber;
            return s;
		}
        else if((contactname.compareToIgnoreCase(this.contactname)<0) && (left!=null))
        {
            return left.search(contactname);
		}
        else if((contactname.compareToIgnoreCase(this.contactname)>0) && (right!=null))
        {
			return right.search(contactname);
		}
        else
        {
            return "no contact found please check";
		}
	}

    public String displayfirst()
    {
		if (left==null)
        {
            String s=this.contactname+","+this.email+","+this.phonenumber;
            return s;
		}
        else
        {
			return left.displayfirst();
		}
	}

	public String displaylast()
    {
		if (right==null)
        {
            String s=this.contactname+","+this.email+","+this.phonenumber;
            return s;
		}
        else
        {
			return right.displaylast();
		}
	}

    public void display()
    {
		if(left!=null)
        {
			left.display();
		}
		System.out.println(contactname+","+email+","+phonenumber);
		if(right!=null)
        {
			right.display();
		}
	}
}

class BST
{
    BSTNode root;

    BST()
    {
        root=null;
    }

    BST(String contactname,String email,String phonenumber)
    {
        root.contactname=contactname;
        root.email=email;
        root.phonenumber=phonenumber;
    }

    public void display()
    {
        if (root==null)
        {
            return;
        }
        else
        {
            root.display();
        }
    }

    public String displayfirst()
    {
        if (root==null)
        {
            return "";
        }
        else
        {
            return root.displayfirst();
        }
    }

    public String displaylast()
    {
        if (root==null)
        {
            return "";
        }
        else
        {
            return root.displaylast();
        }
    }

    public String search(String contactname)
    {
        if (root==null)
        {
            return "";
        }
        else
        {
            return root.search(contactname);
        }
    }

    public void insert(String contactname,String email,String phonenumber)
    {
        if (root==null)
        {
            root=new BSTNode(contactname,email,phonenumber);
        }
        else
        {
            root.insert(contactname,email,phonenumber);
        }
    }
}

public class Directory
{
    public static void main(String [] args)
    {
        try
        {
            BST d=new BST();
            String contactname;
            String email;
            String phonenumber;
            String arr[];
            File contact=new File("mycontacts.txt");
            Scanner scan=new Scanner(contact);
            while (scan.hasNextLine())
            {
                String s=scan.nextLine();
                arr=s.split("\\s");
                contactname=arr[0];
                email=arr[1];
                phonenumber=arr[2];
                d.insert(contactname,email,phonenumber);
            }
            scan.close();
            Scanner in=new Scanner(System.in);
            while(true)
            {
                System.out.println("0.exit  1.diplay  2.displayfirst  3.displaylast  4.search 5.Insert");
                System.out.print("What would you like to do? ");
                int z=in.nextInt();
                in.nextLine();
                if(z==0)
                {
                    break;
                }
                else if(z==1)
                {
                    d.display();
                }
                else if(z==2)
                {
                    String s=d.displayfirst();
                    System.out.println(s);
                }
                else if(z==3)
                {
                    String s=d.displaylast();
                    System.out.println(s);
                }
                else if(z==4)
                {
                    System.out.println("Enter name");
                    String s=in.nextLine();
                    String a=d.search(s);
                    System.out.println(a);
                }
                else if(z==5)
                {
                    System.out.print("Enter contactname:");
                    String contactname1 = in.nextLine();
                    System.out.print("Enter e-mail:");
                    String email1 = in.nextLine();
                    System.out.print("Enter contactnum");
                    String contactnumber1 = in.nextLine();
                    d.insert(contactname1,email1,contactnumber1);
                }
                else
                {
                    System.out.println("Please Check the number");
                }
            }
            in.close();
        } catch (FileNotFoundException file_error) {
            System.out.println("File not found");
            file_error.printStackTrace();
        }
    }
}
