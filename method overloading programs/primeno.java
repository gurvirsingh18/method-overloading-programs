// write a program to check if entered no is prime no.
//if count of factors if greater than 2(count>2)
//the no.is not prime else prime if n<2(0,1,2are not prime no.)
import java.util.*;
public class primeno {
    public static void main(String[] args){
        try(Scanner sc=new Scanner(System.in)){
         System.out.println("enter no." );
         int num=sc.nextInt();
         checkprime(num);
        }

    }
     public static void checkprime(int n){
       int count=0;
       //negative no. 0,1 are not prime no.
       if (n<2){
        System.out.println("the given no" +n+ "is not prime" );
       }
       //check the no.of divisors b/w [1,n]
       for( int i=1;i<=n;i++){
        if(n%i==0)
        count=count+1;
       }
       //if count of divisors is greater than 2 it not prime 
       if(count>2){
        System.out.println("the given no."+n+ "is not prime " );
       }
       else{
        System.out.println("the given no."+n+ "is prime ");
       }

     }  
    
}
