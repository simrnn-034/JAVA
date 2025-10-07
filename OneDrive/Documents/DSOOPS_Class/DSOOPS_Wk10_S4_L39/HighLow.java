
public class HighLow{
    public static void main(String[] args){
       int n=10;
       int i=1;
       while(i<=n){
       
            if(i<=5)
            {
                System.out.println(i+" :Low");
            }
            else if(i>5){
                System.out.println(i+" :High");
            }
            
            i++;
        }
    }
}