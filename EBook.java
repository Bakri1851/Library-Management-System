import enums.EBookFormat;
import enums.Genre;
import enums.Language;

public class EBook extends Book{
    public int page_amount;
    public EBookFormat format;
    public EBook(int barcode, String title, Language language, Genre genre, String release_date, int quantity_in_stock, float price, int page_amount, EBookFormat format) {
        super(barcode, title, language, genre, release_date, quantity_in_stock, price);
        this.page_amount = page_amount;
        this.format = format;
    }
}
