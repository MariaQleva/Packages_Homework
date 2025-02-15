package qa.practice;


public class Main {
    public static void main(String[] args) {
        VacationsService service = new VacationsService();
        int vacMonths = service.calculateVacMonths(10_000, 3_000, 20_000);

        System.out.println("Количество месяцев отдыха: " + vacMonths);
    }

}
