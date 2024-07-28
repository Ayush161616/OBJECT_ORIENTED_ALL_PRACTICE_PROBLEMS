// multilevel inheritance
public class c extends B{
    void showC(){
        System.out.println("c class method");
    }

    public static void main(String[] args) {
        A obj1 = new A();
        obj1.ShowA();
        //obj.showC();
        B obj2 = new B();
        obj2.ShowA();
        obj2.showB();
                //obj.showC();
        c obj3 = new c();
        obj3.ShowA();
        obj3.showB();
        obj3.showC();
    }

}
