package OOPs;



public class Inheritence {
    public static void main(String[] args) {
        // Fish shark = new Fish();
        // shark.eat();
        // Dog retriever = new Dog();
        // retriever.eat();
        Birds owl = new Birds();
        owl.eat();
        

        
    }
   
   
}
//base class
class Animals{
    String color;

    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

//derived class or Subclass
class Fish extends Animals{
    int fins;

    void swim(){
        System.out.println("Swims In water");
    }
}
class Mammals extends Animals{
    int legs;
    void walk(){
        System.out.println("walks");
    }
    

}
class Birds extends Animals{
    void fly(){
        System.out.println("Bird Fly");
    }
}
class Dog extends Mammals{
    String breed;

}