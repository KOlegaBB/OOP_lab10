package task_1;

import java.sql.*;


public class Database {

    private static Database instance;

    private Database() {
        try {
            Class.forName("org.sqlite.JDBC");
            String dbURL = "jdbc:sqlite:users.db";
            Connection conn = DriverManager.getConnection(dbURL);
            try {
                String sql = "create table user (name varchar(20), email varchar(20), age varchar(20))";
                Statement statement = conn.createStatement();
                statement.executeUpdate(sql);
            } catch (Exception ex) {
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static Database getInstance(){
        if (Database.instance == null){
            Database.instance = new Database();
        }
        return Database.instance;
    }

    public void save(User user) {
        try {
            Class.forName("org.sqlite.JDBC");
            String dbURL = "jdbc:sqlite:users.db";
            Connection conn = DriverManager.getConnection(dbURL);
            PreparedStatement statement1 = conn.prepareStatement("insert into user values(?, ?, ?);");
            statement1.setString(1, user.getEmail());
            statement1.setString(2, user.getName());
            statement1.setInt(3, user.getAge());
            statement1.addBatch();
            conn.setAutoCommit(false);
            statement1.executeBatch();
            conn.setAutoCommit(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
