package Lab02;

public class DigitalVideoDisc {
    private String discTitle;
    private String discCategory;
    private String discDirector;
    private int discLength;
    private float discCost;

    public DigitalVideoDisc(String discTitle) {
        this.discTitle = discTitle;
    }
    public DigitalVideoDisc(String discTitle, String discCategory, float discCost){
        this.discTitle = discTitle;
        this.discCategory = discCategory;
        this.discCost = discCost;
    }
    public DigitalVideoDisc(String discTitle, String discCategory, String discDirector, float discCost){
        this.discTitle = discTitle;
        this.discCategory = discCategory;
        this.discDirector = discDirector;
        this.discCost = discCost;
    }
    public DigitalVideoDisc(String discTitle, String discCategory, String discDirector, int discLength, float discCost){
        this.discTitle = discTitle;
        this.discCategory = discCategory;
        this.discDirector = discDirector;
        this.discLength = discLength;
        this.discCost = discCost;
    }
    public String getTitle() {
        return discTitle;
    }
    public String getCategory() {
        return discCategory;
    }
    public String getDirector() {
        return discDirector;
    }
    public int getLength() {
        return discLength;
    }
    public float getCost() {
        return discCost;
    }
}
