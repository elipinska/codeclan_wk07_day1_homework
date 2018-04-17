package ThemePark;

import Interfaces.IEnjoyable;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IEnjoyable> enjoyables;

    public ThemePark(ArrayList enjoyables) {
        this.enjoyables = enjoyables;
    }

    public ArrayList<IEnjoyable> getEnjoyables() {
        return enjoyables;
    }

    public String getEnjoyablesWithRating() {
        String result = "";

        for (IEnjoyable enjoyable : enjoyables) {
            result += (enjoyable.getName() + ": " + enjoyable.getFunRating() + ", ");
        }
        return result;
    }
}
