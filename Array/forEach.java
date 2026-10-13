class forEach{
    public static void main(String [] args){
        int[] arr={1,2,4,5,6,9};
        for(int ele: arr)   //forEach loop is used to just traverse the array..helps in printing any data structure elements
        
            {
            if(ele==arr[arr.length-1]){
                System.out.print(ele ); 
                return;
            }
            System.out.print(ele +" -->");
        }
    }
}