package DSOOPS_L46;
public class Selection{
    public static void main(String[] args){
        int[]arr={2,1,7,5,4,8,3};
        int n=7;
        for(int i=0;i<n-1;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        //printing sorted array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}