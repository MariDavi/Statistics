package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            // аналог sum = sum + purchase;
            sum += purchase;
        }
        return sum;
    }
    public int findAverage(int[] purchase) {
        return calculateSum(purchase) / purchase.length;
    }
    public int minPurchase(int[] purchases) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int purchase : purchases) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (purchase <= purchases[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxPurchase(int[] purchases) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int purchase : purchases) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (purchase >= purchases[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int lowMonthSum(int[] purchases) {
        int count = 0;
        for (int i=0; i<purchases.length;i++) {
            if (purchases[i] < findAverage(purchases)) {
                count++;
            }
        }
        return count;
    }

    public int highMonthSum(int[] purchases) {
        int count = 0;
        for (int i=0; i<purchases.length;i++) {
            if (purchases[i] > findAverage(purchases)) {
                count++;
            }
        }
        return count;
    }

}

