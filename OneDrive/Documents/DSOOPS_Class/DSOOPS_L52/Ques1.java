package DSOOPS_L52;
    public class Ques1{
        
    public static void main(String[] args) {
        Car c1=new Car("BMW",1999);
        c1.display();
    }
}
class Car{
      public String make;
        public int year;

        Car(String make,int year){
            this.make=make;
            this.year=year;
        }

        void display(){
            System.out.println("the make is: "+this.make+" and year is: "+this.year);
        }
    }
