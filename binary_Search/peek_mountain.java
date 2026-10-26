import java.util.*;
public class peek_mountain {

    public static int peek(int[] arr){
     
        int i = 0, j = arr.length - 1;

        while (i < j) {
            int mid = i + (j - i) / 2;

            if (arr[mid] > arr[mid + 1]) {
                j = mid;
            } else {
                i = mid + 1;
            }
        }

        return i;
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
