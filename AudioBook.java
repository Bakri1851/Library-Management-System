import enums.AudioBookFormat;
import enums.Genre;
import enums.Language;

public class AudioBook extends Book{
    public int listening_length;
    public AudioBookFormat format;
    public AudioBook(int barcode, String title, Language language, Genre genre, String release_date, int quantity_in_stock, float price, int listening_length, AudioBookFormat format) {
        super(barcode, title, language, genre, release_date, quantity_in_stock, price);
        this.listening_length = listening_length;
        this.format = format;
    }
}
