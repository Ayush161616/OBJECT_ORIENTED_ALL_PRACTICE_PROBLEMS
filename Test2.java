// type of arguement
public class Test2
{
    void show(int a){
        System.out.println("1");

    }
    void show(String a){
        System.out.println("2");
    }

    public static void main(String[] args) {
        Test2 t = new Test2();
        t.show("ayush");
        t.show(10);

    }
}
