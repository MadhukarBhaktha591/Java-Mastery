public class Application3{
    public static void main(String[] args){
        Test object1 = new Test(15, "hi");
        System.out.println(object1.age);
        System.out.println(object1.message);
        Test object2 = new Test(10);
        System.out.println(object2.age);
        System.out.println(object2.message);
        Test object3 = new Test();
        System.out.println(object3.age);
        System.out.println(object3.message);        
    }
}
    
    
    class Test{
        int age;
    String message;

    Test(){
        System.out.println("I am in constructor");
    }

    //Overloaded constructor
    Test(int value){
        //this refers to current object
        this.age = value;
        System.out.println("I am setting age");
    }

    Test(int value, String msg){
        //this refers to current object
        this.age = value;
        this.message = msg;
        System.out.println("I am setting age");
    }
}
