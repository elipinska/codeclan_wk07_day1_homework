package Attractions;

import Interfaces.IChargeable;
import Interfaces.IRestrictable;
import People.Visitor;

public class Rollercoaster extends Attraction implements IRestrictable, IChargeable {

    public Rollercoaster(String name) {
        super(name);
        setFunRating(4);
    }

    public Boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() > 12 && visitor.getHeight() > 145;
    }

    public double priceFor(Visitor visitor) {
        return visitor.getAge() < 15 ? 3 : 6;
    }
}
