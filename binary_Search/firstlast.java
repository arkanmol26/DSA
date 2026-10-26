import java.util.*;
public class firstlast {
    public static void main(String [] ags){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int x=0,y=arr.length-1,first=-1;
        while(x<y){
           int mid=x+(y-x)/2;
           if(arr[mid]>target) y=mid-1;
           else if(arr[mid]<target) x=mid+1;
           else{
              first=mid;
              y=mid-1;
           }
        }
        if(first==-1)System.out.print(arr);
        else{
            System.out.println("first occurence: "+first);
           for(int s=first; s<=arr.length-1  && arr[s]==target;s++){
           first=s;
        }
        System.out.println("last occ: "+ first);
        }
        sc.close();
    }
}
