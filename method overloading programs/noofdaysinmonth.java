//enter month and yr program displays to number of days in month
//month 2 and year 2012 program should display february 2012 and 29 days
import java.util.*;
class noofdaysinmonth{
      public static boolean isleapyear(int year){
        if((year%4==0)||(year%100!=0) &&(year%400!=0))
        return true;
        else 
        return false;
      }
    
        public static void getdaysinmonth(int month,int year)
        {
          if(month <1 || month >12)
          {
            System.out.println("-1");
          return; 
        }
         if (year <1 || year >9999)
         { 
            System.out.println("-1");
            return;
         }
         switch(month){
            case 1:
            System.out.println("january"+year+"has 31 days");
            break;
            case 2:
            System.out.println("february"+year+ "has"  +(isleapyear(year) ?"29 days ":"28 days") );
            break;
            case 3:
            System.out.println("march" +year+ "has 31 days");
            break;
            case 4:
            System.out.println("april" +year+"has 30 days"   ) ;
            break;
            case 5:
            System.out.println("may" +year+ "has 31 days");
            break;
            case 6:
            System.out.println("june"+year+ "has 30 days");
            break;
            case 7:
            System.out.println("july"+year+ "has 31 days");
            break;
            case 8:
	            System.out.println ("August " + year + " has 31 days");
	            break;
            case 9:
	            System.out.println ("September " + year + " has 30 days");
	            break;
            case 10:
	            System.out.println ("October " + year + " has 31 days");
	            break;
            case 11:
	            System.out.println ("November " + year + " has 30 days");
	            break;
            case 12:
	            System.out.println ("December " + year + " has 31 days");
         }
        }
        public static void main(String[] args){
            try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter month");
            int month=sc.nextInt();
            System.out.println("enter year");
            int year=sc.nextInt();
            getdaysinmonth(month,year);

            }
        }
    }