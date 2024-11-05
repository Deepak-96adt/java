class Book{
    String title;
    int price;

    public Book(String title , int price){
        this.title=title;
        this.price=price;
    }

    public void display(){
        System.out.println("my Book name is "+this.title+" and price is $"+this.price);
    }
}

public class MyBook {
    public static void main(String[] args) {
        Book myBook = new Book("Atomic habit", 50000);
        myBook.display();
    }
}
