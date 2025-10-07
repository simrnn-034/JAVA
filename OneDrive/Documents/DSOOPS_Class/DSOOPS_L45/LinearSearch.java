package DSOOPS_L45;
import java.util.Scanner;
public class LinearSearch{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        int target=input.nextInt();
        for(int i=0;i<5;i++){
            if(arr[i]==target){
                System.out.println("index: "+i);
                return ;
            }
          input.close();

        }
        System.out.println("Not found");


    }
}