import java.util.Scanner;

public class Print{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int []arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();

        }

        //printing the code
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
