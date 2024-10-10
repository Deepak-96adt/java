abstract class Playable{
    abstract void play();
    void display(){
        System.out.println("this is abstract class");
    }
}

class Guitar extends Playable{
    void play(){
        System.out.println("we can play guitar.....");
    }
}

class Piano extends Playable{
    void play(){
        System.out.println("we can play piano.....");
    }
}

// class Demo extends Piano{
//     void temp(){
//         System.err.println("hello");
//     }
// }

public class WithClass{
    public static void main(String[] args) {
        Guitar myGuitar = new Guitar();
        myGuitar.play();
        myGuitar.display();
        Piano myPiano = new Piano();
        myPiano.play();
        // Demo myDemo = new Demo();
        // myDemo.play();
    }
}