import java.util.Scanner;

class Book {
    String title;
    String author;
    int edition;

    public Book(String title, String author, int edition) {
        this.title = title;
        this.author = author;
        this.edition = edition;
    }

    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Edition: " + edition);
    }
}

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[6];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < books.length; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("Enter title: ");
            String title = sc.nextLine();
            System.out.print("Enter author: ");
            String author = sc.nextLine();
            System.out.print("Enter edition: ");
            int edition = sc.nextInt();
            sc.nextLine(); 
            books[i] = new Book(title, author, edition);
        }

        for (int i = 0; i < books.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < books.length; j++) {
                if (books[j].title.compareTo(books[minIndex].title) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Book temp = books[i];
                books[i] = books[minIndex];
                books[minIndex] = temp;
            }
        }

        System.out.print("Enter author's name to search: ");
        String authorName = sc.nextLine();

        System.out.println("Books written by " + authorName + ":");
        boolean found = false;
        for (Book book : books) {
            if (book.author.equalsIgnoreCase(authorName)) {
                book.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by this author.");
        }

        sc.close();
    }
}
