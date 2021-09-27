public class UseBook {
    public static void main(String[] args) {

        Book books[] = new Book[5];
        books[0] = new Fiction("Nineteen Eighty Four");
        books[1] = new NonFiction("Killers of the Flower Moon");
        books[2] = new Fiction("The Midnight Library");
        books[3] = new NonFiction("The Emperor of All Maladies");
        books[4] = new Fiction("Circe");

        for (int i = 0; i < books.length; i++)
            System.out.println("Book: " + books[i].getTitle() + " costs $" + books[i].getPrice());
    }
}
