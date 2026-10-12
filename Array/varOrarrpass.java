public class varOrarrpass{

    public static int change(int x){
        x=1;
        return x;
    }
    public static void change(int[] arr){
        arr[2]=69;

    }
    public static void main(String [] args){
        int x=3;
        change(x);//change by value
        System.out.println(x);
        int[] arr={2,3,4,5,6,7};
        change(arr);//refernce change
        System.out.println(arr[0]);
        System.out.println(arr[2]);
    }
}