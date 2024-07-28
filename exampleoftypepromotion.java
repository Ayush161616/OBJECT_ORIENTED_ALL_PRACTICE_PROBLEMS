public class exampleoftypepromotion {
    void sum(int a , long b){
        System.out.println(a+b);
    }
    void sum(int a , int b,int c){
        System.out.println(a+b+c);

    }

    public static void main(String[] args) {
        exampleoftypepromotion e = new exampleoftypepromotion();
        e.sum(20,20);
        e.sum(200,200,200);
    }
}
