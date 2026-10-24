
import java.util.*;
public class first_occ {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        sc.close();
        int low=0,high=arr.length-1,first=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<target)low=mid+1;
            else if(arr[mid]>target) high=mid-1;
            else{
                first=mid;
                high=mid-1;
            }
        }
        if(first==-1)System.out.print("element not found");
        else System.out.print(first);
    }
}
