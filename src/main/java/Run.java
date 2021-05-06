import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {

        Producer bmw1 = new Producer("BMW", "Seria 3");
        Producer bmw2 = new Producer("BMW", "i3");
        Producer bmw3 = new Producer("BMW", "i8");
        Producer bmw4 = new Producer("BMW", "X5");
        Producer skoda1 = new Producer("Skoda", "Octavia");
        Producer skoda2 = new Producer("Skoda", "Superb");
        Producer alfaRomeo1 = new Producer("Alfa Romeo", "Julietta");
        Producer ford1 = new Producer("Ford", "Transit");
        Producer ford2 = new Producer("Ford", "Focus");
        Producer seat1 = new Producer("Seat", "Arona");

        Dimension compact = new Dimension(60, 125, 160);
        Dimension cupe = new Dimension(70, 140, 170);
        Dimension sportCupe = new Dimension(60, 150, 160);
        Dimension hatchback = new Dimension(80, 132, 150);
        Dimension sedan = new Dimension(70, 160, 290);
        Dimension wagon = new Dimension(75, 165, 450);
        Dimension van = new Dimension(90, 190, 420);
        Dimension suv = new Dimension(90, 160, 390);
        Dimension combi = new Dimension(80, 180, 420);
        Dimension micro = new Dimension(55, 110, 140);

        ArrayList<Dimension> city = new ArrayList<>();
        city.add(micro);
        city.add(compact);
        city.add(sedan);

        ArrayList<Dimension> family = new ArrayList<>();
        family.add(combi);
        family.add(suv);

        ArrayList<Dimension> forCouple = new ArrayList<>();
        forCouple.add(cupe);
        forCouple.add(sportCupe);
        forCouple.add(hatchback);

        ArrayList<Dimension> travel = new ArrayList<>();
        travel.add(wagon);
        travel.add(van);

        ArrayList<Dimension> easyTransport = new ArrayList<>();
        easyTransport.add(combi);
        easyTransport.add(van);
        easyTransport.add(wagon);

        Country Poland = new Country("Poland", 'P');
        Country Germany = new Country("Germany", 'D');
        Country China = new Country("China", 'C');
        Country France = new Country("France", 'F');
        Country Russia = new Country("Russia", 'R');

        List<Country> countriesSetOne = new ArrayList<>();
        countriesSetOne.add(Poland);
        countriesSetOne.add(Germany);
        countriesSetOne.add(China);

        List<Country> countriesSetTwo = new ArrayList<>();
        countriesSetTwo.add(Russia);
        countriesSetTwo.add(Germany);
        countriesSetTwo.add(China);

        List<Country> countriesSeThree = new ArrayList<>();
        countriesSeThree.add(France);
        countriesSeThree.add(Germany);
        countriesSeThree.add(Poland);

        List<Country> countriesSetFour = new ArrayList<>();
        countriesSetFour.add(Russia);
        countriesSetFour.add(Germany);
        countriesSetFour.add(France);

        List<Country> countriesSetFive = new ArrayList<>();
        countriesSetFive.add(Poland);
        countriesSetFive.add(Germany);
        countriesSetFive.add(Russia);

        Market businessMarket = new Market("business", countriesSetOne);
        Market cargoMarket = new Market("cargo", countriesSetTwo);
        Market transportMarket = new Market("transport", countriesSeThree);
        Market taxiMarket = new Market("taxi", countriesSetFour);
        Market busMarket = new Market("bus", countriesSetFive);

        Car car1 = new Car(bmw1, false, taxiMarket, "medium", city);
        Car car2 = new Car(seat1, false, cargoMarket, "standard", city);
        Car car3 = new Car(bmw2, false, taxiMarket, "medium", travel);
        Car car4 = new Car(ford1, true, busMarket, "medium", easyTransport);
        Car car5 = new Car(bmw3, true, businessMarket, "premium", family); //1
        Car car6 = new Car(ford2, false, taxiMarket, "standard", forCouple);
        Car car7 = new Car(bmw4, true, businessMarket, "premium", family);//2
        Car car8 = new Car(bmw1, false, cargoMarket, "premium", forCouple);
        Car car9 = new Car(bmw3, true, busMarket, "premium", city);//3
        Car car10 = new Car(skoda2, true, transportMarket, "standard", family);
        Car car11 = new Car(skoda1, false, businessMarket, "premium", travel);
        Car car12 = new Car(alfaRomeo1, false, transportMarket, "medium", forCouple);
        Car car13 = new Car(bmw1, true, transportMarket, "medium", travel);
        Car car14 = new Car(bmw3, false, busMarket, "premium", easyTransport);
        Car car15 = new Car(bmw4, true, businessMarket, "premium", city);//4

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);
        cars.add(car11);
        cars.add(car12);
        cars.add(car13);
        cars.add(car14);
        cars.add(car15);

        for (Car c : cars) {
            c.uglySearch();
        }
    }
}
