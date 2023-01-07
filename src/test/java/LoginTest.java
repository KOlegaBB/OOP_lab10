import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import task_2.Client;
import task_2.Country;
import task_2.Login;


public class LoginTest {

    @Test
    public void FacebookTest() {
        LocalDate cur_date = LocalDate.now();
        Client facebook_client = Login.login("yaroslav.klym@ucu.edu.ua", Country.Ukraine, cur_date,
                "facebook");
        Assertions.assertNotNull(facebook_client);
        Assertions.assertEquals(facebook_client.getEmail(), "yaroslav.klym@ucu.edu.ua");
        Assertions.assertEquals(facebook_client.getUserCountry(), "Ukraine");
        Assertions.assertEquals(facebook_client.getLastActiveTime(), cur_date.toString());
    }

    @Test
    public void TwitterTest() {
        LocalDate cur_date = LocalDate.now();
        Client twitter_client = Login.login("yaroslav.klym@ucu.edu.ua", Country.Ukraine, cur_date,
                "twitter");
        Assertions.assertNotNull(twitter_client);
        Assertions.assertEquals(twitter_client.getEmail(), "yaroslav.klym@ucu.edu.ua");
        Assertions.assertEquals(twitter_client.getUserCountry(), "Ukraine");
        Assertions.assertEquals(twitter_client.getLastActiveTime(), cur_date.toString());
    }

    @Test
    public void NullTest() {
        LocalDate cur_date = LocalDate.now();
        Client client = Login.login("yaroslav.klym@ucu.edu.ua", Country.Ukraine, cur_date,
                "anything");
        Assertions.assertNull(client);
    }

}

