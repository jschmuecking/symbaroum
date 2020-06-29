package org.symbaroum.api.admin.model;

public class Attribute {

    private int value;

    public Attribute() {
        this.value = 10;
    }

    public Attribute(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int asModifier() {
        return 10-this.value;
    }
}
