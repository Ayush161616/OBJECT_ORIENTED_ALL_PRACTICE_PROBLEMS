// example of abstract method
abstract class programming {
   public abstract void Developer();




}
class html extends programming{
    public void Developer(){
        System.out.println("tim baners lee");
    }
}
class java extends programming{
    public void Developer(){
        System.out.println("james goseling");
    }
}
class main{
public static void main(String[] args) {
    html h = new html();
    h.Developer();
    java j = new java();
    j.Developer();
}}