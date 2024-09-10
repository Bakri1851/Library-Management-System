import enums.Condition;
import enums.Genre;
import enums.Language;

public class Paperback extends Book{
    public int page_amount;
    public Condition condition;
    public Paperback(int barcode, String title, Language language, Genre genre, String release_date, int quantity_in_stock, float price, int page_amount, Condition condition){
        super(barcode, title, language, genre, release_date, quantity_in_stock, price);
        this.page_amount = page_amount;
        this.condition = condition;
    }
}
