public class For_ex {

    public static void main(String[] args) {
        int arr[]={3};
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){

     
            System.out.println(arr[i]+"even");
            }else{
                System.out.println("odd");
            }
           
        }
    }
}