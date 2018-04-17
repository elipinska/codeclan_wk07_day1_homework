package Attractions;

import Interfaces.IChargeable;
import People.Visitor;

public class Dodgem extends Attraction implements IChargeable{

    public Dodgem(String name) {
        super(name);
        setFunRating(8);
    }

    public double priceFor(Visitor visitor) {
        return visitor.getAge() < 12 ? 3 : 6;
    }
}
