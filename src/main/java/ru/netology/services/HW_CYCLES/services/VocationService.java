package ru.netology.services.HW_CYCLES.services;

public class VocationService {
    public int calculateVocationMonth(int income, int expenses, int threshold) {
        int money = 0;
        int vocationMonth = 0;
        for (int i = 0; i < 12; i++) {
            if (money < threshold) {
                money += income;
                money -= expenses;
            } else {
                money -= expenses;
                money = money / 3;
                vocationMonth++;
            }
        }
        return vocationMonth;
    }
}
