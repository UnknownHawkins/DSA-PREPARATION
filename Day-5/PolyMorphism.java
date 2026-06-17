class Animal{
    void sound(){
        System.out.println("Animal Makes Sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal{
    void sound(){
        System.out.println("Cat Meows");
    }
}

public class PolyMorphism {
    public static void main(String[] args) {
        Animal A1 = new Dog();
        A1.sound();

        Animal A2 = new Cat();
        A2.sound();
    }
}
