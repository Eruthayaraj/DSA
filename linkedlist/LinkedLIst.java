public class LinkedLIst {
    Node head;

    //print the linklist
    void printlinklist()
    {
        Node curr=head;
        while (curr!=null) {
            System.out.println(curr.data);
            curr=curr.next;
        }
    }

    //add method in linklist
    
    void add(int e)
    {
        Node temp=new Node(e);
        if(head==null)
        head=temp;
        else{
        Node curr=head;
        while (curr.next!= null) {
            curr=curr.next;
        }
        curr.next=temp;
        }

    }

    // addAindia method
    void addAll(int [] elements)
    {
       for(int element : elements){
        add(element);
       }
    }

    //add first mthod
    void addfirst(int e)
    {
        Node temp=new Node(e);
        if(head==null)
        head=temp;
        else
        {
            temp.next=head;
            head=temp;
        }
        }

    // add method for particular index
    void add(int index,int e) throws IndexOutOfBoundsException{
      try{
        if(index==0){
            addfirst(e);
        }
        else{
            Node temp=new Node(e);
            int count=0;
            Node curr=head;
            while (count < index-1) {
               curr=curr.next;
               count++;
            }
            temp.next=curr.next;
            curr.next=temp;
        }
      }
      catch(NullPointerException ie)
      {
       throw new IndexOutOfBoundsException();
      }
    }

   // remove first element
    void removefirst(){
      if(head==null){}
      else if(head.next==null){
        head=null;
      }
      else{
        head=head.next;
      }
    }



    // remove last elemnet
    void  removelast()
    {
        if(head==null){}
        else if(head.next==null){
        head=null;
        }
        else{
            Node curr=head;
            while (curr.next.next!=null) {
                curr=curr.next;   
            }
            curr.next=null;
        }

    }
}
