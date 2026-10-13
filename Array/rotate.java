import java.util.Scanner;

public class rotate {
    public static void main(String[] args){
        //rotate clockwise-- Leetcode 189
     Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        sc.close();
        palto(nums,0,nums.length-1);
        palto(nums,0,k-1);
        palto(nums,k,nums.length-1);
        for(int el:nums){
            System.out.print(el+" ");
        }
    }
    public static void palto(int[] arr,int i,int j){
   while(i<j){
    //reverse logic
    int temp=arr[j];
    arr[j]=arr[i];
    arr[i]=temp;
    i++;j--;
   }
    }
}
