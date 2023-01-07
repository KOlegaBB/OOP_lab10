package task_3;

public class Database extends БазаДаних{
    public String receiveUserData() {
        return super.отриматиДаніКористувача();
    }

    public String receiveStaticData() {
        return super.отриматиСтатистичніДані();
    }
}
