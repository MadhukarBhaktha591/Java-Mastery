import java.net.SocketPermission;

class Application2{
    public static void main(String[] args){
        String message = "Hello World";  //non-primitive string data type
        int length = 10;    // some primitive date type (3)
        int height = 5;     // these all are local variables.
        byte ageOfPerson =70; 
        
        Test testObject = new Test();
        Test testObject1 = new Test();
        testObject.message = "hello from Test-1";
        testObject1.message = "hello from Test-2";
        testObject.age = 20;
        testObject1.age = 18;
        testObject.height = 20;
        testObject1.height = 18;
        Test.height = 5;        //later added
        
        System.out.println(message);
        System.out.println(length);
        System.out.println(height);
        System.out.println(ageOfPerson);
        
        System.out.println(testObject.message);
        System.out.println(testObject1.message);
        System.out.println(testObject.age);
        System.out.println(testObject1.age);
        System.out.println(testObject.height);
        System.out.println(testObject1.height);   //here both will be 18 ..later now 5 in both     

    }
}

class Test{
    int age;    // instance varaibles (variables of class )
    String message;  //store diff value for diff object for same var
    static int height;
}