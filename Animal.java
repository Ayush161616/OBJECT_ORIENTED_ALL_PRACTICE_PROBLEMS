  class Animal {
      void eat() {
          System.out.println("khana khao");
      }

  }
      class Dog extends Animal {
          void eat() {
              System.out.println("eating bread");
          }
      }
          class cat extends Animal {
              void eat() {
                  System.out.println("eating rat");
              }
          }
              class lion extends Animal {
                  void eat() {
                      System.out.println("eating meet");
                  }
              }
               class main{
                  public static void main(String[] args) {
                      Animal a;
                      a = new Dog();
                      a.eat();
                      a = new cat();
                      a.eat();
                      a = new lion();
                      a.eat();

                  }
  }