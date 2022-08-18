//use method to print number 
import java.util.Scanner;

class switchcasechallenge{
       public static void printnumberinword(int num)
       {
           switch(num){
             case 0:
             System.out.println("ZERO");
             break;
             case 1:
             System.out.println("FIRST");
             break ;
             case 2:
             System.out.println("second");
             break;
             case 3:
             System.out.println("third");
             break;
             case 4:
             System.out.println("four");
             break;
             case 5:
             System.out.println("five");
             break;
             case 6:
             System.out.println("six");
             break;
             case 7:
             System.out.println("seven");
             break;
             case 8:
             System.out.println("eight");
             break;
             case 9:
             System.out.println("nine");
             break;
             default:
             System.out.println("Other ");
             break;
           }
       }
       public static void main(String[] args){
        System.out.println("enter the number:"); 
        try (Scanner sc= new Scanner(System.in)){
       int num=sc.nextInt();
       printnumberinword(num);
        }
       }
}