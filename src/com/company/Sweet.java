package com.company;

public class Sweet {
    enum Colour {
        YELLOW, RED, WHITE, BROWN
    }

    enum Category {
        SUGAR, MILK, GHEE
    }
    String name;
    Colour colour;
    Category category;
    int price;
    String id;

    @Override
    public String toString() {
        return "Sweet{" +
                "name='" + name + '\'' +
                ", colour=" + colour +
                ", category=" + category +
                ", price=" + price +
                ", id='" + id + '\'' +
                '}';
    }
}
