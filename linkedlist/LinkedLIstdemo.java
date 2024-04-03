
public class LinkedLIstdemo {

    public static void main(String[] args) {
        LinkedLIst ll=new LinkedLIst();
        
         ll.add(10);
         ll.add(20);
         ll.add(30);
         
        ll.addfirst(5);

        ll.add(0,-1);

        ll.removefirst();

        ll.removelast();

        ll.printlinklist();
          
    }
}