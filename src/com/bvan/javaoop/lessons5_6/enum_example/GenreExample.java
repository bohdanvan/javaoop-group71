package com.bvan.javaoop.lessons5_6.enum_example;

/**
 * @author bvanchuhov
 */
public class GenreExample {

    public static void main(String[] args) {
        Genre g1 = Genre.DRAMA;

        // enum -> String
        String name = g1.name();
        System.out.println(name);

        // enum -> int
        int ordinal = g1.ordinal();
        System.out.println(ordinal);

        // String -> enum
        Genre g2 = Genre.valueOf("HORROR");
        System.out.println(g2);

        // int -> enum
        Genre[] values = Genre.values();
        Genre g3 = values[2];
        System.out.println(g3);

        System.out.println(Genre.COMEDY.shortName());
        System.out.println(Genre.COMEDY.getDescription());
    }
}
