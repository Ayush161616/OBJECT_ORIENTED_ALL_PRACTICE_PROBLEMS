// example of runtime polymorphism

public class Bike {
    void run(){
        System.out.println("runnig");

    }}
    class splendar extends Bike{
        void run(){
            System.out.println("running safely with 60km");

        }

        public static void main(String[] args) {
            Bike b = new Bike();
            b.run();
            b.run();

        }
    }

