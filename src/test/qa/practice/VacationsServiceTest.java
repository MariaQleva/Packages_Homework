package qa.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class VacationsServiceTest {

    @Test
    void shouldCalculateVacationMonths() {
        VacationsService service = new VacationsService();

        int actual = service.calculateVacMonths(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateAnotherVacationMonths() {
        VacationsService service = new VacationsService();

        int actual = service.calculateVacMonths(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);


    }


}
