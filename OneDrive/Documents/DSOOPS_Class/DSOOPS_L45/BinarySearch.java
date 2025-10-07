package DSOOPS_L45;
import java.util.Scanner;
public class BinarySearch{
    public static void main(String[] args){
         Scanner input=new Scanner(System.in);
         int [] arr={1,2,3,4,5,6,7,8,9,10};
         int start=0;
         int end=arr.length-1;
         int target=input.nextInt();
         while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                return;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
             input.close();
         }
         System.out.println("Not found");
        
    }
}