public class Test {
    void show(){
        System.out.println("1");//0 org

    }
    void show(int a){//1 arg
        System.out.println("2");

    }

    public static void main(String[] args) {
        Test t = new Test();
        t.show();
        System.out.println();
        t.show(20);
    }

}
