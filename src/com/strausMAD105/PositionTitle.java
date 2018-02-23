package com.strausMAD105;


// -------- class type enum to assign titles-----
public enum PositionTitle {
    ADMINISTRATION("Administration"), PRODUCTION("Production"), SALES("Sales"), MAINTENANCE("Maintenance"), TECHNICAL("Technical"), SECRETARIAL("Secretarial");

    private String position;//--------- declare String type variable for position

    PositionTitle(String position) {
        this.position = position;
    }

    public String toString() {
        return position;
    }
}