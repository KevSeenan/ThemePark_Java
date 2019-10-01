package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class Dodgems extends Attraction implements ITicketed {

    double price;

    public Dodgems(String name, int rating, double price) {
        super(name, rating);
        this.price = price;
    }

    @Override
    public double defaultPrice() {
        return this.price;
    }

    @Override
    public double priceFor(Visitor visitor) {
        double underTwelvePrice = 8.40;
        if(visitor.getAge() >= 2.0) {
            underTwelvePrice = defaultPrice() / 2;
        }
        return underTwelvePrice;
    }
}
