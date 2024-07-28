public class hierarichal {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.ShowA();
        //obj1.ShowB();
        //obj1.ShowC();
        System.out.println("---------------------------------------------");
        B obj2 = new B();
        obj2.ShowA();
        obj2.showB();
        // obj2.ShowC();
        System.out.println("----------------------------------------------");
        c  obj3 = new c();
        obj3.ShowA();
        //obj3.showB();
        obj3.showC();

    }
}
