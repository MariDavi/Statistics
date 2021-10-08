package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
    @org.junit.jupiter.api.Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(purchases);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldFindAverage() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.findAverage(purchases);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldFindMinPurchase() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.minPurchase(purchases);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldFindMaxPurchase() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.maxPurchase(purchases);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldFindLowMonthSum() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.lowMonthSum(purchases);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldFindHighMonthSum() {
        StatsService service = new StatsService();

        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.highMonthSum(purchases);

        assertEquals(expected, actual);
    }
}