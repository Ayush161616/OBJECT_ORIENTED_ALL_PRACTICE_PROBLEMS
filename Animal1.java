// example of runtime polymorphism with multilevel inheritance
public class Animal1 {
    void eat(){
        System.out.println("Eating");

    }
}
class Dog1 extends Animal1{
    void eat(){
        System.out.println("Eating Fruits");

    }

}
class BabyDog extends Animal1{
    void eat(){
        System.out.println("Drinking milk");
    }

}
class main2{
public static void main(String[] args) {
    Animal1 a1, a2, a3;
    a1 = new Animal1();
    a2 = new Dog1();
    a3 = new BabyDog();
    a1.eat();
    a2.eat();
    a3.eat();
}
}
