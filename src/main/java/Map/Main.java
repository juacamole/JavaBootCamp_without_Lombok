package Map;

public class Main {
    public static void main(String[] args){

        Medication ritalin = new Medication();
        ritalin.setAvailability(true);
        ritalin.setName("ritalin");
        ritalin.setPrice(20);

        Medication cocaine = new Medication();
        cocaine.setPrice(200);
        cocaine.setAvailability(false);
        cocaine.setName("cocaine");

        cocaine.print();

    }
}
