import java.util.Scanner;
public class Ques03{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]arr= new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

       for(int col=0;col<arr[0].length;col++){
        int sum=0;
        for(int row=0;row<arr.length;row++){
            sum+=arr[row][col];
        }
        System.out.println(sum);
       }
    }

}