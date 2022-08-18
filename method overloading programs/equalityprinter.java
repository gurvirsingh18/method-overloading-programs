public class equalityprinter {
    public static void printequal(int num1, int num2,int num3){
       if ((num1<0) || (num2<0) ||(num3<0)){

       System.out.println("invalid value ");
       }
        else if(num1==num2 && num1==num3 && num2==num3) {
        System.out.println("all numbers are equal");
       }
        else if(num1!=num2 && num1!=num3 && num2!=num3){
            System.out.println("all numbers are different");

        }
        else {
            System.out.println("niether all are equal or different");
        }
   
    }
    public static void main(String[] args){
        printequal(1, 1, 1);
        printequal(1,1, 2);
        printequal(-1, -1, -1);
        printequal(1,2, 3);

    }
    
}
