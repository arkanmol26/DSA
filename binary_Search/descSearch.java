
import java.util.*;
public class descSearch{
   
    public static void main(String [] args){
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int[]arr=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      int target=sc.nextInt();
      sc.close();
      int left=0,right=arr.length;
      while(left<=right){
        int mid=(left+right)/2;
        if(arr[mid]>target)left=mid+1;
        else if(arr[mid]<target)right=mid-1;
        else 
            {
                System.out.print(arr[mid]+ " at position "+ "at index no:- "+mid);
                return;
            }
      }
      System.out.print("nhi mila bhai..Sorry");
}
}