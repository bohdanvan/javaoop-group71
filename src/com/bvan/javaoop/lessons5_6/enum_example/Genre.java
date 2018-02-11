package com.bvan.javaoop.lessons5_6.enum_example;

/**
 * @author bvanchuhov
 */
public enum Genre {
    COMEDY("Funny movie"),
    ACTION("...."),
    THRILLER("...."),
    HORROR("...."),
    DRAMA("....");

    private final String description;

    Genre(String description) {
        this.description = description;
    }

    public String shortName() {
        return name().substring(0, 3);
    }

    public String getDescription() {
        return description;
    }
}
