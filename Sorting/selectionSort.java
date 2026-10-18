import java.util.Scanner;
public class selectionSort{
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
      selectionsort(arr);
    }
    public static void selectionsort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
          int minindex=i;
          for(int j=i+1;j<arr.length;j++){
            if(arr[j]<arr[minindex]) minindex=j;
          }
          if(minindex!=i){
            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
           
          } 
          print(arr);
        }
    }
}