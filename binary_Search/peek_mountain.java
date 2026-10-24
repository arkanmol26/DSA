import java.util.*;
public class peek_mountain {

    public static int peek(int[] array){
        int i=0,j=array.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(array[mid]>array[mid-1] && array[mid]>array[mid+1]) return mid;
            if(array[mid]>array[mid-1] && array[mid]<array[mid+1]) i=mid+1;
            if(array[mid]<array[mid-1] && array[mid]>array[mid+1]) j=mid-1;
            
            
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int x=peek(arr);
        System.out.println(x);
    }
}
