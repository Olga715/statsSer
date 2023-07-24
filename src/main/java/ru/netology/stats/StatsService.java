package ru.netology.stats;
public class StatsService {
    public long sum (long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }
    public long average(long[] sales) {
        long averageSale = sum(sales) / 12;
        return averageSale;

    }
    public int monthMaximum (long[] sales) {
        int monthResult = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthResult]) {
                monthResult = i;
            }
        }
        return  monthResult + 1;
    }
    public int monthMinimum (long[] sales) {
        int monthResult = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthResult]) {
                monthResult = i;
            }
        }
        return monthResult + 1;
    }
    public int monthsBelowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }
        }
        return counter;
    }
    public int monthsAboveAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }
        }
        return counter;
    }
}


