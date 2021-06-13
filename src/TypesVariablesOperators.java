public class TypesVariablesOperators {



    public static void main(String[] args) {
        String helloMessage;
        helloMessage = "Hello, World!"
                //java: ';' expected
        System.out.println(helloMessage);

        String _name = "Levi";// Variable names should not start with underscore _ or dollar sign $ characters
        int x;
        int number = 89.01; //invalid int value
       String hello = "hello;
               //unclosed string literal"
        System.out.println(_name);
        System.out.println(x);//java: variable x might not have been initialized
        System.out.println(number);//Error possible lossy conversion from double to int

    }


}
