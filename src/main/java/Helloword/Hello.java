package Helloword;

public class Hello {
    public String sayHello(){
        return "Hello World";
    }

    public static void main(String[] args) {
        System.out.println(new Hello().sayHello());
    }
}
