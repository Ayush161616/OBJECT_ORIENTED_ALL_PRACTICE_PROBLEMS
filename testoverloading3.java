//overload java main method
public class testoverloading3 {
    public static void main(String[] args) {
        //System.out.println(" main with string args[]");
        //System.out.println("-------------------------------------------------");
    }

    public static void main(String args) {
        System.out.println("main with string");
        System.out.println("-------------------------------------------------");
    }

    public static void main() {
        System.out.println("main without arg");
        System.out.println("-------------------------------------------------");
    }
}
