package DSOOPS_L52;

public class Ques2 {
   
    public static void main(String[] args) {
        Access a=new Access("Simran",2006);
        System.out.println(a.name);       
        System.out.println(a.year);
        
        a.display();
    }
}
class Access{
 public String name;
    private int year;

    Access(String name,int year){
        this.name=name;
        this.year=year;
    }

    void display(){
        System.out.println("The name is:"+this.name+" and year is: "+this.year);
    }
}
