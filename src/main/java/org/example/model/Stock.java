package org.example.model;

public class Stock {
    private final String name;
    private final double value;

    public Stock(String name, double value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
