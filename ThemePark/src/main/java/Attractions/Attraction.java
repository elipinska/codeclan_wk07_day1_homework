package Attractions;

import Interfaces.IEnjoyable;

public abstract class Attraction implements IEnjoyable {

    private String name;
    private int funRating;

    public Attraction(String name) {
        this.name = name;
        this.funRating = 0;

    }

    public String getName() {
        return name;
    }

    public int getFunRating() {
        return funRating;
    }

    public void setFunRating(int funRating) {
        this.funRating = funRating;
    }
}
