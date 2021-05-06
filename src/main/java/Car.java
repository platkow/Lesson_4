import java.util.ArrayList;

public class Car {
    private Producer producer;
    private boolean isAutomaticGear;
    private Market market;
    private String segment;
    private ArrayList<Dimension> dimensions;

    public Car(Producer producer, boolean isAutomaticGear, Market market, String segment, ArrayList<Dimension> dimensions) {
        this.producer = producer;
        this.isAutomaticGear = isAutomaticGear;
        this.market = market;
        this.segment = segment;
        this.dimensions = dimensions;
    }

    public Producer getProducer() {
        return producer;
    }

    public boolean isAutomaticGear() {
        return isAutomaticGear;
    }

    public Market getMarket() {
        return market;
    }

    public ArrayList<Dimension> getDimensions() {
        return dimensions;
    }

    @Override
    public String toString() {
        return "Car" +
                "producer=" + producer +
                ", isAutomaticGear=" + isAutomaticGear +
                ", market=" + market +
                ", dimensions=" + dimensions;
    }

    public void uglySearch() {
        if (getProducer().getModel().equals("BMW")) {
            if (isAutomaticGear()) {
                for (Dimension d : getDimensions()) {
                    int trankCapacity = d.getTrankCapacity();
                    if (trankCapacity > 300) {
                        for (Country c : getMarket().getCountries()) {
                            String countryName = c.getCountryName();
                            char countrySign = c.getCountrySign();
                            System.out.println(countryName + " - " + countrySign);
                        }
                    } else {
                        System.out.println("Trank capacity lower than 300 l.");
                    }
                }
            } else {
                System.out.println("Automation gear not found.");
            }
        } else {
            System.out.println("This is not BMW.");
        }
    }
}





