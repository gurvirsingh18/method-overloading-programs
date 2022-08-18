//taking input from user the first character 
//of color and using switch case print color
import java.util.*;
class printcolor{
    public static void main(String[] args){
      try (Scanner sc= new Scanner(System.in)){
        System.out.println("enter the color ");
        char ch=sc.next().charAt(0);
        colorprinter(ch);
      }
      
    }
      
    
      public static void colorprinter(char firstletter){
       String message="color is ";
         switch (Character.toLowerCase(firstletter)){
            case 'r':
            message=message+"red";
            break;
            case 'g':
            message=message+"green ";
            break;
            case 'b':
            message=message+"blue";
            message=message+"is either blue or black ";
            break;
            case 'y':
            message= message +"yellow";
            break;
            default:
            message=message+"unknown";
          
        }
        System.out.println(message);


      }
    
    }