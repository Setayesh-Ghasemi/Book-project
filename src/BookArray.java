public class BookArray {
    public static void main(String[] args) {

        Book[] books = new Book[10];
        books[0] = new Fiction("Nineteen Eighty Four");
        books[1] = new Fiction("The Midnight Library");
        books[2] = new Fiction("Circe");
        books[3] = new Fiction("The Last Thing He Told Me");
        books[4] = new Fiction("Normal People");

        books[5] = new NonFiction("Killers of the Flower Moon");
        books[6] = new NonFiction("The Emperor of All Maladies");
        books[7] = new NonFiction("Into Thin Air");
        books[8] = new NonFiction("Into the Wild");
        books[9] = new NonFiction("Hiroshima");

        System.out.println("Details of all the books:");
        for (int i = 0; i < books.length; i++) {

            System.out.println();
            System.out.println((i + 1) + ".Name: " + books[i].getTitle());
            System.out.println("Price: $" + books[i].getPrice());


        }
    }
}
