public class evensum {
    public static boolean iseven(int num){
        if(num<0)
          return false;
        if(num%2==0)
        return true;
        return false;
    }
    public static int sumEven(int start,int end){
        if(end<start)
        return -1;
        if (start<=0 || end<=0)
        return -1;
        int sum=0;
        for(int i=start;i<=end;i++){
            if(iseven(i))
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(sumEven(3,2));
        System.out.println(sumEven(-334, 100));
        System.out.println(sumEven(10, 10));
    }
}
