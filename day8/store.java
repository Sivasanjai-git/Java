class BookStore {
    String title;
    String author;
    double price;

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        BookStore b = new BookStore();
        b.title = "Java Programming";
        b.author = "James";
        b.price = 450;
        b.display();
    }
}