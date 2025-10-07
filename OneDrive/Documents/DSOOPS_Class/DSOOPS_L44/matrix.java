// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class matrix{
    public static void main(String[] args) {
      

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        int [][]arr= new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=input.nextInt();
            }
        }
        int product=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==j){
                    product*=arr[i][j];
                }

            }

        }
        for(int i=0;i<n;i++){
            arr[i][i] = product;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        input.close();
        
    }
}
