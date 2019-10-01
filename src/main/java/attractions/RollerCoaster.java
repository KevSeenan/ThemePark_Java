package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ITicketed, ISecurity {

    double price;

    public RollerCoaster(String name, int rating, double price) {
        super(name, rating);
        this.price = price;
    }


    @Override
    public double defaultPrice() {
        return this.price;
    }

    @Override
    public double priceFor(Visitor visitor) {
        double tallPrice = 8.40;
        if(visitor.getHeight() >= 2.0) {
            tallPrice = defaultPrice() * 2;
        }
        return tallPrice;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getHeight() >= 1.45) {
            return true;
        } if (visitor.getAge() >= 12) {
            return true;
        } else {
            return false;
        }
    }
}
