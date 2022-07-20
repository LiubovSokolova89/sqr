import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.services.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvSource({
            "200,600,10"
    })
    public void shouldCalculateHowManySquares(int min, int max, int expected) {
        SQRService service = new SQRService();
        int actual = service.calcSQR(min, max);


        Assertions.assertEquals(expected, actual);
    }

}
