package task_3;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Authorisation authorisation = new Authorisation();
        if (authorisation.authorise(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
