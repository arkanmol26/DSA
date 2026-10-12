import java.util.*;
class secmax{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int largest=Integer.MIN_VALUE;
        int slargest=Integer.MIN_VALUE;




        for(int a:arr){
            if(a>largest){
                slargest=largest;
                largest=a;
            }
            else if(a>slargest && a<largest){
                slargest=a;
            }

        }
        System.out.println(slargest);
       
    }

}