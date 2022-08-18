public class methodcontrol{
    public static void m2()
    {
        System.out.print("m2");
    }
    public static void m1(){
        m2();
        System.out.print("m1");

    }
    public static void main(String[] args){
        m1();
        System.out.print("main");
    }
    
}