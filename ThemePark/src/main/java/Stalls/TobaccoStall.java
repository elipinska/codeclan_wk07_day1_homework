package Stalls;

import Interfaces.IRestrictable;
import People.Visitor;

public class TobaccoStall extends Stall implements IRestrictable {

    public TobaccoStall(String name, String ownerName, int parkingSpot) {
        super(name, ownerName, parkingSpot);
        setFunRating(1);
    }

    public Boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= 18;
    }
}
