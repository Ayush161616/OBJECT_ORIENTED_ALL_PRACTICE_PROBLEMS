//changing number of arguement

public class Adder {
static int add(int a , int b){
    return a+b;

}
static int add(int a , int b, int c){
    return a+b+c;
}
}
class test{
    public static void main(String[] args) {
        System.out.println(Adder.add(11,12));
        System.out.println("---------------------------------------------------------");
        System.out.println(Adder.add(15,15,15));
    }
}


