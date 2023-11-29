package Map;

public class Medication extends Apotheke{
    private boolean availability;
    private int price;
    private String name;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void print() {
            System.out.println(medication + "" + availability + price);
    }
}
