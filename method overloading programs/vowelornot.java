//to check wheather the given char is vowel or not

import java.util.*;
class vowelornot{
    public static void main(String[] args){
        try (Scanner sc=new Scanner(System.in)){
           System.out.println("enter character:");
           char ch =sc.next().charAt(0);
           charvowelornot(ch);
        }

    }

    public static void charvowelornot(char myletter ){
        
        switch(Character.toLowerCase(myletter)){
          case 'a':
           System.out.println("it is a vowel ");
           break ;
           case 'e':
           System.out.println("it is vowel");
           break;
           case 'i':
           System.out.println("it is vowel ");
           break;
           case 'o':
           System.out.println("it is vowel");
           break;
           default:
           System.out.println("oops!not vowel");
           
    }
}
}