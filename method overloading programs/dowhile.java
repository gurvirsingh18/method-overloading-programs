//declare variable n, rem and sum.calculate sum of digits 
//calculate sum of digits
public class dowhile {
    public static void main(String[] args){
      int n=12;
      int rem;
      int sum=0;
      do { 
        rem=n%10; //123456%10=6
        sum=sum+rem;//0+6=6 
        n=n/10; //123456/10=12345
      }   while(n!=0);
      System.out.println("the sum of digits:"+sum);
    }
    
}
