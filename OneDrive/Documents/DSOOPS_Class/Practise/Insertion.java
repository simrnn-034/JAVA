public class Insertion{
    public static void main(String[] args){
        int [] arr={9,2,6,4,7,8,1,3,5};
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }

    }
}