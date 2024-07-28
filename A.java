// single inheritence
public class A {
    void ShowA(){
        System.out.println("A Class method");

    }
}
class B extends A{
    void showB(){
        System.out.println("B class method");

    }

    public static void main(String[] args) {
        A obj1 = new A();
        obj1.ShowA();
        B obj2 = new B();
        obj2 .ShowA();
        obj2.showB();


    }
}
