package task_1;

import lombok.Getter;

@Getter
public class User {

    private final Database database = Database.getInstance();
    private int id;
    private String name;
    private String email;
    private int age;

    public User(int id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public void save(){
        database.save(this);
    }

    public static void main(String[] args) {
        User user_1 = new User(2, "Ivan", "ivan.ucu.edu.ua", 45);
        user_1.save();
    }
}
