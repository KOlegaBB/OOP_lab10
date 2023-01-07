import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task_3.Authorisation;
import task_3.Database;

public class DatabaseTest {
    private Database db = new Database();

    @Test
    public void DatabaseTest1(){
        Assertions.assertEquals(db.receiveUserData(), "hello");
        Assertions.assertEquals(db.receiveStaticData(), "hello2");
    }

    @Test
    public void AuthorisationTest(){
        Authorisation authorisation = new Authorisation();
        Assertions.assertTrue(authorisation.authorise(db));
    }
}
