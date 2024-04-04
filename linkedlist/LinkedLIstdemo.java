
public class LinkedLIstdemo {

    public static void main(String[] args) {
        LinkedLIst ll=new LinkedLIst();
        
         ll.add(10);
         ll.add(20);
         ll.add(30);
         
        ll.addfirst(5);

        ll.add(0,-1);
        int elements[]={1,2,3};
        ll.addAll(elements);
        ll.printlinklist();
          
    }
}