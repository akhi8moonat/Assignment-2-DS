class Node 
{
     int data;
     Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class Link
{
    Node head; 
    public void create(int data)
    {
        Node n = new Node(data);
        if(head==null)
        {
            head=n;
        }
        else 
        {
        Node t=head;
        while(t.next!=null)
        {
            t=t.next;
        }
        t.next=n;
        }
    }
    public void del(int z)
    {
        Node t=head;
        Node p=head;
        while(t.data!=z)
        {
            p=t;
            t=t.next;
        }
        p.next=t.next;
    }
    public void cancelOut()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
            return ;
        }
        else 
        {
        Node t=head;
        Node z=head;
        while(t!=null)
        {
            z=t.next;
            while(z!=null)
            {
             if(t.data+z.data==0)
             {
                 del(t.data);
                 del(z.data);
             }
             z=z.next;
            }
            t=t.next;
        }
        }
    }
    public void print()
    {
        Node t=head;
        while(t!=null)
        {
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
}
public class Main
{
    public static void main(String z[])
    {
    Link l = new Link();
    l.create(1);
    l.create(6);
    l.create(3);
    l.create(4);
    l.create(-3);
    l.create(-4);
    l.create(5);
    System.out.println("Output After Cancelling Out Elements");
    l.cancelOut();
    l.print();
   }
}
