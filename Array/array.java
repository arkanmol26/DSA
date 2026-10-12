public class array{

    public static int place(int[] arr,int x){
        return arr[x];
        
    }
    public static void main(String [] args){
        int[] arr={2,4,5,6,7,5};
    //    System.out.println( place(arr,2));
    //    System.out.println( place(arr,-1));
    System.out.println(place(arr,4));
    try{
        System.out.print(place(arr,-2));
    }
    catch (Exception e){
      System.out.println("array out of bound");
    }


    }
}