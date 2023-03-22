package oop;

public class CallingBookClass {
    public static void main(String[] args) {
        // Creating new Book class object
        Book book1 = new Book();
        book1.title = "A peace and a war";
        book1.author = "Lev Tolstoy";
        //set private field using set method
        book1.setNumberOfPages(5000);

        book1.PrintBookInfo();

        Book book2 = new Book();
        book2.title = "New book";
        book2.author = "new author";
        book2.setNumberOfPages(8);
        book2.PrintBookInfo();

    }
}
