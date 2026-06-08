package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.screen.StoreScreen;
import hust.soict.dsai.aims.screen.CartScreen;
import hust.soict.dsai.aims.media.*;

public class AimsGUI {
    public static void main(String[] args) {
        Store store = new Store();
        Cart cart = new Cart();

        // Add some items to store
        store.addMedia(new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f));
        store.addMedia(new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f));
        store.addMedia(new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f));
        store.addMedia(new Book("Java Programming", "Education", 45.0f));
        store.addMedia(new CompactDisc("Thriller", "Pop", "Michael Jackson", "Quincy Jones", 15.0f));

        // Launch Store Screen
        new StoreScreen(store);
    }
}
