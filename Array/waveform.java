import java.util.Scanner;

public class waveform{
    public static void main(String [] args){
         Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        sc.close();
        print(nums);
        for(int i=1;i<nums.length;i=i+2){
         int temp=nums[i-1];
         nums[i-1]=nums[i];
         nums[i]=temp;

    }
      print(nums);
}
public static void print(int[] arr){
    for(int el:arr){
        System.out.print(el+" ");
    }
    System.out.println();
}
}