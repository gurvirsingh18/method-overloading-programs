
import java.util.*;
//write a for loop to print prime numbers from 1 to n 
class forloop{
    public static void main(String[] args){
      try( Scanner sc= new Scanner(System.in)){
        System.out.println("enter number");
        int num =sc.nextInt();
        for(int i=1;i<=num;i++)
        checkprime(i);
       }
    }
    public static void checkprime(int n){//n=7
         int count=0; //count=0
         for(int j=1;j<n;j++){  //j=2 to n=6 2
            if(n%j==0){
                count=count+1;
            }

         }
         if (count==2){
            System.out.println(+n+" is a prime number ");
         }
        
    }
}