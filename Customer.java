import java.util.ArrayList;
import java.util.Iterator;

public class Customer extends User {
    protected double credit_balance;
    protected ArrayList<Book> shopping_basket;

    public Customer(int userid, String username, String surname, String address, int credit_balance, ArrayList<Book> shopping_basket) {
        super(userid, username, surname, address);
        this.credit_balance = credit_balance;
        this.shopping_basket = shopping_basket;
    }

    public void addToBasket(Book book_to_be_added){
        shopping_basket.add(book_to_be_added);
    }
    public String payForBooks(){
        double amountToPay = 0.0;

        for (Book book : shopping_basket) {
            amountToPay += book.price;
        }
        if (amountToPay> credit_balance){
            return "You do not have the sufficient funds to complete this payment of " + String.valueOf(amountToPay) + " your balance is currently" + String.valueOf(credit_balance);
        } else{
            credit_balance -= amountToPay;
            return "Thank you for your purchase! £" + String.valueOf(amountToPay) + " paid and your current remaining balance is " + String.valueOf(credit_balance) + ". Your delivery address is " + address + ".";
        }

    }

    public void cancelBasket(){
        shopping_basket.clear();
    }

    //create search book func
}
