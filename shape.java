abstract   class shape {
    abstract void draw();

}
class Ractangle extends shape{
    void draw(){
        System.out.println("drawing ractangle");
    }
        }
        class circle extends shape{
    void draw(){
        System.out.println("drwaing circle");
    }
        }
        class testAbstraction{
            public static void main(String[] args) {
                shape s = new circle();
                s.draw();
            }
        }
