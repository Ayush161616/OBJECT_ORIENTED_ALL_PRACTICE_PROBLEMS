// runtime polymorphism
public class Bank
{
    float getrateOfIntrest(){
        return 0;
    }

}
class SBI extends Bank{
    float getRateOfIntrest(){
        return 8.4f;
    }
}
class ICICI extends Bank{
    float getRateOfIntrest(){
        return 7.3f;
    }
}
class AXIS extends Bank {
    float getRateOfIntrest() {
        return 9.7f;
    }
}
class TestPolymorphism{
    public static void main(String[] args) {
        Bank b ;
        b = new SBI();
        System.out.println("Sbi rate of intrest :"+b.getrateOfIntrest());
        b= new ICICI();
        System.out.println("icici rate of intrest :"+b.getrateOfIntrest());
       b = new AXIS();
        System.out.println("axis rate of intrest :"+b.getrateOfIntrest());
    }
}