import enums.Genre;
import enums.Language;

import java.io.*;

public class Admin extends User{


    public Admin(int userid, String username, String surname, String address) {
        super(userid, username, surname, address);
    }

    public static void addBook(int barcode, String type, String title, Language language, Genre genre, String release_date, int quantity_in_stock, double price, double extra1, String extra2) throws IOException{
        //create add book func

        try {
            FileWriter outputFile = new FileWriter("Stock.txt", true);

            BufferedWriter bw = new BufferedWriter(outputFile);
            bw.write(barcode + ", " + type + ", " + title + ", " + language + ", " + genre + ", " + release_date + ", " + quantity_in_stock + ", " + price + ", " + extra1 + ", " + extra2 + "\n");

            bw.close();
        } catch (IOException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

    }
    //view book func


}

