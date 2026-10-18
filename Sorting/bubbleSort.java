import java.util.*;
public class bubbleSort {
    public static void print(int[] arr){
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String [] args){
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int[]arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      sc.close();

      for(int a=0;a<arr.length-1;a++){
         int swaps=0;
        for(int b=0;b<arr.length-1-a;b++){
            if(arr[b]>arr[b+1]){
                int temp=arr[b];
                arr[b]=arr[b+1];
                arr[b+1]=temp;
                swaps++;
            }
         
            if(swaps==0) return;
        }   print(arr);
      }
    }
}
