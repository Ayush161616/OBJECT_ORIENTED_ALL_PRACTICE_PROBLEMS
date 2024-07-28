public class typepramotionmatchingfound {
    void sum(int a , int b){
        System.out.println("int arg method invoked");
        System.out.println("-------------------------------------------------");
    }
    void sum(long a , long b){
        System.out.println("long arg method invoked");
    }

    public static void main(String[] args) {
        typepramotionmatchingfound t = new typepramotionmatchingfound();
        t.sum(12,5);
    }
}
