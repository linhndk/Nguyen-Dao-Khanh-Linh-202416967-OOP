package Lab02;

public class Cart {
    public static final int MAX_CAPACITY = 20;
    private DigitalVideoDisc[] discList = new DigitalVideoDisc[MAX_CAPACITY];
    private int currentCount = 0;

    public boolean addDigitalVideoDisc(DigitalVideoDisc dvd){
        if(currentCount < MAX_CAPACITY){
            discList[currentCount] = dvd;
            currentCount++;
            System.out.println("The disc has been added");
            return true;
        }
        else{
            System.out.println("The cart is almost full");
            return false;
        }
    }


    public boolean removeDigitalVideoDisc(DigitalVideoDisc dvd){
        for(int i = 0; i < currentCount; i++){
            if(discList[i] == dvd){
                for(int j = i; j < currentCount - 1; j++){
                    discList[j] = discList[j + 1];
                }
                discList[currentCount - 1] = null;
                currentCount--;
                System.out.println("The disc has been removed");
                return true;
            }
        }
        System.out.println("The disc is not found in the cart");
        return false;
    }
    
    public float totalCost(){
        float totalAmount = 0;
        for(int i = 0; i < currentCount; i++){
            totalAmount += discList[i].getCost();
        }
        return totalAmount;
    }
}
