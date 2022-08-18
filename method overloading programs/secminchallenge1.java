
public class secminchallenge1 {
    private static final String INVALID_VALUE_MESSAGE="invalid value ";
    public static void main(String[] args){
   System.out.println(getDurationString(65, 9));
   System.out.println(getDurationString(4554));
   System.out.println(getDurationString(3,4));
   System.out.println(getDurationString(-42));


    }
    public static String getDurationString(long minutes,long seconds){
       
        if((minutes<0) || (seconds<0)||(seconds>59) ){
        return INVALID_VALUE_MESSAGE;
       }
    long hours= minutes/60;
    long remainingminutes=minutes%60;

    String hourString= hours+ "h";
    if(hours<10){
        hourString= "0"+ hourString;
     }
     String minutesString= remainingminutes +"m";
     if( remainingminutes<10){
        minutesString= "0" + minutesString;
     }
     String secondString=seconds+ "s";
     if( seconds<10){
        secondString=  "0" +secondString;
     }
    return hourString+ " "+ minutesString +" "+ secondString +" ";

    }
    public static String getDurationString(long seconds){
        if(seconds<10){
            return INVALID_VALUE_MESSAGE;
        }
        long minutes= seconds/60;
        long remainingseconds= minutes%60;
        return getDurationString(minutes, remainingseconds);
    }




}

