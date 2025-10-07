 import java.util.Scanner;
 public class Ques02{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int maths = sc.nextInt(); 
        int science = sc.nextInt(); 
        int english = sc.nextInt(); 
        int total = 0;       
        total += maths;      
        total += science;    
        total += english;   
       
        if (maths >= 40 && science >= 40 && english >= 40) {  
            System.out.println("passed all subjects!");
        } 
        
        else if (maths < 40 || science < 40 || english < 40) { 
            System.out.println("grace");
        } 
        else {
            System.out.println("Failed!");
        }

        
        int average = total / 3;
        int grade = (average >= 75) ? 1 : (average >= 50) ? 2 : 3;
        System.out.println("Your Grade: " + grade);

        System.out.println("Total Marks: " + total);
        sc.close();
    }}

 

    