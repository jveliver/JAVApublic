import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();
        Scanner io = new Scanner(System.in);
        
        while (true) { 
            System.out.println("Menu:");
            System.out.println("1. Browse books");
            System.out.println("2. Add a book");
            System.out.println("3. Remove a book");
            System.out.println("4. Exit\n");
            System.out.print("Choose an option: ");
            String choice = io.nextLine();
            switch (choice) {
                case "1":
                    myLibrary.displayBook();
                    break;
                case "2":
                    System.out.print("\nEnter the number of Books to add: ");
                    int numberOfBooks = io.nextInt();
                    io.nextLine();
                    for (int i = 1; i <= numberOfBooks; i++) {
                    System.out.println("\nEntering details for book " + i + ":");
                    System.out.print("Enter the Title: ");
                    String titleName = io.nextLine();
                    System.out.print("Enter author's name: ");
                    String authorName = io.nextLine();
                    System.out.print("Enter the page: ");
                    int pageNum = io.nextInt();
                    io.nextLine();

                    Book book = new Book(titleName, authorName, pageNum);
                    myLibrary.addbook(book);
                    }
                    System.out.println("Book added successfully\n");
                    break;
                case "3":
                    System.out.print("Enter the title of the book to remove: ");
                    String titleName = io.nextLine();
                    if(myLibrary.removebook(titleName)){
                        System.out.println("Book removed successfully.\n");
                    }else {
                        System.out.println("Book not found.\n");
                    }
                    break;
                case "4":
                    System.out.println("Program Terminated!");
                    io.close();
                    return;
                default:
                    System.out.println("Invalid Input. Please enter a number between 1 and 4.\n");
            }
        }
    }
}

class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void setTitle (String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }


    public String getBookInfo(){
        return ": Title: " + title + ", Author: " + author + ", Pages: " + pages;
    }
}

class Library {
    ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addbook( Book book){
        books.add(book);
    }

    public boolean removebook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }
    
    public void displayBook(){
        if (books.isEmpty()) {
            System.out.println("No book in the library.\n");
        }else{
            int i = 1;
            System.out.println("\nBooks in the library:");
        for(Book book : books){
            System.out.println("Book" + i + book.getBookInfo() + "\n");
            i++;
        }
        }
    }
}