import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class So5 {
public static void main(String args[]) throws Exception {
Book[] books = new Book[4];
double min = 0;
double max = 0;
Scanner sc = new Scanner(System.in);

for (int i = 0; i < books.length; i++) 
{
int id = sc.nextInt();
String title = sc.nextLine();
String author = sc.nextLine();
sc.nextLine();
double price = sc.nextDouble();
books[i] = new Book(id, title, author, price);
}

min = sc.nextDouble();
max = sc.nextDouble();
Book[] newBooks = booksWithPriceRange(min, max, books);
for (Book b : newBooks)
System.out.println(b.getId());
}

private static Book[] booksWithPriceRange(double min, double max, Book[] books) {
int size = 0, j = 0;
for (int i = 0; i < books.length; i++) {
if (books[i].getPrice() >= min && books[i].getPrice() <= max) {
size++;
}
}
Book[] b = new Book[size];
for (int i = 0; i < books.length; i++) {
if (books[i].getPrice() >= min && books[i].getPrice() <= max) {
b[j] = books[i];
j++;
}
}
for (int i = 0; i < b.length; i++) {
Book temp;
for (int k = 0; k < b.length - i - 1; k++) {
if (b[k].getId() > b[k + 1].getId()) {
temp = b[k];
b[k] = b[k + 1];
b[k + 1] = temp;
}
}
}
return b;
}
// implement business methods here
}
