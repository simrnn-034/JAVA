package DSOOPS_L52;

public class Ques3 {
    public static void main(String[] args) {
        Person p1=new Person("Simran","Punjab");
        p1.display();
    }
    
}
class Person{
    public String name;
    private String address;

    Person(String name,String address){
        this.name=name;
        this.address=address;
    }

    void display(){
        System.out.println(name);
        System.out.println(address);
    }
}
