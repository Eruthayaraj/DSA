package Recursion;
public class Factorialdemo {
   static int sum=0;
    public static void main(String[] args) {
       factorial(5);
    }
   static void factorial(int n){
       if(n<1)
       {
        return;
       }
        sum=sum+n;
        System.out.println(sum);
        factorial(n-1);

   }
}

