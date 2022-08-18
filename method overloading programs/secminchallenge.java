//now for output 01h 01m 00s we have to use if else and add "0 "if less than 10
//then return value for hour min and sec 

public class secminchallenge{
    public static void main(String[] args){
    System.out.println(getDurationString(61, 35));
    System.out.println(getDurationString(345333l));

    }
    public static String getDurationString(long minutes,long seconds){
        if ((minutes<0 ) || (seconds<0) ||(seconds>59) ){
            return "Invalid value ";
        
        }
        long hours=minutes/60;
        long remainingminutes = minutes%60;
        return hours + "h" + remainingminutes + "m" + seconds +"s";
    }
    public static String getDurationString (long seconds){
        if (seconds<0){
            return "invalid valid";
        }
        long minutes= seconds/60;
        long remainingseconds=seconds%60;
       
        return getDurationString(minutes, remainingseconds);

    }
}