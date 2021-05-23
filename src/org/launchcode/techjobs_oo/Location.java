package org.launchcode.techjobs_oo;

public class Location extends JobField{

    public Location() {
        super();
    }

    public Location(String aValue) {
        super(aValue);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return this.getId() == location.getId();
    }

}