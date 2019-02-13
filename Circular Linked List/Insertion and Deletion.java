class Node 
{
    Node next;
    Node prev;
    int data;
    Node(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
class Circular
{
    Node head;
    Node tail;
    public void insertEnd(int data)
    {
        Node n = new Node(data);
        if(head==null)
        {
            n.next=n;
            n.prev=n;
            head=n;
            tail=n;
        }
        else 
        {
            tail.next=n;
            n.prev=tail;
            n.next=head;
            head.prev=n;
            tail=n;
        }
    }
    public void insertBeg(int data)
    {
        Node n= new Node(data);
         if(head==null)
        {
            n.next=n;
            n.prev=n;
            head=n;
            tail=n;
        }
         else
         {
             n.next=head;
             head.prev=n;
             n.prev=tail;
             tail.next=n;
             head=n;
         }
        
    }
    public void traverseClock()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        else 
        {
            Node t=head;
             //System.out.println("Elements Are");
            while(t.next!=head)
            {
               
                System.out.print(t.data+" ");
                t=t.next;
            }
            System.out.print(t.data);
        }
    }
 public void delBeg()
{
     if(head==null)
     {
         System.out.println("List is EMpty");
     }
     else 
     {
         head=head.next;
         head.prev=tail;
         tail.next=head;
     }
}
 public void delEnd()
 {
     if(head==null)
     {
         System.out.println("List is Empty");
     }
     else
     {
         Node t=tail.prev;
         t.next=head;
         head.prev=t;
         tail=t;
     }
 }
 public int length()
 {
     Node t=head;
     int c=0;
     while(t.next!=head)
     {
         c++;
         t=t.next;
     }
     return c+1;
 }
 public void insertAny(int pos,int d)
 {
     Node n = new Node(d);
     if(head==null)
     {
         System.out.println("list is Empty");
     }
     else if(pos==1)
     {
         insertBeg(d);
     }
     else if(pos==length()+1)
     {
         insertEnd(d);
     }
     else if(pos>length()+1 || pos<=0)
     {
          System.out.println("Enter Valid Position");
     }
     else 
     {
         int ct=0;
         Node t=head;
         while(ct<pos-1)
         {
             ct++;
             t=t.next;
         }
         n.next=t;
         t.prev.next=n;
         n.prev=t.prev;
         t.prev=n;
     }
 }
 public void delAny(int pos)
 {
     if(head==null)
     {
         System.out.println("list is Empty");
     }
     else if(pos==1)
     {
         delBeg();
     }
     else if(pos==length())
     {
         delEnd();
     }
     else if(pos>length() || pos<=0)
     {
          System.out.println("Enter Valid Position");
     }
     else 
     {
         int ct=0;
         Node t=head;
         while(ct<pos-1)
         {
             ct++;
             t=t.next;
         }
        t.prev.next=t.next;
     }
 }
}
public class output
{
    public static void main(String x[])
    {
        Circular cl = new Circular();
        cl.insertEnd(1);
         cl.insertEnd(2);
          cl.insertEnd(3);
           cl.insertAny(1,19);
           System.out.println("Insertion at any position");
           cl.traverseClock();
           System.out.println();
           System.out.println("Deletion at any position");
           cl.delAny(2);
           cl.traverseClock();
    }
}
