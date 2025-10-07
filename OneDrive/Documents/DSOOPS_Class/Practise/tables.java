
import java.util.Scanner;
public class tables {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        for (int i=1;i<=5;i++){
            for(int j=0;j<=10;j++){
                System.out.println(i + "*" +j+"="+ " "+ i*j);
            }
        }
    }
}
