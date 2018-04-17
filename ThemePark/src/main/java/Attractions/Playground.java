package Attractions;

import Interfaces.IRestrictable;
import People.Visitor;

public class Playground extends Attraction implements IRestrictable {

    public Playground(String name) {
        super(name);
    }

    public Boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() <= 15;
    }
}
