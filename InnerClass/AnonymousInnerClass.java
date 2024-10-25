class Animal{
    public void sound(){
        System.out.println("animal makes sound");
    }
}

// normal sub class
// class Dog extends Animal{
//     @Override
//     public void sound() {
//         System.out.println("Dog can bark");
//     }
// }

public class AnonymousInnerClass {
    public static void main(String[] args) {
        // Dog dog = new Dog();
        // dog.sound();

        Animal animal1 = new Animal(){
            @Override
            public void sound() {
                System.out.println("animal1 makes sound ");
            }
        };
        animal1.sound();
    }
}
