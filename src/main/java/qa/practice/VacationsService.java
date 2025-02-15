package qa.practice;

public class VacationsService {

    public int calculateVacMonths(int income, int expenses, int threshold) {
        int money = 0;
        int vacMonths = 0;

        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {
                money -= expenses;
                money /= 3;
                vacMonths++;
            } else {
                money += income - expenses;
            }
        }
        return vacMonths;

    }
}
