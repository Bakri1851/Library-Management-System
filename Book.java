import enums.Genre;
import enums.Language;

public class Book {
    public int barcode;
    public String title;
    public Language language;
    public Genre genre;
    public String release_date;
    protected int quantity_in_stock;
    public double price;

    public Book(int barcode, String title, Language language, Genre genre, String release_date, int quantity_in_stock, float price){
        this.barcode = barcode;
        this.title = title;
        this.language = language;
        this.genre = genre;
        this.release_date = release_date;
        this.quantity_in_stock = quantity_in_stock;
        this.price = price;

    }
}
