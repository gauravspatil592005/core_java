public class Multi_arr {
    public static void main(String[] args) {
        int [][]arr = {
            {20,30,40},{50,60,70}
        };
        System.out.println(arr);
        for(int i=0;i<arr.length;i++){
            // System.out.println(arr[i].length);
            for(int j=0;j < arr[i].length ;j++){
                   System.out.println(arr[i][j] + " ");
            }

        }
    }
}
