 class sumofarray {

    public static int sumofarray(int[] arr)
    {
     int sum=0;
     for(int i:arr)
        sum= sum+i;
        return sum;

    }
    public static void main(String[] args){
    System.out.println("The sum of  array is ");
    System.out.println(sumofarray (new int[]{1,2,3,4,5,6,7,8}));
    }
}
