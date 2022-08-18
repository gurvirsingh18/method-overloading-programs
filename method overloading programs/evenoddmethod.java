//print  even or odd using method 
//control transfer to method
import java.util.Scanner;
public class evenoddmethod {
    public static void main(String[] args){
    try(Scanner sc=new Scanner(System.in)){
     System.out.print("enter the number: ");
     int num =sc.nextInt();
     evenorodd(num);
    }

    }
   
    
    public static void evenorodd(int num){
        if(num%2==0)
         System.out.println (num + "is even");
        
        else
            System.out.println( num + "is odd");
        
    }
    
    
}
