import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class VocationServiceTest {

    @Test
    public void test() {
        VocationService vocationService = new VocationService();

        int expected = 3;
        int actual = vocationService.calculateVocationMonth(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void test2() {
        VocationService vocationService = new VocationService();

        int expected = 2;
        int actual = vocationService.calculateVocationMonth(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}