//implement while loop when no. of iteration is not fixed
// for loop is iteration when no.of iteration is fixed
//do while when iteration is not fixed but should be once executed
 
//printing 1 to 10 using while, for,
public class whileloop {
    public static void main(String[] args){
    //   int count =1;
        // while(count !=10){
        //     System.out.println("the count is:" +count);
        // count++;
        
    
    // for (count =1;count<10;count++){
    //     System.out.println("the count is:"+count);
        
    // }
    //infinte loop using while will break only if condition 
    //  while(true){
    //     if(count==10){
    //         break;
    //     }
    //     System.out.println("the count is "+count);
    //     count++;
    //  }
    // do{
    //     System.out.println("the count is:"+count);
    //     count++;    
    // }while(count!=10);

 //write a method to predict if no.is odd, if odd return true else false
  //in main print odd no.b/w 5 to 30 using while.
      int num=4;
      int maxnum=29;
      while(num<=maxnum){
        num++;
        if(!oddnumcheck(num)){
            continue;
        }
        System.out.println("the odd number is "+num);

      }

    } 
      public static boolean oddnumcheck(int number){
        if((number%2)==1){
            
            return true;
        }
        else{
            
            return false;
        }
      }


}