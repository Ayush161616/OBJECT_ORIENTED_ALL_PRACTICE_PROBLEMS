// stringbuffer object example
public class Test4 {
    void show(StringBuffer a){
        System.out.println("this is string buffer method");

    }
    void show(String a){
        System.out.println("String method");

    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        t.show("abc");
        t.show(new StringBuffer("xyz"));

    }

}
