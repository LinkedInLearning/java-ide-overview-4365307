package org.example.service;

import org.example.model.Stock;

import java.util.List;

public class StockService {

    public static final double VALUABLE_LIMIT = 100.0;

    public static void main(String[] args) {
        List<Stock> stocks = List.of(
                new Stock("apple", 110.0),
                new Stock("microsoft", 130.0),
                new Stock("tesla", 90.0),
                new Stock("google", 70.0)
        );
        printTopStocks(stocks);
    }

    private static void printTopStocks(List<Stock> stocks) {
        stocks.stream()
                .filter(s -> s.getValue() > VALUABLE_LIMIT)
                .forEach(System.out::println);
    }
}
