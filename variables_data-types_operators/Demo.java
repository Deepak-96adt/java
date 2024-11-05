
class Parent {
	void add() {
		System.out.println("Parent add method calling");
	}

	void hello() {
		System.out.println("Hello calling");
	}
}

class Child extends Parent {
	void add() {
		System.out.println("Child add method calling");

	}

}

public class Demo extends Child {
	public static void main(String[] args) {

		Parent p = new Child();
		p.add();
		p.hello();

		Child c = (Child) p;
		c.add();
		c.hello();
	}
}