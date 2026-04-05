package Lab02;

public class Aims {
    public static void main(String[] args) {
        Cart myCart = new Cart();
        DigitalVideoDisc firstDvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc secondDvd = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc thirdDvd = new DigitalVideoDisc("Aladdin", "Animation", "John Musker", 90, 18.99f);
        myCart.addDigitalVideoDisc(firstDvd);
        myCart.addDigitalVideoDisc(secondDvd);
        myCart.addDigitalVideoDisc(thirdDvd);
        
        System.out.println("Total cost is: " + myCart.totalCost());
        myCart.removeDigitalVideoDisc(secondDvd);
        System.out.println("Total cost is: " + myCart.totalCost());
    }
}
