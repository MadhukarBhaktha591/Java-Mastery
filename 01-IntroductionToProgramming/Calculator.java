
public class Calculator{
        int yourAge;
    String message;

    Calculator(){
        System.out.println("I am in constructor");
    }

    //Overloaded constructor
    Calculator(int value){
        //this refers to current object
        this.yourAge = value;
        System.out.println("I am setting age");
    }

    Calculator(int value, String msg){
        //this refers to current object
        this.yourAge = value;
        this.message = msg;
        System.out.println("I am setting age");
    }
}