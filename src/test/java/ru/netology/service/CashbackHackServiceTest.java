import ru.netology.service.CashbackHackService;

import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    void Cashback() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }
}
