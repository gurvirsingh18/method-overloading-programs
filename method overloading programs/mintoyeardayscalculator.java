public class mintoyeardayscalculator {
    private static final String INVALID_MESSAGE="invalid value";

    public static void  printyearanddays(long minutes){
       if(minutes<0){
        System.out.println(INVALID_MESSAGE);
       }
       else{
        long years= minutes/525600;
        long minutesremaining =(minutes-(years*525600));
        long dayremaining=minutesremaining/1440;
        System.out.println(minutes +"m="  + years + "y and " + dayremaining +" d"   );
        
       }
    }
       public static void main (String[] args){
        printyearanddays(525600);
       }
    
    
}
