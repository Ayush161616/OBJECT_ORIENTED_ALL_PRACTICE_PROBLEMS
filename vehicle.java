public class vehicle {
    void run(){
        System.out.println("vehicle is running");

    }
}
class bike2 extends vehicle{
    void run(){
        System.out.println("bike is running safely");
    }
}
class mer{
    public static void main(String[] args) {
        vehicle b= new bike2();
        b.run();
    }
}