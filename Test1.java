// THIS WILL CHANGE THE SEQUENCE
public class Test1 {
    void show(int a , String b){
        System.out.println("Ayush");

    }
    void show(String a , int b){
        System.out.println("Aman");

    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        //t.show(10,"raja");//aman
        t.show("www",50);//ayush
    }

}
