 
public class areacalculator {
    public static void main(String[] args){
    area(-5554);
    area(3, -4);
    }
    public static double area(double radius)
        {
        if(radius<0.0)
            return -1.0;
            double areaofcircle=(radius*radius*Math.PI);
            System.out.println("area of circle is:"+areaofcircle);
            return areaofcircle;
           
        }
       public static double area(double x,double y){
        if(( x<0.0) || (y<0.0))
        return -1.0;
         double areaofrectangle = (x*y);
         System.out.println("the area of rectangle is: "+areaofrectangle);
         return areaofrectangle;
        
       }


    
}
