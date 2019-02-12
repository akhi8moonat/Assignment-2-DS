class Node {
    Node next;
      int data;
             Node(int data)
              {
                  this.next=null;
                  this.data=data;
    }
}
class Singly
{
    Node head;
  public void insertBeg(int data)
  {
      Node n=new Node(data);
        if(head==null)
        {
            head=n;
        }
        else 
        {
            n.next=head;
            head=n;
        }
  }
  public void insertEnd(int data)
  {
      Node n=new Node(data);
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
  public void delBeg()
  {
      if(head==null)
      {
          System.out.println("List is Empty");
          return ;
      }
      else 
      {
      Node t=head;
      t=t.next;
      head=t;
      }
  }
  public void delEnd()
  {
     if(head==null)
     {
          System.out.println("List is Empty");
          return ;
     }
     else 
     {
         Node t=head;
         while(t.next.next!=null)
         {
             t=t.next;
         }
         t.next=null;
     }
  }
  public void insertAny(int pos,int d)
  {
      Node n=new Node(d);
      Node t=head;
      int c=0;
      if(pos==1 || head==null)
      {
          insertBeg(d);
      }
      else if(pos>length()+1 || pos<=0)
      {
          System.out.println("Enter Valid Position");
      }
      else if(pos==length()+1)
      {
          insertEnd(d);
      }
      else
      {
          Node p=head;
      while(c<pos-1)
      {
          c++;
          p=t;
          t=t.next;
      }
      n.next=t;
      p.next=n;
      }
  }
  public int length()
  {
      Node t=head;
      int c=0;
      while(t!=null)
      {
          c++;
          t=t.next;
      }
      return c;
  }
  public void delAny(int pos)
  {
      if(pos>length() || pos<=0)
      {
          System.out.println("Enter Valid Position");
      }
      else if(pos==1)
      {
          delBeg();
      }
      else if(pos==length())
      {
          delEnd();
      }
      else 
      {
          if(head==null)
          {
              System.out.println("List is Empty");
              return ;
          }
          else 
          {
              Node t=head;
              int c=0;
              Node p=head;
              while(c<pos-1)
              {
                  c++;
                  p=t;
                  t=t.next;
              }
              p.next=t.next;
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
 class Main
{
    public static void main(String x[])
    {
        Singly dl=new Singly();
        dl.insertBeg(1);
        dl.insertBeg(2);
        dl.insertBeg(3);
        System.out.println("Insertion at Beginning");
        dl.print();
        System.out.println();
        dl.insertEnd(11);
        dl.insertEnd(12);
        dl.insertEnd(13);
        System.out.println("Insertion at End");
        dl.print();
         System.out.println();
         System.out.println("Deletion at Beginning");
         dl.delBeg();
         dl.print();
         System.out.println();
         System.out.println("Deletion at End");
         dl.delEnd();
         dl.print();
         System.out.println();
         System.out.println("Insertion at any Position");
         dl.insertAny(1,15);
        dl.print();
         System.out.println();
         System.out.println("Deletion at any Position");
         dl.delAny(3);
        dl.print();
         
    }
}
