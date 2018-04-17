package Stalls;

import Interfaces.IChargeable;
import Interfaces.IEnjoyable;
import People.Visitor;

public abstract class Stall implements IChargeable, IEnjoyable{
    private String name;
    private String ownerName;
    private int parkingSpot;
    private int funRating;

    public Stall(String name, String ownerName, int parkingSpot) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.funRating = 0;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getParkingSpot() {
        return parkingSpot;
    }

    public double priceFor(Visitor visitor) {
        return 2.50;
    }

    public int getFunRating() {
        return funRating;
    }

    public void setFunRating(int funRating) {
        this.funRating = funRating;
    }
}