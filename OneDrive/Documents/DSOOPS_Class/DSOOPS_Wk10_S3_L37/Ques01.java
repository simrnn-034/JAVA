 import java.util.Scanner;
public class Ques01{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        int sum=a+b;
        int sub=a-b;
        int div=a/b;
        int mul=a*b;
        System.out.println("The sum is:"+sum);
        System.out.println("The sub is:"+sub);
        System.out.println("The division is:"+div);
        System.out.println("the mul is:"+mul);
    


    }
}